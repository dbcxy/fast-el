package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				
 * 类名				Len.java
 * 创建日期				Oct 28, 201010:58:23 AM
 * 作者				
 * 版权				
 */
public class Len extends CommonFunction {

	private static final Len len;
	
	static {
		len = new Len();
	}
	
	private Len(){}
	
	public static Len getInstance(){
		return len;
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null && arguments.length == 1){
			String str = NumberUtil.toString(arguments[0]);
			return new Integer(str.length());
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	public String getName() {
		return "len";
	}
	
}
