package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.FunctionUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.string
 * 类名				Mid.java
 * 创建日期				Oct 28, 20101:38:43 PM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class Mid extends CommonFunction {
	
	private static final Mid mid;
	
	static {
		mid = new Mid();
	}
	
	private Mid(){}
	
	public static Mid getInstance(){
		return mid;
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null){
			if(arguments.length == 2){
				String str = FunctionUtil.toString(arguments[0]);
				int start = FunctionUtil.toInteger(arguments[1]);
				return str.substring(start-1);
			}else if(arguments.length == 3){
				String str = FunctionUtil.toString(arguments[0]);
				int start = FunctionUtil.toInteger(arguments[1]);
				int end = FunctionUtil.toInteger(arguments[2]);
				int endIndex = start+end-1;
				if (endIndex >= str.length()) {
					return str.substring(start-1);
				}
				return str.substring(start-1, endIndex);
			}
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	public String getName() {
		return "mid";
	}

}
