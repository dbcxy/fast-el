package com.greenpineyu.fel.compile;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.FelEngineImpl;
import com.sun.tools.javac.Main;

public class FelCompilerImpl implements FelCompiler {
        /*
         * 用户编译的classpath
         */
        public  static final String CLASSPATH;
        
        /**
         * 包名
         */
        private static final String PACKAGE;
        /**
         * 源文件所在文件夹，包含包名
         */
        private static final String SRC_PACKAGE_DIR;
        /**
         * Class文件所在文件夹，包含包名
         */
        private static final String CLASS_PACKAGE_DIR;
        /**
         * class文件夹
         */
        private static final String CLASS_DIR;

        static {
        	String fullName = FelCompilerImpl.class.getName();
			PACKAGE=fullName.substring(0,fullName.lastIndexOf("."));
                CLASSPATH = getClassPath();
                String userDir = System.getProperty("user.dir");
                String baseDir = userDir+File.separator+"fel"+File.separator;
				CLASS_DIR =baseDir+"classes"+File.separator;
                SRC_PACKAGE_DIR =baseDir+"src"+File.separator+getPackage()+File.separator;
                CLASS_PACKAGE_DIR =CLASS_DIR+getPackage()+File.separator;
                createDir();
        }

        private static String getPath(Class<?> cls){
                String path = "";
                try {
                        URL location = cls.getProtectionDomain()
                        .getCodeSource().getLocation();
                        path = URLDecoder.decode(location.getFile(), "UTF-8");
                } catch (UnsupportedEncodingException e) {
                }
                return path;
        }
        
        private static String getClassPath(){
                /*
                 * 将三项添加到classpath
                 * 1:lib中的所有jar
                 * 2:class目录
                 * 3:系统属性："java.class.path"
                 */
                Class<?> cls = FelCompilerImpl.class;
                String path = getPath(cls);
                boolean isJar = path.endsWith(".jar");
                Set<String> cpSet = new HashSet<String>();
                if(isJar){
                        File jarFile = new File(path);
                        File lib = jarFile.getParentFile();
                        if(lib != null ){
                                 cpSet.addAll(getLibJars(jarFile.getParent()));
                                 String web_inf = lib.getParent();
                                 String classDir = web_inf+File.separator+"classes";
                                 File classDirfile = new File(classDir);
                                 if(classDirfile!=null && classDirfile.exists()){
                                         cpSet.add(classDir);
                                 }
                        }
                }else{
                        String classFullName = cls.getName().replaceAll("\\.", "/");
                        int index = path.lastIndexOf(classFullName+".class");
                        if(index != -1){
                                String classDir = path.substring(0,index);
                                cpSet.add(classDir);
                                File classDirFile = new File(classDir);
                                File web_inf = classDirFile.getParentFile();
                                String libDir = web_inf+File.separator+"lib";
                                cpSet.addAll(getLibJars(libDir));
                        }
                }
                String systemCp = System.getProperty("java.class.path");
                if(systemCp!=null){
                        String[] cps = systemCp.split(";");
                        if(cps!=null){
                                cpSet.addAll(Arrays.asList(cps));
                        }
                }
                String cpStr = "";
                for (String c : cpSet) {
                        cpStr+=c+";";
                }
                return cpStr;
        }
        
        private static Set<String> getLibJars(String libDir) {
                Set<String> jarPathSet = new HashSet<String>();
                File dir = new File(libDir);
                if(dir!=null && dir.isDirectory()){
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
        	loader = new FileClassLoader(FelCompilerImpl.class.getClassLoader(), CLASS_DIR);
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
        
        static private void createDir(){
        	new File(SRC_PACKAGE_DIR).mkdirs();
        	 new File(CLASS_DIR).mkdirs();
        }

        public Class<Expression> compile(String expr) {
                String className = getClassName();
                String file = SRC_PACKAGE_DIR + className + ".java";
                String source = buildsource(expr, className);
                writeJavaFile(file, source);
                
               String[] arg = new String[]{"-encoding", "UTF-8","-d",CLASS_DIR, file};
                if(StringUtils.isNotEmpty(CLASSPATH)){
                        arg = (String[]) ArrayUtils.add(arg, 0,CLASSPATH);
                        arg = (String[]) ArrayUtils.add(arg, 0,"-classpath");
                }
                int compile = Main.compile(arg);
                if(compile !=0){
                	return null;
                }
//              System.out.println(compile);
//                String replaceAll = getPackage().replaceAll("/", ".");
//                String fullName = replaceAll+className;
//              System.out.println(fullName);
                try {
                        @SuppressWarnings("unchecked")
                        Class<Expression> c = (Class<Expression>) loader.loadClass(PACKAGE+"."+className);
                        return c;
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                }finally{
                	clean(className);
                }
                return null;
        }
       private static ExecutorService exeService=Executors.newFixedThreadPool(1);
        
        private void clean(final String fileName){
        	if(exeService.isShutdown()){
        		exeService = Executors.newFixedThreadPool(1);
        	}
        	exeService.execute(new Runnable() {
				public void run() {
					String src = SRC_PACKAGE_DIR + fileName + ".java";
					String cls = CLASS_PACKAGE_DIR + fileName + ".class";
					deleteFile(src);
					deleteFile(cls);
				}

				private void deleteFile(String src) {
					File file = new File(src);
					if(file.exists()){
						file.delete();
					}
				}
			});
        	exeService.shutdown();
        }

		private void writeJavaFile(String file, String source) {
			OutputStreamWriter write =null;
			try {
			        BufferedOutputStream os;
			        os = new BufferedOutputStream( new FileOutputStream(file),500);
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
		}

        private static String getPackage() {
        	String sep = File.separator;
        	if(sep.equals("\\")){
        		sep ="\\\\";
        	}
        	String name = FelCompilerImpl.class.getName();
        	name = name.substring(0,name.lastIndexOf("."));
        	return name.replaceAll("\\.", sep);
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
                        FelEngineImpl fe = new FelEngineImpl();
                        Object r = fe.compiler("1+1", null).eval(null);
                        System.out.println("result:"+r);
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