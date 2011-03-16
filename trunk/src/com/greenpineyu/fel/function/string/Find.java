package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				
 * 类名				Find.java
 * 创建日期				Oct 27, 201010:42:31 AM
 * 作者				
 * 版权				
 */
public class Find extends CommonFunction {

	private static final Find find;
	
	private Find(){
		
	}
	
	static {
		find = new Find();
	}
	
	public static Find getInstance(){
		return find;
	}
	
	public Object call(Object[] arguments) {
		int result = -1;
		if(arguments != null){
			if(arguments.length == 2){
				Object find = arguments[1];
				Object in = arguments[0];
				result = indexOf(find, in);
			}else if(arguments.length ==3){
				Object find = arguments[1];
				Object in = arguments[0];
				Object start = arguments[2];
				int i = NumberUtil.toInteger(start);
				if(i < 1){
					i = 1;
				}
				result = indexOf(find, in, i);
			}
			result += 1;
			return new Integer(result);
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}
	
	private int indexOf(Object find,Object in){
		String str = NumberUtil.toString(find);
		String s = NumberUtil.toString(in);
		return str.indexOf(s);
	}
	
	private int indexOf(Object find,Object in,int start){
		try {
			String str = NumberUtil.toString(find);
			String s = NumberUtil.toString(in);
			return str.indexOf(s, start-1);
		} catch (Exception e) {
		}
		return -1;
	}

	public String getName() {
		return "find";
	}

}
