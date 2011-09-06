package com.greenpineyu.fel.compile;

import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import com.greenpineyu.fel.Expression;

public class FelCompiler16 extends AbstCompiler {

	 @Override
	Class<Expression> compileToClass(JavaSource src)
			throws ClassNotFoundException {
		List<String> options = getCompileOption();
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(
				null, null, null);
		JavaFileObject javaFileObject = createJavaFileObject(src.getName(),
				src.getSource());
		Iterable<? extends JavaFileObject> files = Arrays
				.asList(javaFileObject);
		JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager,
				null, options, null, files);
		Boolean result = task.call();
		if (!result) {
			return null;
		}
		@SuppressWarnings("unchecked")
		Class<Expression> c = (Class<Expression>) loader.loadClass(src
				.getName());
		return c;
	}

	/*
	 * 没有产生 java文件，所以不需要删除java文件
	 * 
	 * @see com.greenpineyu.fel.compile.AbstCompiler#delFile(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	void delFile(final String srcPackageDir, final String classPackageDir,
			final String fileName) {
		String cls = classPackageDir + fileName + ".class";
		deleteFile(cls);
	}

	private static SimpleJavaFileObject createJavaFileObject(String className,
			String contents) {
		StringObject so = null;
		try {
			so = new StringObject(className, contents);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return so;
	}
}

class StringObject extends SimpleJavaFileObject {
	private String contents = null;

	public StringObject(String className, String contents) throws Exception {
		super(new URI(className), Kind.SOURCE);
		this.contents = contents;
	}

	@Override
	public CharSequence getCharContent(boolean ignoreEncodingErrors)
			throws IOException {
		return contents;
	}

	@Override
	public boolean isNameCompatible(String simpleName, Kind kind) {
		return true;
	}
}