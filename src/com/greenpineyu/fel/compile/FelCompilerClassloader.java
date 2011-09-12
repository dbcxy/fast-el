package com.greenpineyu.fel.compile;

import java.util.HashMap;
import java.util.Map;

import javax.tools.FileObject;

public final class FelCompilerClassloader extends ClassLoader {
	private final Map<String, FileObject> compileFileMap = new HashMap<String, FileObject>();

	public FelCompilerClassloader(ClassLoader parentClassLoader) {
		super(parentClassLoader);
	}


	@Override
	protected synchronized Class<?> findClass(String qualifiedClassName) throws ClassNotFoundException {
		FileObject file = compileFileMap.remove(qualifiedClassName);
		if (file != null) {
			byte[] bytes = ((FelJavaFileObject) file).getByteCode();
			return defineClass(qualifiedClassName, bytes, 0, bytes.length);
		}
		return super.findClass(qualifiedClassName);
	}

	public void add(String qualifiedClassName, final FileObject javaFile) {
		compileFileMap.put(qualifiedClassName, javaFile);
	}

}