package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.FunctionUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.string
 * 类名				Right.java
 * 创建日期				Oct 28, 20101:49:28 PM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class Right extends CommonFunction {

	private static final Right right;
	
	static {
		right = new Right();
	}
	
	private Right(){}
	
	public static Right getInstance(){
		return right;
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null && arguments.length == 2){
			String str = FunctionUtil.toString(arguments[0]);
			int n = FunctionUtil.toInteger(arguments[1]);
			if(n >= str.length()){
				return str;
			}else{
				return str.substring(str.length() - n);
			}
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	public String getName() {
		return "right";
	}

}
