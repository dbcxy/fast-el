package com.greenpineyu.fel.function.operator;

import java.util.List;

import org.apache.commons.lang.ObjectUtils.Null;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.exception.EvalException;
import com.greenpineyu.fel.function.TolerantFunction;
import com.greenpineyu.fel.parser.FelNode;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * 包名 .script.function.operator 类名 LogicalOperator.java 创建日期 Oct 26, 20103:20:20
 * PM 作者 版权
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

	public String toJavaOper() {
		if (AND_STR.equals(this.getName())) {
			return AND2_STR;
		}
		if (OR_STR.equals(this.getName())) {
			return OR2_STR;
		}
		return this.getName();
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
	 * 
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
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	private boolean and(Object left, Object right) {
		boolean l = NumberUtil.toBoolean(left);
		if (!l) {
			return false;
		}
		boolean r = NumberUtil.toBoolean(right);
		if (!r) {
			return false;
		}
		return true;
	}

	/**
	 * OR 和 ||
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	private boolean or(Object left, Object right) {
		boolean l = NumberUtil.toBoolean(left);
		if (l) {
			return true;
		}
		boolean r = NumberUtil.toBoolean(right);
		if (r) {
			return true;
		}
		return false;
	}

	public String getName() {
		return this.operator;
	}

	public FelMethod toMethod(FelNode node, FelContext ctx) {
		String code = toBoolean(node, ctx, 0)+this.toJavaOper()+toBoolean(node, ctx, 1);
		return new FelMethod(Boolean.class, code);
//		List<FelNode> children = node.getChildren();
//		FelNode left = children.get(0);
//		FelNode right = children.get(1);
//		FelMethod lm = left.toMethod(ctx);
//		FelMethod rm = right.toMethod(ctx);
//		Class<?> lt = lm.getReturnType();
//		Class<?> rt = rm.getReturnType();
//		
//		return null;
	}

	public String toBoolean(FelNode node, FelContext ctx, int index) {
		List<FelNode> children = node.getChildren();
		FelNode child = children.get(index);
		FelMethod method = child.toMethod(ctx);
		Class<?> type = method.getReturnType();
		if (Boolean.class.isAssignableFrom(type)) {
			return "(" + method.getCode() + ")";
		}
		if (String.class.isAssignableFrom(type)) {
			return "Boolean.valueOf(" + method.getCode() + ")";
		}
		if (Null.class.isAssignableFrom(type)) {
			return "false";
		}
		return "false";
	}

}
