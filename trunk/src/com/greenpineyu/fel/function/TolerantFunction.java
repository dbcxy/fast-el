package com.greenpineyu.fel.function;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 有容错功能的函数
 * @author yqs
 *
 */
public abstract class TolerantFunction implements Function {

	public static final String ERROR_ARGS = "传入参数数组为空,或者参数个数不正确,或者参数类型错误!";

	/*
	 * (non-Javadoc)
	 * 
	 * @see .script.function.Function#call(.script.antlr.AstNode,
	 *      .script.context.ScriptContext)
	 */
	public Object call(FelNode node, FelContext context) {
		// 如果参数中包含表达式，执行表达式。将表达式替换成表达式执行结果。
		Object result = null;
			result = callFun(node, context);
		return result;
	}

	public static Object eval(FelContext context, Object obj) {
		if (obj != null && obj instanceof Expression) {
			return ((Expression) obj).eval(context);
		}
		return obj;
	}

	/**
	 * @param node
	 * @param context
	 * @return
	 */
	protected abstract Object callFun(FelNode node, FelContext context);
	
	public String toJavaSrc(FelNode node, FelContext context) {
		throw new UnsupportedOperationException("还没有实现");
	}

}
