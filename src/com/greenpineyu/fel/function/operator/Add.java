package com.greenpineyu.fel.function.operator;

import static com.greenpineyu.fel.common.NumberUtil.toDouble;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.common.ObjectUtils;
import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.StableFunction;
import com.greenpineyu.fel.parser.FelNode;

public class Add extends StableFunction  {


	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");


	/*
	 * (non-Javadoc)
	 * 
	 * @see .script.function.Function#call(.script.AstNode,
	 * .script.context.ScriptContext)
	 */
	@Override
	public Object call(FelNode node, FelContext context) {
		Object returnMe = null;
		for (Iterator<FelNode> iterator = node.getChildren().iterator(); iterator
				.hasNext();) {
			Object child = iterator.next();
			if (child instanceof FelNode) {
				FelNode childNode = (FelNode) child;
				child = childNode.eval(context);
			}
			if (child instanceof String) {
				if (returnMe == null) {
					returnMe = child;
					continue;
				}
					returnMe = returnMe + (String) child;
			}
			if (child instanceof Number) {
				if (returnMe == null) {
					returnMe = child;
					continue;
				}
				Number value = (Number) child;
				if (returnMe instanceof Number) {
					Number r = (Number) returnMe;
					returnMe = toDouble(r) + toDouble(value);
				}else if(returnMe instanceof String){
					String r = (String) returnMe;
					returnMe=r+value;
				}
			}
		}
		if(returnMe instanceof Number){
			return NumberUtil.parseNumber(returnMe.toString());
		}
		return returnMe;
	}

	@Override
	public String getName() {
		return "+";
	}

	@Override
	public FelMethod toMethod(FelNode node, FelContext ctx) {
		Class<?> type = null;
		List<FelNode> children = node.getChildren();
		StringBuilder sb = new StringBuilder();
		if (children.size() == 2) {
			FelNode left = children.get(0);
			SourceBuilder lm = left.toMethod(ctx);
			appendArg(sb, lm,ctx,left);
			Class<?> leftType = lm.returnType(ctx, left);
			
			FelNode right = children.get(1);
			sb.append("+");
			SourceBuilder rm = right.toMethod(ctx);
			Class<?> rightType = rm.returnType(ctx, right);
			if(CharSequence.class.isAssignableFrom(leftType)){
				type = leftType;
			} else if (CharSequence.class.isAssignableFrom(rightType)) {
				type = rightType;
			}else if(ReflectUtil.isPrimitiveOrWrapNumber(leftType)
					&&ReflectUtil.isPrimitiveOrWrapNumber(rightType)){
				type = NumberUtil.arithmeticClass(leftType, rightType);
			}else {
				//不支持的类型，返回字符串。
				type = String.class;
			}
			appendArg(sb, rm,ctx,right);
			
		} else if (children.size() == 1) {
			FelNode right = children.get(0);
			SourceBuilder rm = right.toMethod(ctx);
			Class<?> rightType = rm.returnType(ctx, right);
			if(ReflectUtil.isPrimitiveOrWrapNumber(rightType)){
				appendArg(sb, rm,ctx,right);
			}
			type = rightType;
		}
		
//		appendArg(sb, rm,ctx,right);
		FelMethod m = new FelMethod(type, sb.toString());
		return m;
	}
	

	private void appendArg(StringBuilder sb, SourceBuilder argMethod,FelContext ctx,FelNode node) {
		Class<?> t = argMethod.returnType(ctx, node);
		sb.append("(");
		if (ReflectUtil.isPrimitiveOrWrapNumber(t)
				|| CharSequence.class.isAssignableFrom(t)) {
			// 数值型和字符型时，直接添加
			sb.append(argMethod.source(ctx, node));
		} else {
			sb.append("ObjectUtils.toString(").append(argMethod.source(ctx, node))
					.append(")");
		}
		sb.append(")");
	}

	/**
	 * 加法
	 * 
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
				left = NumberUtil.calArray(left);
			}
			if (right instanceof Object[]){
				right = NumberUtil.calArray(right);
			}
			
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
				return left + Add.DATE_FORMAT.format((Date) right);
			} else if (left instanceof Date && right instanceof String) {
				return Add.DATE_FORMAT.format((Date) left) + right;
			}
	
			BigInteger l = NumberUtil.toBigInteger(left);
			BigInteger r = NumberUtil.toBigInteger(right);
			BigInteger result = l.add(r);
			return NumberUtil.narrowBigInteger(left, right, result);
		} catch (Exception e) {
			return ObjectUtils.toString(left).concat(ObjectUtils.toString(right));
		}
	}

}
