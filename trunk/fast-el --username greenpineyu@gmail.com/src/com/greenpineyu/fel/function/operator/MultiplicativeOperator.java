package com.greenpineyu.fel.function.operator;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.greenpineyu.fel.common.FunctionUtil;
import com.greenpineyu.fel.exception.EvalException;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.operator
 * 类名				MultiplicativeOperator.java
 * 创建日期				Oct 26, 20102:47:15 PM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class MultiplicativeOperator extends CommonFunction {

	private String operator;
	
	private MultiplicativeOperator(String operator) {
		this.operator = operator;
	}
	
	public static final String MUL_STR = "*";
	
	public static final String DIV_STR = "/";
	
	public static final String MOD_STR = "%";
	
	public static final MultiplicativeOperator MUL;
	
	public static final MultiplicativeOperator DIV;
	
	public static final MultiplicativeOperator MOD;
	
	static {
		MUL = new MultiplicativeOperator(MUL_STR);
		DIV = new MultiplicativeOperator(DIV_STR);
		MOD = new MultiplicativeOperator(MOD_STR);
	}
	
	public Object call(Object[] arguments) {
		if(arguments != null && arguments.length == 2){
			Object left = arguments[0];
			Object right = arguments[1];
			if(this == MUL){
				return multiply(left, right);
			}else if(this == DIV){
				return divide(left, right);
			}else if(this == MOD){
				return mod(left, right);
			}
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	/**
	 * 乘法
	 * @param left
	 * @param right
	 * @return
	 */
	public static Object multiply(Object left, Object right) {
        if (left == null || right == null) {
			throw new NullPointerException("调用multiply()方法出错！,原因：当前参数为空");
        }
        try {
        	if (left instanceof Object[]){
				left = AdditiveOperator.calArray(left);
			}
			if (right instanceof Object[]){
				right = AdditiveOperator.calArray(right);
			}
			if (left.equals("∞") || right.equals("∞"))
				return "∞";
			
			if (FunctionUtil.isFloatingPointNumber(left) || FunctionUtil.isFloatingPointNumber(right)) {
			    double l = FunctionUtil.toDouble(left);
			    double r = FunctionUtil.toDouble(right);
			    return new Double(l * r);
			}
			if (left instanceof BigInteger && right instanceof BigInteger) {
			    BigInteger l = FunctionUtil.toBigInteger(left);
			    BigInteger r = FunctionUtil.toBigInteger(right);
			    return l.multiply(r);
			}
			if (left instanceof BigDecimal || right instanceof BigDecimal) {
			    BigDecimal l = FunctionUtil.toBigDecimal(left);
			    BigDecimal r = FunctionUtil.toBigDecimal(right);
			    return l.multiply(r);
			}
			BigInteger l = FunctionUtil.toBigInteger(left);
			BigInteger r = FunctionUtil.toBigInteger(right);
			BigInteger result = l.multiply(r);
			return FunctionUtil.narrowBigInteger(left, right, result);
		} catch (Exception e) {
			throw new NumberFormatException("调用multiply()方法出错！,原因：解析参数对象出错！");
		}
    }

	/**
	 * 除法
	 * @param left
	 * @param right
	 * @return
	 */
	public static Object divide(Object left, Object right) {
        if (left == null || right == null) {
			throw new NullPointerException("调用divide()方法出错！,原因：当前参数为空");
        }
        try {
        	if (left instanceof Object[]){
				left = AdditiveOperator.calArray(left);
			}
			if (right instanceof Object[]){
				right = AdditiveOperator.calArray(right);
			}
			if (left.equals("∞") || right.equals("∞")) {
				return "∞";
			}
        	
			if (FunctionUtil.isFloatingPointNumber(left) || FunctionUtil.isFloatingPointNumber(right)) {
			    double l = FunctionUtil.toDouble(left);
			    double r = FunctionUtil.toDouble(right);
			    if (r == 0.0) {
//			        throw new ArithmeticException("/");
					return "∞"; // 被除数是零时返回无穷大
			    }
			    return new Double(l / r);
			}
			if (left instanceof Integer && right instanceof Integer || left instanceof Long && right instanceof Long) {
				Number r = (Number) right;
				if (r.intValue() == 0) {
					return "∞";
				}
				Number l = (Number) left;
				return new Double(l.doubleValue() / r.intValue());
			}
			if (left instanceof BigInteger && right instanceof BigInteger) {
			    BigInteger l = FunctionUtil.toBigInteger(left);
			    BigInteger r = FunctionUtil.toBigInteger(right);
			    return l.divide(r);
			}
			//默认使用浮点运算,使用整型运算会导致略去小数位的问题
			//			if (left instanceof BigDecimal || right instanceof BigDecimal) {
			    BigDecimal l = FunctionUtil.toBigDecimal(left);
			    BigDecimal r = FunctionUtil.toBigDecimal(right);
			    BigDecimal d = l.divide(r,8,BigDecimal.ROUND_DOWN);
			    return d;
			//			}
			//			BigInteger l = FunctionUtil.toBigInteger(left);
			//			BigInteger r = FunctionUtil.toBigInteger(right);

			//			BigInteger result = l.divide(r);
			//			return FunctionUtil.narrowBigInteger(left, right, result);
		} catch (Exception e) {
			throw new EvalException(left + "/" + right + "运算出错", e);
		}
    }

	/**
	 * 除于
	 * @param left
	 * @param right
	 * @return
	 */
	private Object mod(Object left, Object right) {
        if (left == null || right == null) {
			throw new NullPointerException("调用mod()方法出错！,原因：当前参数为空");
        }
        try {
        	if (left instanceof Object[]){
				left = AdditiveOperator.calArray(left);
			}
			if (right instanceof Object[]){
				right = AdditiveOperator.calArray(right);
			}
			if (left.equals("∞") || right.equals("∞"))
				return "∞";
			
			if (FunctionUtil.isFloatingPointNumber(left) || FunctionUtil.isFloatingPointNumber(right)) {
			    double l = FunctionUtil.toDouble(left);
			    double r = FunctionUtil.toDouble(right);
			    if (r == 0.0) {
			        throw new ArithmeticException("%");
			    }
			    return new Double(l % r);
			}
			if (left instanceof BigInteger && right instanceof BigInteger) {
			    BigInteger l = FunctionUtil.toBigInteger(left);
			    BigInteger r = FunctionUtil.toBigInteger(right);
			    return l.mod(r);
			}
			if (left instanceof BigDecimal || right instanceof BigDecimal) {
			    BigDecimal l = FunctionUtil.toBigDecimal(left);
			    BigDecimal r = FunctionUtil.toBigDecimal(right);
			    BigDecimal remainder = l.subtract(l.divide(r,BigDecimal.ROUND_DOWN).multiply(r));
			    return remainder;
			}
			BigInteger l = FunctionUtil.toBigInteger(left);
			BigInteger r = FunctionUtil.toBigInteger(right);
			BigInteger result = l.mod(r);
			return FunctionUtil.narrowBigInteger(left, right, result);
		} catch (Exception e) {
			throw new NumberFormatException("调用mod()方法出错！,原因：解析参数对象出错！");
		}
    }

	public String getName() {
		return this.operator;
	}

}
