package com.greenpineyu.fel.compile;

import java.util.HashMap;
import java.util.Map;

import javax.tools.FileObject;

public final class FelCompilerClassloader extends ClassLoader {
	private final Map<String, FileObject> compileFileMap = new HashMap<String, FileObject>();

	public FelCompilerClassloader(ClassLoader parentClassLoader) {
		super(parentClassLoader);
	}

	//
	// public Collection<FileObject> files() {
	// return Collections.unmodifiableCollection(compileFileMap.values());
	// }
	//
	// public void clearCache() {
	// this.compileFileMap.clear();
	// }

	@Override
	protected synchronized Class<?> findClass(String qualifiedClassName) throws ClassNotFoundException {
		FileObject file = compileFileMap.remove(qualifiedClassName);
		if (file != null) {
			byte[] bytes = ((FelJavaFileObject) file).getByteCode();
			return defineClass(qualifiedClassName, bytes, 0, bytes.length);
		}
		

		// try {
		// return Class.forName(qualifiedClassName);
		// } catch (ClassNotFoundException nf) {
		// // Ignore and fall through
		// }
		//
		// try {
		// return
		// Thread.currentThread().getContextClassLoader().loadClass(qualifiedClassName);
		// } catch (ClassNotFoundException nf) {
		// // Ignore and fall through
		// }
		
		return super.findClass(qualifiedClassName);
	}

	public void add(String qualifiedClassName, final FileObject javaFile) {
		compileFileMap.put(qualifiedClassName, javaFile);
	}

	/*
	 * @Override public InputStream getResourceAsStream(final String name) { if
	 * (name.endsWith(".class")) { String qualifiedClassName = name.substring(0,
	 * name.length() - ".class".length()).replace('/', '.'); FelJavaFileObject
	 * file = (FelJavaFileObject) compileFileMap .get(qualifiedClassName);
	 * 
	 * if (file != null) { return new ByteArrayInputStream(file.getByteCode());
	 * } }
	 * 
	 * return super.getResourceAsStream(name); }
	 */
}