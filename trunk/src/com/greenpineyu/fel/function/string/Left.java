package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.FunctionUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.string
 * 类名				Left.java
 * 创建日期				Oct 28, 20108:36:40 AM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class Left extends CommonFunction {

	private static final Left left;
	
	static {
		left = new Left();
	}
	
	private Left(){}
	
	public static Left getInstance(){
		return left;
	}
	
	public Object call(Object[] arguments) {
		try {
			if(arguments != null && arguments.length == 2){
				Object str = arguments[0];
				Object n = arguments[1];
				String s = FunctionUtil.toString(str);
				int l = FunctionUtil.toInteger(n);
				if(l >= s.length()){
					return s;
				}
				return s.substring(0, l);
			}
		} catch (Exception e) {
			throw new StringIndexOutOfBoundsException(e.getMessage());
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	public String getName() {
		return "left";
	}

}
