package com.greenpineyu.fel.compile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

public class SourceGeneratorImpl implements SourceGenerator {
	
	private static String template;
	
	private static int count = 0;

	/**
	 * 包名
	 */
	static final String PACKAGE;

	static {
		String fullName = SourceGeneratorImpl.class.getName();
		PACKAGE = fullName.substring(0, fullName.lastIndexOf("."));
		
		StringBuilder sb = new StringBuilder();
		InputStream in = SourceGeneratorImpl.class
				.getResourceAsStream("java.template");
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
	}

	public JavaSource getSource(FelContext ctx, FelNode node) {
		String exp = node.toMethod(ctx).getCode();
		String className = getClassName();
		String src = buildsource(exp, className);
		JavaSource returnMe = new JavaSource();
		returnMe.setName(className);
		returnMe.setSource(src);
		returnMe.setPackageName(PACKAGE);
		return returnMe;
	}
	
	
	private String buildsource(String expression, String className) {
		String src = template.replaceAll("\\$\\{classname\\}", className);
		src = src.replaceAll("\\$\\{expression\\}", expression);
		return src;
	}
	
	private String getClassName() {
		String className = null;
		synchronized (SourceGeneratorImpl.class) {
			className = "Fel_" + count++;
		}
		return className;
	}


}
