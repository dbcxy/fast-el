package com.greenpineyu.fel.compile;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import javax.tools.DiagnosticCollector;
import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import com.greenpineyu.fel.Expression;

public class FelCompiler16<T> implements FelCompiler {
	static final String JAVA_EXTENSION = ".java";
	private final FelCompilerClassloader classLoader;

	private final JavaCompiler compiler;

	private final List<String> options;

	private DiagnosticCollector<JavaFileObject> diagnostics;

	private final JavaFileManager javaFileManager;

	public FelCompiler16() {
		compiler = ToolProvider.getSystemJavaCompiler();

		if (compiler == null) {
			throw new IllegalStateException(
					"Cannot find the system Java compiler. "
							+ "Check that your class path includes tools.jar");
		}

		this.classLoader = new FelCompilerClassloader(this.getClass()
				.getClassLoader());
		diagnostics = new DiagnosticCollector<JavaFileObject>();
		final StandardJavaFileManager fileManager = compiler
				.getStandardFileManager(diagnostics, null, null);

		ClassLoader loader = this.classLoader.getParent();
		if (loader instanceof URLClassLoader
				&& (!loader.getClass().getName()
						.equals("sun.misc.Launcher$AppClassLoader"))) {
			try {
				URLClassLoader urlClassLoader = (URLClassLoader) loader;
				List<File> path = new ArrayList<File>();
				for (URL url : urlClassLoader.getURLs()) {
					File file = new File(url.getFile());
					path.add(file);
				}
				fileManager.setLocation(StandardLocation.CLASS_PATH, path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// javaFileManager = new JavaFileManagerImpl(fileManager, classLoader);
		javaFileManager = new ForwardingJavaFileManager<JavaFileManager>(
				fileManager) {
			 @Override
			 public JavaFileObject getJavaFileForOutput(Location location,
					String qualifiedName, Kind kind, FileObject outputFile)
			 throws IOException {
				// JavaFileObject file = new FelJavaFileObject(qualifiedName,
				// kind);
				// System.out.println(outputFile);
				// 由于编译成功后的bytecode需要放到file中，所以需要将file放到classloader中，以便读取bytecode生成Class对象.
				classLoader.add(qualifiedName, outputFile);
				return (JavaFileObject) outputFile;
			 }
		};
		this.options = new ArrayList<String>();
		// if (options != null) { // make a save copy of input options
		// for (String option : options) {
		// this.options.add(option);
		// }
		// }
	}

	public Expression compile(JavaSource src) {

		// Class<T> compile = compile(src.getName(), src.getSource(), null);
		Class<T> compile = compileToClass(src);
		try {
			return (Expression) compile.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*public synchronized Class<T> compile(final String className,
			final CharSequence javaSource,
			final DiagnosticCollector<JavaFileObject> diagnosticsList)
			throws ClassCastException {
		if (diagnosticsList != null) {
			diagnostics = diagnosticsList;
		} else {
			diagnostics = new DiagnosticCollector<JavaFileObject>();
		}

		Map<String, CharSequence> classes = new HashMap<String, CharSequence>(1);
		classes.put(className, javaSource);

		Map<String, Class<T>> compiled = compile(classes, diagnosticsList);
		Class<T> newClass = compiled.get(className);

		return newClass;
	}*/

	public synchronized Class<T> compileToClass(final JavaSource src) {
		List<JavaFileObject> compileSrcs = new ArrayList<JavaFileObject>();
		String className = src.getSimpleName();
		final FelJavaFileObject compileSrc = new FelJavaFileObject(className,
				src.getSource());
		compileSrcs.add(compileSrc);
		// javaFileManager.putFileForInput(StandardLocation.SOURCE_PATH,
		// src.getPackageName(), className + JAVA_EXTENSION, compileSrc);
		final CompilationTask task = compiler.getTask(null, javaFileManager,
				diagnostics, options, null, compileSrcs);
		final Boolean result = task.call();
		if (result == null || !result.booleanValue()) {
			// diagnostics.
			// 编译失败
			return null;
		}
		try {
			return loadClass(src.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*public synchronized Map<String, Class<T>> compile(
			final Map<String, CharSequence> classes,
			final DiagnosticCollector<JavaFileObject> diagnosticsList) {
		List<JavaFileObject> sources = new ArrayList<JavaFileObject>();
		for (Entry<String, CharSequence> entry : classes.entrySet()) {
			String qualifiedClassName = entry.getKey();
			CharSequence javaSource = entry.getValue();
			if (javaSource != null) {
				final int dotPos = qualifiedClassName.lastIndexOf('.');
				final String className = dotPos == -1 ? qualifiedClassName
						: qualifiedClassName.substring(dotPos + 1);
				final String packageName = dotPos == -1 ? ""
						: qualifiedClassName.substring(0, dotPos);
				final FelJavaFileObject source = new FelJavaFileObject(
						className, javaSource);
				sources.add(source);

				// javaFileManager.putFileForInput(StandardLocation.SOURCE_PATH,
				// packageName, className + JAVA_EXTENSION, source);
			}
		}

		// Get a CompliationTask from the compiler and compile the sources
		final CompilationTask task = compiler.getTask(null, javaFileManager,
				diagnostics, options, null, sources);
		final Boolean result = task.call();
		if (result == null || !result.booleanValue()) {
			// 编译失败
			return null;
		}

		try {
			// For each class name in the inpput map, get its compiled class and
			// put it in the output map
			Map<String, Class<T>> compiled = new HashMap<String, Class<T>>();
			for (String qualifiedClassName : classes.keySet()) {
				final Class<T> newClass = loadClass(qualifiedClassName);
				compiled.put(qualifiedClassName, newClass);
			}

			return compiled;
		} catch (ClassNotFoundException e) {
			return null;
		} catch (IllegalArgumentException e) {
			return null;
		} catch (SecurityException e) {
			return null;
		}
	}*/

	@SuppressWarnings("unchecked")
	public Class<T> loadClass(final String qualifiedClassName)
			throws ClassNotFoundException {
		return (Class<T>) classLoader.loadClass(qualifiedClassName);
	}

	// public ClassLoader getClassLoader() {
	// return javaFileManager.getClassLoader();
	// }

	static URI toUri(String name) {
		try {
			return new URI(name);
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}

}

/**
 * 用于编译的文件管理器
 * 
 * @author yuqingsong
 * 
 */

// final class JavaFileManagerImpl extends
// ForwardingJavaFileManager<JavaFileManager> {
// private final FelCompilerClassloader classloader;
//
// // private final Map<URI, JavaFileObject> compileSrc = new HashMap<URI,
// // JavaFileObject>();
//
// public JavaFileManagerImpl(JavaFileManager fileManager,
// FelCompilerClassloader classloader) {
// super(fileManager);
// this.classloader = classloader;
// }
//
// public ClassLoader getClassLoader() {
// return classloader;
// }
//
// /* @Override
// public FileObject getFileForInput(Location location, String packageName,
// String relativeName) throws IOException {
// // 源文件只使用一次
// FileObject o = compileSrc.get(uri(location, packageName,
// relativeName));
// if (o != null) {
// return o;
// }
// return super.getFileForInput(location, packageName, relativeName);
// }*/
//
// /**
// * 添加需要编译的文件
// *
// * @param location
// * @param packageName
// * @param relativeName
// * @param file
// */
// /*public void putFileForInput(StandardLocation location, String packageName,
// String relativeName, JavaFileObject file) {
// compileSrc.put(uri(location, packageName, relativeName), file);
// }*/
//
// private URI uri(Location location, String packageName, String relativeName) {
// return Compiler16.toUri(location.getName() + '/' + packageName + '/'
// + relativeName);
// }
//
// /*
// * 获取需要编译的源文件
// * @see
// javax.tools.ForwardingJavaFileManager#getJavaFileForOutput(javax.tools.JavaFileManager.Location,
// java.lang.String, javax.tools.JavaFileObject.Kind, javax.tools.FileObject)
// */
// @Override
// public JavaFileObject getJavaFileForOutput(Location location,
// String qualifiedName, Kind kind, FileObject outputFile)
// throws IOException {
// // JavaFileObject file = new FelJavaFileObject(qualifiedName, kind);
// // System.out.println(outputFile);
// // 由于编译成功后的bytecode需要放到file中，所以需要将file放到classloader中，以便读取bytecode生成Class对象.
// classloader.add(qualifiedName, outputFile);
// return (JavaFileObject) outputFile;
// }
//
// @Override
// public ClassLoader getClassLoader(JavaFileManager.Location location) {
// return classloader;
// }
//
// /*
// @Override
// public String inferBinaryName(Location loc, JavaFileObject file) {
// if (file instanceof FelJavaFileObject) {
// return file.getName();
// }
//
// return super.inferBinaryName(loc, file);
// }
// */
//
// /*@Override
// public Iterable<JavaFileObject> list(Location location, String packageName,
// Set<Kind> kinds, boolean recurse) throws IOException {
// Iterable<JavaFileObject> result = super.list(location, packageName,
// kinds, recurse);
//
// ClassLoader contextClassLoader = Thread.currentThread()
// .getContextClassLoader();
// List<URL> urlList = new ArrayList<URL>();
// Enumeration<URL> e = contextClassLoader.getResources("com");
// while (e.hasMoreElements()) {
// urlList.add(e.nextElement());
// }
//
// ArrayList<JavaFileObject> files = new ArrayList<JavaFileObject>();
//
// if (location == StandardLocation.CLASS_PATH
// && kinds.contains(JavaFileObject.Kind.CLASS)) {
// for (JavaFileObject file : fileObjects.values()) {
// if (file.getKind() == Kind.CLASS
// && file.getName().startsWith(packageName)) {
// files.add(file);
// }
// }
//
// files.addAll(classLoader.files());
// } else if (location == StandardLocation.SOURCE_PATH
// && kinds.contains(JavaFileObject.Kind.SOURCE)) {
// for (JavaFileObject file : fileObjects.values()) {
// if (file.getKind() == Kind.SOURCE
// && file.getName().startsWith(packageName)) {
// files.add(file);
// }
// }
// }
//
// for (JavaFileObject file : result) {
// files.add(file);
// }
//
// return files;
// }*/
// }
