package com.greenpineyu.fel.function.logic;

import com.greenpineyu.fel.common.FunctionUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.logic
 * 类名				If.java
 * 创建日期				Nov 1, 20102:28:15 PM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class If extends CommonFunction {
	private static final If _if ;
	
	static {
		_if = new If();
	}
	
	private If(){}
	
	public static If getInstance(){
		return _if;
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null && arguments.length >= 2){
			int length = arguments.length;
			Object defaultValue = null;
			if(length % 2 != 0){
				defaultValue = arguments[length - 1];
				length = length - 1;
			}
			for(int i=0;i<length;i=i+2){
				boolean logic = FunctionUtil.toBoolean(arguments[i]);
				if(logic){
					return arguments[i+1];
				}
			}
			return defaultValue;
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	public String getName() {
		return "if";
	}

}
