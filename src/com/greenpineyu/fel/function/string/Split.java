package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				
 * 类名				Split.java
 * 创建日期				Oct 28, 20102:53:16 PM
 * 作者				
 * 版权				
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
			String str = NumberUtil.toString(arguments[0]);
			String s = NumberUtil.toString(arguments[1]);
			return str.split(s);
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	public String getName() {
		return "split";
	}

}
