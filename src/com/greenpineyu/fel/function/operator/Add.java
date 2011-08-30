package com.greenpineyu.fel.function.operator;

import static com.greenpineyu.fel.common.NumberUtil.toDouble;

import java.util.Iterator;
import java.util.List;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

public class Add extends StableFunction  {

	private static Add instance;

	static {
		instance = new Add();
	}

	private Add() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see .script.function.Function#call(.script.AstNode,
	 * .script.context.ScriptContext)
	 */
	public Object call(FelNode node, FelContext context) {
		Object returnMe = null;
		boolean isAdd = node.getText().equals("+");
		for (Iterator iterator = node.getChildren().iterator(); iterator
				.hasNext();) {
			Object child = (Object) iterator.next();
			if (child instanceof FelNode) {
				FelNode childNode = (FelNode) child;
				child = childNode.eval(context);
			}
			if (child instanceof String) {
				if (returnMe == null) {
					returnMe = child;
					continue;
				}
				if (isAdd) {
					returnMe = returnMe + (String) child;
				} else {
					throw new IllegalStateException("calc " + node + " error!");
				}
			}
			if (child instanceof Number) {
				if (returnMe == null) {
					returnMe = child;
					continue;
				}
				Number value = (Number) child;
				if (returnMe instanceof Number) {
					Number r = (Number) returnMe;
					returnMe = new Double(isAdd ? toDouble(r)
							+ toDouble(value):toDouble(r)
							- toDouble(value));
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

	public static Add getInstance() {
		return instance;
	}

	public String getName() {
		throw new UnsupportedOperationException("还没有实现[2010-10-19]");
	}
/*
	public String toJavaSrc(FelNode node, FelContext context) {
		List<FelNode> children = node.getChildren();
		StringBuilder sb = new StringBuilder();

		for (FelNode n : children) {
			sb.append("(");
			sb.append(n.toJavaSrc(null));
			sb.append(")");
			sb.append("+");
		}
		if (sb.length() > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}*/

	public FelMethod toMethod(FelNode node, FelContext ctx) {
		Class<?> type = null;
	/*	List<FelNode> children = node.getChildren();
		StringBuilder code = new StringBuilder();

		Iterator<FelNode> it = children.iterator();
		FelNode first = null;
		if (it.hasNext()) {
			first = it.next();
			FelMethod argMethod = first.toMethod(ctx);
			appendArg(code, argMethod);
			Class<?> t = argMethod.getReturnType();
			// 将第一个参数的类型作为返回值的类型
			type = t.isAssignableFrom(Number.class) ? t : String.class;
		}
		boolean hasNext = it.hasNext();
		while (hasNext) {
			code.append("+");
			FelNode n = it.next();
			FelMethod argMethod = n.toMethod(ctx);
			appendArg(code, argMethod);
			hasNext = it.hasNext();
		}
		return new FelMethod(type, code.toString());*/
		
		List<FelNode> children = node.getChildren();
		StringBuilder sb = new StringBuilder();
		FelNode right = null;
		if (children.size() == 2) {
			FelNode left = children.get(0);
			FelMethod lm = left.toMethod(ctx);
			appendArg(sb, lm);
			type = lm.getReturnType();
			right = children.get(1);
			sb.append("+");
		} else if (children.size() == 1) {
			right = children.get(0);
		}
		FelMethod rm = right.toMethod(ctx);
		if(Character.class.isAssignableFrom(rm.getReturnType())){
			type = rm.getReturnType();
		}
		appendArg(sb, rm);
		FelMethod m = new FelMethod(type, sb.toString());
		return m;

		/*
		 * for (FelNode n : children) { sb.append("(");
		 * sb.append(n.toJavaSrc(null)); sb.append(")"); sb.append("+"); }
		 * if(sb.length()>0){ sb.deleteCharAt(sb.length()-1); children.get(0) }
		 */
		// return sb.toString();
	}

	private void appendArg(StringBuilder sb, FelMethod argMethod) {
		Class<?> t = argMethod.getReturnType();
		sb.append("(");
		if (Number.class.isAssignableFrom(t)
				|| CharSequence.class.isAssignableFrom(t)) {
			// 数值型和字符型时，直接添加
			sb.append(argMethod.getCode());
		} else {
			sb.append("ObjectUtils.toString(").append(argMethod.getCode())
					.append(")");
		}
		sb.append(")");
	}

}
