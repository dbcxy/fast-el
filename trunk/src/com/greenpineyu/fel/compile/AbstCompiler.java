package com.greenpineyu.fel.compile;

import java.io.File;
import java.io.FilenameFilter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.common.StringUtils;

public abstract class AbstCompiler implements FelCompiler {
	/*
	 * 用户编译的classpath
	 */
	public static final String CLASSPATH;

	/**
	 * class文件夹
	 */
	 static final String CLASS_DIR;

	private static final String BASE_DIR;
	static ClassLoader loader;
	static {
		CLASSPATH = getClassPath();
		String userDir = System.getProperty("user.dir");
		BASE_DIR = userDir + File.separator + "fel" + File.separator;
		CLASS_DIR = BASE_DIR + "classes" + File.separator;
		loader = new FileClassLoader(AbstCompiler.class.getClassLoader(),
				CLASS_DIR);
		createClassDir();
	}

	/**
	 * Class文件所在文件夹，包含包名
	 */
	 static String getClassPackageDir(String pack) {
		return CLASS_DIR + packageToPath(pack) + File.separator;
	}

	static String getSrcPackageDir(String pack) {
		return BASE_DIR + "src" + File.separator + packageToPath(pack)
				+ File.separator;
	}

	private static String getPath(Class<?> cls) {
		String path = "";
		try {
			URL location = cls.getProtectionDomain().getCodeSource()
					.getLocation();
			path = URLDecoder.decode(location.getFile(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
		}
		return path;
	}

	private static String getClassPath() {
		/*
		 * 将三项添加到classpath 1:lib中的所有jar 2:class目录 3:系统属性："java.class.path"
		 */
		Class<?> cls = AbstCompiler.class;
		String path = getPath(cls);
		boolean isJar = path.endsWith(".jar");
		Set<String> cpSet = new HashSet<String>();
		if (isJar) {
			File jarFile = new File(path);
			File lib = jarFile.getParentFile();
			if (lib != null) {
				cpSet.addAll(getLibJars(jarFile.getParent()));
				String web_inf = lib.getParent();
				String classDir = web_inf + File.separator + "classes";
				File classDirfile = new File(classDir);
				if (classDirfile != null && classDirfile.exists()) {
					cpSet.add(classDir);
				}
			}
		} else {
			String classFullName = cls.getName().replaceAll("\\.", "/");
			int index = path.lastIndexOf(classFullName + ".class");
			if (index != -1) {
				String classDir = path.substring(0, index);
				cpSet.add(classDir);
				File classDirFile = new File(classDir);
				File web_inf = classDirFile.getParentFile();
				String libDir = web_inf + File.separator + "lib";
				cpSet.addAll(getLibJars(libDir));
			}
		}
		String systemCp = System.getProperty("java.class.path");
		if (systemCp != null) {
			String[] cps = systemCp.split(File.pathSeparator);
			if (cps != null) {
				cpSet.addAll(Arrays.asList(cps));
			}
		}
		String cpStr = "";
		for (String c : cpSet) {
			cpStr += c + File.pathSeparator;
		}
		return cpStr;
	}

	private static Set<String> getLibJars(String libDir) {
		Set<String> jarPathSet = new HashSet<String>();
		File dir = new File(libDir);
		if (dir != null && dir.isDirectory()) {
			File[] files = dir.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.endsWith(".jar");
				}
			});
			for (int i = 0; i < files.length; i++) {
				File file = files[i];
				String absolutePath = file.getAbsolutePath();
				jarPathSet.add(absolutePath);
			}
		}
		return jarPathSet;
	}

	public Expression compile(JavaSource src) {
		Class<Expression> compile;
		try {
			compile = this.compileToClass(src);
			return compile.newInstance();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}finally{
			String className = src.getName();
			String pack = src.getPackageName();
			String srcPackageDir = getSrcPackageDir(pack);
			clean(srcPackageDir,getClassPackageDir(pack),className);
		}
		return null;
	}


	abstract Class<Expression> compileToClass(JavaSource expr)
			throws ClassNotFoundException;

	static void createClassDir() {
		new File(CLASS_DIR).mkdirs();
	}

	private static ExecutorService exeService = initThreadPool();

	private static ExecutorService initThreadPool() {
		return new ThreadPoolExecutor(0, 10, 5L, TimeUnit.SECONDS,
				new LinkedBlockingQueue<Runnable>());
	}

	void clean(final String srcPackageDir,
			final String classPackageDir, final String fileName) {
		if (exeService.isShutdown()) {
			exeService = initThreadPool();
		}
		exeService.execute(new Runnable() {
			public void run() {
				// 优先级设置成最低
				Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
				delFile(srcPackageDir, classPackageDir, fileName);
			}
		});
		// exeService.shutdown();
	}

	void delFile(final String srcPackageDir, final String classPackageDir,
			final String fileName) {
		String src = srcPackageDir + fileName + ".java";
		deleteFile(src);
		String cls = classPackageDir + fileName + ".class";
		deleteFile(cls);
	}

	void deleteFile(String src) {
		File file = new File(src);
		// System.out.println("delete file:"+src);
		if (file.exists()) {
			file.delete();
		}
	}


	List<String> getCompileOption() {
		List<String> options = new ArrayList<String>();
		options.add("-encoding");
		options.add("UTF-8");
		options.add("-d");
		options.add(CLASS_DIR);

		if (StringUtils.isNotEmpty(CLASSPATH)) {
			options.add("-classpath");
			options.add(CLASSPATH);
		}
		return options;
	}

	/**
	 * 将包名转换成包路径
	 * 
	 * @param packageName
	 * @return
	 */
	private static String packageToPath(String packageName) {
		String sep = File.separator;
		// if (sep.equals("\\")) {
		// sep = "\\\\";
		// }
		return StringUtils.replace(packageName, ".", sep);
		// return packageName.replaceAll("\\.", sep);
	}

}
