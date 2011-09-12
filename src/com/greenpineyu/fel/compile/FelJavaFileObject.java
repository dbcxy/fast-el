package com.greenpineyu.fel.compile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

import javax.tools.SimpleJavaFileObject;

/**
 * 编译时，用于提供类源码和保存类的字节码
 * 
 * @author yuqingsong
 * 
 */
public class FelJavaFileObject extends SimpleJavaFileObject {

	// If kind == CLASS, this stores byte code from openOutputStream
	private final ByteArrayOutputStream byteCodeOs = new ByteArrayOutputStream();

	// if kind == SOURCE, this contains the source text
	private final CharSequence src;

	public FelJavaFileObject(final String baseName, final CharSequence source) {
		super(FelCompiler16.toUri(baseName + ".java"),
				Kind.SOURCE);
		this.src = source;
	}

	FelJavaFileObject(final String name, final Kind kind) {
		super(FelCompiler16.toUri(name), kind);
		src = null;
	}
	
	public FelJavaFileObject(URI uri, Kind kind) {
		 super (uri, kind);
		 src = null;
	 }

	@Override
	public CharSequence getCharContent(final boolean ignoreEncodingErrors) throws UnsupportedOperationException {
		if (src == null) {
			throw new UnsupportedOperationException();
		}
		
		return src;
	}

	@Override
	public InputStream openInputStream() {
		return new ByteArrayInputStream(getByteCode());
	}

	@Override
	public OutputStream openOutputStream() {
		return byteCodeOs;
	}

	byte[] getByteCode() {
		return byteCodeOs.toByteArray();
	}

}
