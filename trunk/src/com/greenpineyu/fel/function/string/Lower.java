package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.string
 * 类名				Lower.java
 * 创建日期				Oct 28, 20101:17:06 PM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class Lower extends CommonFunction {

	private static final Lower lower;
	
	static {
		lower = new Lower();
	}
	
	private Lower(){}
	
	public static Lower getInstance(){
		return lower;
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null && arguments.length == 1){
			String str = NumberUtil.toString(arguments[0]);
			return str.toLowerCase();
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	public String getName() {
		return "lower";
	}

}
