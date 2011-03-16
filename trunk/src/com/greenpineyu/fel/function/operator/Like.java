package com.greenpineyu.fel.function.operator;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				.script.function.operator
 * 类名				Like.java
 * 创建日期				Nov 4, 20101:36:18 PM
 * 作者				
 * 版权				
 */
public class Like extends CommonFunction {

	private static final Like like;
	
	public static final String PERCENT = "%";
	
	static {
		like = new Like();
	}
	
	private Like(){}
	
	public static Like getInstance(){
		return like;
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null && arguments.length == 2){
			String value = NumberUtil.toString(arguments[0]);
			String pattern = NumberUtil.toString(arguments[1]);
			return like(value,pattern);
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	/**
	 * like函数
	 * @param value
	 * @param pattern
	 * @return
	 */
	private Object like(String value, String pattern) {
		boolean result = false;
		if(StringUtils.isNotBlank(value) && StringUtils.isNotBlank(pattern)){
			char[] pChar =  pattern.toCharArray();
			int count = 0;
			for(int i=0;i<pChar.length;i++){
				char c = pChar[i];
				if(c == '%'){
					count++;
				}
			}
			switch (count) {
			case 1:
				if(pattern.startsWith(PERCENT)){
					result = value.endsWith(pattern.substring(1));
				}else if(pattern.endsWith(PERCENT)){
					result = value.startsWith(pattern.substring(0, pattern.length()-1));
				}else{
					result = match(value,pattern);
				}
				break;
			default:
				result = match(value,pattern);
				break;
			}
			
		}
		return new Boolean(result);
	}

	/**
	 * 匹配字符串
	 * @param value
	 * @param pattern
	 * @return
	 */
	private boolean match(String value, String pattern) {
		pattern = escape(pattern);
		value = escape(value);
		StringBuffer sb = new StringBuffer();
		if(!pattern.startsWith("%")){
			sb.append("^");
		}
		String regex = pattern.replaceAll("%", ".*");
		sb.append(regex);
		if(!pattern.endsWith("%")){
			sb.append("$");
		}
		boolean result = Pattern.matches(sb.toString(), value);
		return result;
	}

	/**
	 * 转义字符串中的特殊字符
	 * @param value
	 * @return
	 */
	private String escape(String value){
		char[] chars = value.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<chars.length;i++){
			char c = chars[i];
			switch (c) {
			case '.':
				sb.append("\\.");
				break;
			case '\\':
				sb.append("\\\\");
				break;
			case '$':
				sb.append("\\$");
				break;
			case '^':
				sb.append("\\^");
				break;
			case '{':
				sb.append("\\{");
				break;
			case '}':
				sb.append("\\}");
				break;
			case '[':
				sb.append("\\[");
				break;
			case ']':
				sb.append("\\]");
				break;
			case '(':
				sb.append("\\(");
				break;
			case ')':
				sb.append("\\)");
				break;
			case '|':
				sb.append("\\|");
				break;
			case '*':
				sb.append("\\*");
				break;
			case '+':
				sb.append("\\+");
				break;
			case '?':
				sb.append("\\?");
				break;
			case '&':
				sb.append("\\&");
				break;
			default:
				sb.append(c);
				break;
			}
		}
		return sb.toString();
	}

	public String getName() {
		return "like";
	}

}
