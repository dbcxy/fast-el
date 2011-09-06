package com.greenpineyu.fel.compile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import com.greenpineyu.fel.Expression;
import com.sun.tools.javac.Main;

/**
 * jdk1.5环境的编译器实现类
 * 
 * @author yuqingsong
 * 
 */
public class FelCompiler15 extends AbstCompiler {
	

	 @Override
	Class<Expression> compileToClass(JavaSource src) throws ClassNotFoundException {
		String className = src.getSimpleName();
		String pack = src.getPackageName();
		String srcPackageDir = getSrcPackageDir(pack);
		String file = srcPackageDir  + className + ".java";
		new File(srcPackageDir).mkdirs();
		String source =src.getSource();
		writeJavaFile(file, source);

		List<String> opt = getCompileOption();
		opt.add(file);
		String[] arg = opt.toArray(new String[0]);
		
		int compile = Main.compile(arg);
			if (compile != 0) {
				return null;
			}
			@SuppressWarnings("unchecked")
			Class<Expression> c = (Class<Expression>) loader.loadClass(src.getName());
		return c;
	}
	 
	 void writeJavaFile(String file, String source) {
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

	



	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
	}
}
