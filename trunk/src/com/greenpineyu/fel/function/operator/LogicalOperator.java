package com.greenpineyu.fel.function.operator;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.exception.EvalException;
import com.greenpineyu.fel.function.TolerantFunction;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 包名				.script.function.operator
 * 类名				LogicalOperator.java
 * 创建日期				Oct 26, 20103:20:20 PM
 * 作者				
 * 版权				
 */
public class LogicalOperator extends TolerantFunction {

	private String operator;
	
	private LogicalOperator(String operator) {
		this.operator = operator;
	}
	
	public static final String AND_STR = "AND";
	public static final String AND2_STR = "&&";
	public static final String OR_STR = "OR";
	public static final String OR2_STR = "||";
	
	public static final LogicalOperator AND;
	public static final LogicalOperator AND2;
	public static final LogicalOperator OR;
	public static final LogicalOperator OR2;
	
	static {
		AND = new LogicalOperator(AND_STR);
		AND2 = new LogicalOperator(AND2_STR);
		OR = new LogicalOperator(OR_STR);
		OR2 = new LogicalOperator(OR2_STR);
	}
	
	public Object callFun(FelNode node, FelContext context) {
			Object[] children = node.getChildrenArray();
			if (children != null && children.length == 2) {
				if (this == AND || this == AND2) {
					return and(context, children);
				} else if (this == OR || this == OR2) {
					return or(context, children);
				}
			throw new EvalException("未知的逻辑操作符");
			}
		throw new EvalException("传入参数数组为空或者参数个数不正确!");
	}

	/**
	 * AND 和 &&
	 * @param left
	 * @param right
	 * @return
	 */
	private Boolean and(FelContext context, Object[] children) {
		Boolean leftValue = toBoolean(context, children[0]);
		if (!leftValue.booleanValue()) {
			return leftValue;
		}
		return toBoolean(context, children[1]);
	}

	private Boolean or(FelContext context, Object[] children) {
		Boolean leftValue = toBoolean(context, children[0]);
		if (leftValue.booleanValue()) {
			return leftValue;
		}
		return toBoolean(context, children[1]);
	}

	private Boolean toBoolean(FelContext context, Object left) {
		left = eval(context, left);
		Boolean leftValue = NumberUtil.toBooleanObj(left);
		return leftValue;
	}

	/**
	 * AND 和 &&
	 * @param left
	 * @param right
	 * @return
	 */
	private boolean and(Object left, Object right){
		boolean l = NumberUtil.toBoolean(left);
		if(!l){
			return false;
		}
		boolean r = NumberUtil.toBoolean(right);
		if(!r){
			return false;
		}
		return true;
	}

	/**
	 * OR 和 ||
	 * @param left
	 * @param right
	 * @return
	 */
	private boolean or(Object left, Object right){
		boolean l = NumberUtil.toBoolean(left);
		if(l){
			return true;
		}
		boolean r = NumberUtil.toBoolean(right);
		if(r){
			return true;
		}
		return false;
	}
	
	public String getName() {
		return this.operator;
	}

}
