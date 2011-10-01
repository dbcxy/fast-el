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
import com.greenpineyu.fel.exception.CompileException;

public class FelCompiler16<T> implements FelCompiler {
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

		javaFileManager = new ForwardingJavaFileManager<JavaFileManager>(
				fileManager) {
			 @Override
			 public JavaFileObject getJavaFileForOutput(Location location,
					String qualifiedName, Kind kind, FileObject outputFile)
			 throws IOException {
				// 由于编译成功后的bytecode需要放到file中，所以需要将file放到classloader中，以便读取bytecode生成Class对象.
				classLoader.add(qualifiedName, outputFile);
				return (JavaFileObject) outputFile;
			 }
		};
		this.options = new ArrayList<String>();
		// this.options.add("-O");
	}

	@Override
	public Expression compile(JavaSource src) {

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


	public synchronized Class<T> compileToClass(final JavaSource src) {
		List<JavaFileObject> compileSrcs = new ArrayList<JavaFileObject>();
		String className = src.getSimpleName();
		final FelJavaFileObject compileSrc = new FelJavaFileObject(className,
				src.getSource());
		compileSrcs.add(compileSrc);
		final CompilationTask task = compiler.getTask(null, javaFileManager,
				diagnostics, options, null, compileSrcs);
		final Boolean result = task.call();
		if (result == null || !result.booleanValue()) {
			// diagnostics.
			// 编译失败
			// diagnostics.getDiagnostics()
			throw new CompileException(src.getSource() + "\n"
					+ diagnostics.getDiagnostics().toString());
		}
		try {
			return loadClass(src.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public Class<T> loadClass(final String qualifiedClassName)
			throws ClassNotFoundException {
		return (Class<T>) classLoader.loadClass(qualifiedClassName);
	}

	static URI toUri(String name) {
		try {
			return new URI(name);
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}

}

