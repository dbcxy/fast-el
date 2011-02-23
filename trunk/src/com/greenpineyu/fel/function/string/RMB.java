package com.greenpineyu.fel.function.string;

import com.greenpineyu.fel.common.FunctionUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.string
 * 类名				RMB.java
 * 创建日期				Oct 28, 20103:14:59 PM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class RMB extends CommonFunction {
	
	private static final RMB rmb;
	
	static {
		rmb = new RMB();
	}
	
	private RMB(){}
	
	public static RMB getInstance(){
		return rmb;
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null && arguments.length == 1){
			double num = FunctionUtil.toDouble(arguments[0]);
			return cleanZero(splitNum(roundString(num+"")));
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	/**
	 * 以小数点分隔开来
	 * @param s
	 * @return
	 */
	private String splitNum(String s) {
		if("".equals(s)) {
			return "";
		}
		int index = s.indexOf(".");
		String intOnly = s.substring(0, index);
		String part1 = this.numFormat(1, intOnly);
		String smallOnly = s.substring(index + 1);
		String part2 = this.numFormat(2, smallOnly);
		String newS = part1 + part2;
		return newS;
	}

	/**
	 * 把传入的数转换为中文金额大写形式
	 * @param flag
	 * @param s
	 * @return
	 */
	private String numFormat(int flag, String s) {
		int sLength = s.length();
		String bigLetter[] = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
		String unit[] = { "圆", "拾", "佰", "仟", "万",
				"拾", "佰", "仟",
				"亿", "拾", "佰", "仟", "万" };
		String small[] = { "分", "角" };
		String newS = "";
		for(int i = 0; i < sLength; i ++) {
			if(flag == 1) {
				newS = newS + bigLetter[s.charAt(i) - 48] + unit[sLength - i - 1];
			} else if(flag == 2) {
				newS = newS + bigLetter[s.charAt(i) - 48] + small[sLength - i - 1];
			}
		}
		return newS;
	}

	/**
	 * 对于传入数据进行四舍五入操作
	 * @param s
	 * @return
	 */
	private String roundString(String s) {
		if("".equals(s)) {
			return "";
		}
		double d = Double.parseDouble(s);
		d = (d * 100 + 0.5) / 100;
		s = new java.text.DecimalFormat("##0.000").format(d);
		int index = s.indexOf(".");
		String intOnly = s.substring(0, index);
		if(intOnly.length() > 13) {
			return "";
		}
		String smallOnly = s.substring(index + 1);
		if(smallOnly.length() > 2) {
			String roundSmall = smallOnly.substring(0, 2);
			s = intOnly + "." + roundSmall;
		}
		return s;
	}
	
	private String cleanZero(String s) {
		if("".equals(s)) {
			return "";
		}
		while (s.charAt(0) == '零') {
			s = s.substring(2);
			if(s.length() == 0) {
				return "零";
			}
		}
		String regex1[] = { "零仟", "零佰", "零拾" };
		String regex2[] = { "零亿", "零万", "零圆" };
		String regex3[] = { "亿", "万", "圆" };
		String regex4[] = { "零角", "零分" };
		for(int i = 0; i < 3; i ++) {
			s = s.replaceAll(regex1[i], "零");
		}
		for(int i = 0; i < 3; i ++) {
			s = s.replaceAll("零零零", "零");
			s = s.replaceAll("零零", "零");
			s = s.replaceAll(regex2[i], regex3[i]);
		}
		for(int i = 0; i < 2; i ++) {
			s = s.replaceAll(regex4[i], "");
		}
		s = s.replaceAll("亿万", "亿");
		return s;
	}

	public String getName() {
		return "RMB";
	}

}
