package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				
 * 类名				Ltrim.java
 * 创建日期				Oct 28, 20101:31:02 PM
 * 作者				
 * 版权				
 */
public class Ltrim extends CommonFunction {

	private static final Ltrim ltrim;
	
	static {
		ltrim = new Ltrim();
	}
	
	private Ltrim(){}
	
	public static Ltrim getInstance(){
		return ltrim;
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null && arguments.length == 1){
			String str = NumberUtil.toString(arguments[0]);
			int len = str.length();
			int st = 0;
			char[] cs = str.toCharArray();
			while ((0 < len) && (cs[st] <= ' ')) {
				st++;
			}
			str = str.substring(st);
			return str;
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	public String getName() {
		return "ltrim";
	}

}
