package com.greenpineyu.fel.compile;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import com.greenpineyu.fel.Expression;
import com.sun.tools.javac.Main;

public class FelCompilerImpl implements FelCompiler {
	/*
	 * 用户编译的classpath
	 */
	public static final String CLASSPATH;

	/**
	 * class文件夹
	 */
	private static final String CLASS_DIR;
	
	private static final String BASE_DIR;
	private static ClassLoader loader;
	static {
		CLASSPATH = getClassPath();
		String userDir = System.getProperty("user.dir");
		BASE_DIR = userDir + File.separator + "fel" + File.separator;
		CLASS_DIR = BASE_DIR + "classes" + File.separator;
		loader = new FileClassLoader(FelCompilerImpl.class.getClassLoader(),
				CLASS_DIR);
	}

	/**
	 * Class文件所在文件夹，包含包名
	 */
	private static String getClassPackageDir(String pack) {
		return CLASS_DIR + packageToPath(pack) + File.separator;
	}

	private static String getSrcPackageDir(String pack) {
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
		Class<?> cls = FelCompilerImpl.class;
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
			String[] cps = systemCp.split(";");
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


	public Expression compile(JavaSource expr) {
		Class<Expression> compile = this.compileToClass(expr);
		try {
			return compile.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	static private void createDir(String srcPackageDir) {
		new File(srcPackageDir).mkdirs();
		new File(CLASS_DIR).mkdirs();
	}

	private Class<Expression> compileToClass(JavaSource src) {
		String className = src.getName();
		String pack = src.getPackageName();
		String srcPackageDir = getSrcPackageDir(pack);
		String file = srcPackageDir  + className + ".java";
		createDir(srcPackageDir);
		String source =src.getSource();
		writeJavaFile(file, source);

		String[] arg = new String[] { "-encoding", "UTF-8", "-d", CLASS_DIR,
				file };
		if (StringUtils.isNotEmpty(CLASSPATH)) {
			arg = (String[]) ArrayUtils.add(arg, 0, CLASSPATH);
			arg = (String[]) ArrayUtils.add(arg, 0, "-classpath");
		}
		int compile = Main.compile(arg);
		try {
			if (compile != 0) {
				return null;
			}
			@SuppressWarnings("unchecked")
			Class<Expression> c = (Class<Expression>) loader.loadClass(pack
					+ "." + className);
			return c;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			clean(srcPackageDir,getClassPackageDir(pack),className);
		}
		return null;
	}

	private static ExecutorService exeService = initThreadPool() ;

	private static ExecutorService initThreadPool() {
		return new ThreadPoolExecutor(0, 10,
		  5L, TimeUnit.SECONDS,
		  new SynchronousQueue<Runnable>());
	}

	private void clean(final String srcPackageDir,final String classPackageDir,final String fileName) {
		if (exeService.isShutdown()) {
			exeService = initThreadPool();
		}
		exeService.execute(new Runnable() {
			public void run() {
				//优先级设置成最低
				Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
//				try {
//					Thread.sleep(10*1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				String src = srcPackageDir + fileName + ".java";
				String cls = classPackageDir + fileName + ".class";
				deleteFile(src);
				deleteFile(cls);
			}

			private void deleteFile(String src) {
				File file = new File(src);
//				System.out.println("delete file:"+src);
				if (file.exists()) {
					file.delete();
				}
			}
		});
//		exeService.shutdown();
	}

	private void writeJavaFile(String file, String source) {
		OutputStreamWriter write = null;
		try {
			BufferedOutputStream os;
			os = new BufferedOutputStream(new FileOutputStream(file), 500);
			write = new OutputStreamWriter(os, "utf-8");
			write.write(source);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (write != null) {
				try {
					write.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 将包名转换成包路径
	 * @param packageName
	 * @return
	 */
	private static String packageToPath(String packageName) {
		String sep = File.separator;
//		if (sep.equals("\\")) {
//			sep = "\\\\";
//		}
		return StringUtils.replace(packageName, ".", sep);
//		return packageName.replaceAll("\\.", sep);
	}




	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		FelCompilerImpl c = new FelCompilerImpl();
		long start = System.currentTimeMillis();
	}
}

class FileClassLoader extends ClassLoader {
	private String dir;
	public static final String fileType = ".class";

	public FileClassLoader(ClassLoader arg0, String dir) {
		super(arg0);
		this.dir = dir;
	}

	public Class<?> findClass(String name) {
		byte[] data = loadClassData(name);
		return defineClass(name, data, 0, data.length);
	}

	public byte[] loadClassData(String name) {
		name = name.replaceAll("\\.", "/");
		FileInputStream fis = null;
		byte[] data = null;
		try {
			fis = new FileInputStream(new File(dir + name + fileType));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int ch = 0;
			while ((ch = fis.read()) != -1) {
				baos.write(ch);
			}
			data = baos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fis!= null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return data;
	}
	// public static void main(String[] args) throws Exception {
	// FileClassLoader loader = new FileClassLoader();
	// Class objClass = loader.loadClass("HelloWorld", true);
	// Object obj = objClass.newInstance();
	// System.out.println(objClass.getName());
	// System.out.println(objClass.getClassLoader());
	// }

}