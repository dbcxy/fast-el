package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.FunctionUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.string
 * 类名				Split.java
 * 创建日期				Oct 28, 20102:53:16 PM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class Split extends CommonFunction {

	private static final Split split;
	
	static {
		split = new Split();
	}
	
	private Split(){}
	
	public static Split getInstance(){
		return split;
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null && arguments.length == 2){
			String str = FunctionUtil.toString(arguments[0]);
			String s = FunctionUtil.toString(arguments[1]);
			return str.split(s);
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	public String getName() {
		return "split";
	}

}
