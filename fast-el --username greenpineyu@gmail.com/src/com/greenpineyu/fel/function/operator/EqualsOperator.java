package com.greenpineyu.fel.function.operator;

import java.math.BigDecimal;

import com.greenpineyu.fel.antlr.AstNode;
import com.greenpineyu.fel.common.FunctionUtil;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.Function;
import com.greenpineyu.fel.function.TolerantFunction;

/**
 * 包名				com.datanew.excel.script.function.operator
 * 类名				EqualsOperator.java
 * 创建日期				Oct 25, 20104:54:53 PM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class EqualsOperator implements Function {
	
	private String operator;
	
	private EqualsOperator(String operator) {
		this.operator = operator;
	}
	
	public static final String EQUAL_STR = "==";
	
	public static final String NOEQUAL_STR = "!=";
	
	public static final EqualsOperator EQUAL;
	
	public static final EqualsOperator NOEQUAL;
	
	static{
		EQUAL = new EqualsOperator(EQUAL_STR);
		NOEQUAL = new EqualsOperator(NOEQUAL_STR);
	}

	public String getName() {
		return this.operator;
	}


	public Object call(AstNode node, FelContext context) {
		Object[] children = node.getChildrenArray();
		if (children != null && children.length == 2) {
			Object left = TolerantFunction.eval(context, children[0]);
			Object right = TolerantFunction.eval(context, children[1]);
			if(this == EQUAL){
				return Boolean.valueOf(equals(left, right));
			}else if(this == NOEQUAL){
				return Boolean.valueOf(!equals(left, right));
			}
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}
	
	public static boolean equals(Object left,Object right){
		if(left == null && right == null){
			return true;
		}else if(left == null || right == null){
			return false;
		}else if(left.getClass().equals(right.getClass())){
			return left.equals(right);
		}else if(left instanceof BigDecimal || right instanceof BigDecimal){
			return FunctionUtil.toBigDecimal(left).compareTo(FunctionUtil.toBigDecimal(right)) == 0;
		} else if (FunctionUtil.isFloatingPointNumber(left) || FunctionUtil.isFloatingPointNumber(right)) {
			return FunctionUtil.toDouble(left) == FunctionUtil.toDouble(right);
		}else if(left instanceof Number || right instanceof Number || left instanceof Character
	            || right instanceof Character){
			return FunctionUtil.toLong(left) == FunctionUtil.toLong(right);
		}else if(left instanceof Boolean || right instanceof Boolean){
			return FunctionUtil.toBoolean(left) == FunctionUtil.toBoolean(right);
		}else if(left instanceof String || right instanceof String){
			return left.toString().equals(right.toString());
		}
		return left.equals(right);
	}

}
