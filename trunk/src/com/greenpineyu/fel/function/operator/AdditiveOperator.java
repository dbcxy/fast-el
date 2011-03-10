package com.greenpineyu.fel.function.operator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.ArrayUtils;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.operator
 * 类名				AdditiveOperator.java
 * 创建日期				Oct 26, 201011:07:12 AM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class AdditiveOperator extends CommonFunction {

	private String operator;
	
	private AdditiveOperator(String operator) {
		this.operator = operator;
	}
	
	public static final String ADD_STR = "+";
	
	public static final String SUB_STR = "-";
	
	public static final AdditiveOperator ADD;
	
	public static final AdditiveOperator SUB;
	
	static {
		ADD = new AdditiveOperator(ADD_STR);
		SUB = new AdditiveOperator(SUB_STR);
	}

	public Object call(Object[] arguments) {
		if (arguments != null) {
			Object left = null;
			Object right = null;
			switch (arguments.length) {
				case 1:
					//对正负数的处理
					left = arguments[0];
					if (this == ADD) {
						return left;
					} else if (this == SUB) {
						return MultiplicativeOperator.multiply(new Integer(-1), left);
					}
					break;
				case 2:
					//对加减法的处理
					left = arguments[0];
					right = arguments[1];
					if (this == ADD) {
						return add(left, right);
					} else if (this == SUB) {
						return sub(left, right);
					}
					break;
			}
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	/**
	 * 加法
	 * @param left
	 * @param right
	 * @return
	 */
	public static Object add(Object left, Object right){
		if(left == null || right == null){
			throw new NullPointerException("调用add()方法出错！,原因：当前参数为空");
		}
		try {
			if (left instanceof Object[]){
				left = calArray(left);
			}
			if (right instanceof Object[]){
				right = calArray(right);
			}
			if (left.equals("∞") || right.equals("∞"))
				return "∞";
			
			if (NumberUtil.isFloatingPointNumber(left) || NumberUtil.isFloatingPointNumber(right)) {
				double l = NumberUtil.toDouble(left);
				double r = NumberUtil.toDouble(right);
				return new Double(l + r);
			}
			
			if(left instanceof BigInteger && right instanceof BigInteger){
				BigInteger l = NumberUtil.toBigInteger(left);
				BigInteger r = NumberUtil.toBigInteger(right);
				return l.add(r);
			}
			
			if(left instanceof BigDecimal || right instanceof BigDecimal){
				BigDecimal l = NumberUtil.toBigDecimal(left);
				BigDecimal r = NumberUtil.toBigDecimal(right);
				return l.add(r);
			}
			
			if (left instanceof String && right instanceof Date) {
				return left + DATE_FORMAT.format((Date) right);
			} else if (left instanceof Date && right instanceof String) {
				return DATE_FORMAT.format((Date) left) + right;
			}

			BigInteger l = NumberUtil.toBigInteger(left);
			BigInteger r = NumberUtil.toBigInteger(right);
			BigInteger result = l.add(r);
			return NumberUtil.narrowBigInteger(left, right, result);
		} catch (Exception e) {
			return NumberUtil.toString(left).concat(NumberUtil.toString(right));
		}
	}

	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * 计算对象数组
	 * @param obj
	 * @return
	 */
	public static Object calArray(Object obj) {
		if (!(obj instanceof Object[]))
			return obj;
		
		Object result = new Integer(0);
		if (!ArrayUtils.isEmpty((Object[])obj)){
			for (int i=0; i< ((Object[])obj).length;i++){
				result = add(result,((Object[])obj)[i]);
			}
		}
		return result;
	}

	/**
	 * 减法
	 * @param left
	 * @param right
	 * @return
	 */
	private static Object sub(Object left, Object right){
		if(left == null || right == null){
			throw new NullPointerException("调用sub()方法出错！,原因：当前参数为空");
		}
		try {
			if (left instanceof Object[]){
				left = calArray(left);
			}
			if (right instanceof Object[]){
				right = calArray(right);
			}
			if (left.equals("∞") || right.equals("∞"))
				return "∞";
			
			if (NumberUtil.isFloatingPointNumber(left) || NumberUtil.isFloatingPointNumber(right)) {
				double l = NumberUtil.toDouble(left);
				double r = NumberUtil.toDouble(right);
				return new Double(l - r);
			}
			
			if(left instanceof BigInteger && right instanceof BigInteger){
				BigInteger l = NumberUtil.toBigInteger(left);
				BigInteger r = NumberUtil.toBigInteger(right);
				return l.subtract(r);
			}
			
			if(left instanceof BigDecimal || right instanceof BigDecimal){
				BigDecimal l = NumberUtil.toBigDecimal(left);
				BigDecimal r = NumberUtil.toBigDecimal(right);
				return l.subtract(r);
			}
			
			BigInteger l = NumberUtil.toBigInteger(left);
			BigInteger r = NumberUtil.toBigInteger(right);
			BigInteger result = l.subtract(r);
			return NumberUtil.narrowBigInteger(left, right, result);
		} catch (Exception e) {
			throw new NumberFormatException("调用sub()方法出错！,原因：解析参数对象出错！");
		}
	}

	public String getName() {
		return this.operator;
	}

}
