package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.string
 * 类名				Search.java
 * 创建日期				Oct 28, 20102:57:02 PM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class Search extends CommonFunction {

	private static final Search search;
	
	static{
		search = new Search();
	}
	
	private Search(){}
	
	public static Search getInstance(){
		return search;
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
		return str.toUpperCase().indexOf(s.toUpperCase());
	}
	
	private int indexOf(Object find,Object in,int i){
		try {
			String str = NumberUtil.toString(find);
			String s = NumberUtil.toString(in);
			return str.toUpperCase().indexOf(s.toUpperCase(), i-1);
		} catch (Exception e) {
		}
		return -1;
	}

	public String getName() {
		return "search";
	}

}
