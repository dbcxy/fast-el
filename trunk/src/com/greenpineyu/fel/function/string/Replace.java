package com.greenpineyu.fel.function.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				
 * 类名				Replace.java
 * 创建日期				Oct 28, 20102:33:35 PM
 * 作者				
 * 版权				
 */
public class Replace extends CommonFunction {

	private static final Replace replace;
	
	static {
		replace = new Replace();
	}
	
	private Replace(){}
	
	public static Replace getInstance(){
		return replace;
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null){
			if(arguments.length == 3){
				String str = NumberUtil.toString(arguments[0]);
				String oldStr = NumberUtil.toString(arguments[1]);
				String newStr = NumberUtil.toString(arguments[2]);
				return str.replaceAll(oldStr, newStr);
			}else if(arguments.length == 4){
				String str = NumberUtil.toString(arguments[0]);
				String oldStr = NumberUtil.toString(arguments[1]);
				String newStr = NumberUtil.toString(arguments[2]);
				int n = NumberUtil.toInteger(arguments[3]);
				return replacePosition(str, oldStr, newStr, n);
			}
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	/**
	 * 替换指定位置的字符串
	 * @param str
	 * @param oldStr
	 * @param newStr
	 * @param n
	 * @return
	 */
	private Object replacePosition(String str, String oldStr, String newStr, int n) {
		StringBuffer sb = new StringBuffer(str);
		Matcher matcher = Pattern.compile(oldStr).matcher(sb);
		int index = 0;
		int i = 0;
		while(matcher.find(index)){
			i++;
			if(i == n){
				sb.replace(matcher.start(), matcher.end(), newStr);
			}
			index = matcher.end();
			matcher.reset();
		}
		return sb.toString();
	}

	public String getName() {
		return "replace";
	}

}
