package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				
 * 类名				Upper.java
 * 创建日期				Oct 28, 20103:04:31 PM
 * 作者				
 * 版权				
 */
public class Upper extends CommonFunction {
	
	private static final Upper upper;
	
	static {
		upper = new Upper();
	}
	
	private Upper(){}
	
	public static Upper getInstance(){
		return upper;
	}

	public Object call(Object[] arguments) {
		if(arguments != null && arguments.length == 1){
			String str = NumberUtil.toString(arguments[0]);
			return str.toUpperCase();
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	public String getName() {
		return "upper";
	}

}
