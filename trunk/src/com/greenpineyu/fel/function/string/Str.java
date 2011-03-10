package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.string
 * 类名				Str.java
 * 创建日期				Oct 28, 20103:00:00 PM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class Str extends CommonFunction {

	private static final Str str;
	
	static {
		str = new Str();
	}
	
	private Str(){}
	
	public static Str getInstance(){
		return str;
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null && arguments.length == 1){
			String v = NumberUtil.toString(arguments[0]);
			return v;
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	public String getName() {
		return "str";
	}

}
