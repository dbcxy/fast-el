package com.greenpineyu.fel.compile;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import com.greenpineyu.fel.Expression;
import com.sun.tools.javac.Main;

public class FelCompilerImpl implements FelCompiler {

	private static String template;

	private static ClassLoader loader;
	static {
		StringBuilder sb = new StringBuilder();
		InputStream in = FelCompilerImpl.class.getResourceAsStream("java.template");
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line).append("\r\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		template = sb.toString();
		
		loader = new FileClassLoader(FelCompilerImpl.class.getClassLoader(), getClassDir());
	}

	private static int count = 0;
	
	public Expression newInstance(String expr){
		 Class<Expression> compile = this.compile(expr);
		 try {
			return compile.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public Class<Expression> compile(String expr) {

		String className = getClassName();
		String source = buildsource(expr, className);
		String srcDir = "src";
		String folder = getPackagefolder(srcDir);
		String file = folder + className + ".java";
		
		
		OutputStreamWriter write =null;
		try {
			new File(folder).mkdirs();
			FileOutputStream os;
			os = new FileOutputStream(file);
			  write = new OutputStreamWriter(os,
					"utf-8");
			write.write(source);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(write!=null){
				try {
					write.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		String classDir = getClassDir();
		new File(classDir).mkdirs();
		int compile = Main.compile(new String[]{"-encoding", "UTF-8","-d", classDir, file});
		if(compile !=0){
			return null;
		}else{
			//FIXME 要删除java文件和class文件
			new File(file).deleteOnExit();
		}
//		System.out.println(compile);
		String replaceAll = getPackage().replaceAll("/", ".");
		String fullName = replaceAll+className;
//		System.out.println(fullName);
		try {
			@SuppressWarnings("unchecked")
			Class<Expression> c = (Class<Expression>) loader.loadClass(fullName);
			return c;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
//		System.getProperties().list(System.out);
		// FileWriter write = new FileWriter();
		// Main.compile(arg0)

		// JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

		// DiagnosticCollector<JavaFileObject> diagnostics =
		// new DiagnosticCollector<JavaFileObject>();
		//
		//
		// StandardJavaFileManager fileManager =
		// compiler.getStandardFileManager(diagnostics, null, null);
		//
		// JavaFileObject cu = new SimpleJavaFileObject
		// Iterable<? extends JavaFileObject> iter =
		// fileManager.getJavaFileObjectsFromStrings(Arrays.asList(new
		// String[]{source}));
		// for (JavaFileObject cu : iter) {
		// System.out.println(cu.getKind());
		// }
		// CompilationTask task = compiler.getTask(null, fileManager, null,
		// null, null, iter);
		// task.call();
		// // compiler.run(new ByteArrayInputStream(source.getBytes()), out,
		// err, arguments)
		// System.out.println(source);
	}

	static private String getClassDir() {
		String classesDir = "classes";
		String cdire = getFolder(classesDir);
		return cdire;
	}

	private static String getPackagefolder(String srcDir) {
		String dir = getFolder(srcDir);
		String folder = dir+getPackage();
		return folder;
	}

	private static String getFolder(String folder) {
		String userDir = System.getProperty("user.dir");
		return  userDir + "/fel/"+folder +"/";
	}

	private static String getPackage() {
		return "com/greenpineyu/fel/compile/";
	}

	private String buildsource(String expression, String className) {
		String src = template.replaceAll("\\$\\{classname\\}", className);
		src = src.replaceAll("\\$\\{expression\\}", expression);
		return src;
	}

	private String getClassName() {
		String className = null;
		synchronized (FelCompilerImpl.class) {
			className = "Fel_" + count++;
		}
		return className;
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		FelCompilerImpl c = new FelCompilerImpl();
		long start = System.currentTimeMillis();
		Class<Expression> compile = c.compile("\"中国\"+2");
		Object eval = compile.newInstance().eval(null);
		System.out.println(eval);
		long cost = System.currentTimeMillis()-start;
		System.out.println(cost);
	}
}
class FileClassLoader extends ClassLoader {
	private String dir;
//    public static final String drive = "d:/";
    public static final String fileType = ".class";
    public FileClassLoader(ClassLoader arg0,String dir) {
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
        }
        return data;
    }
//    public static void main(String[] args) throws Exception {
//        FileClassLoader loader = new FileClassLoader();
//        Class objClass = loader.loadClass("HelloWorld", true);
//        Object obj = objClass.newInstance();
//        System.out.println(objClass.getName());
//        System.out.println(objClass.getClassLoader());
//    }
}

