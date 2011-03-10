package com.greenpineyu.fel.function;

import java.util.ArrayList;
import java.util.List;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.antlr.FelNode;
import com.greenpineyu.fel.context.FelContext;

/**
 * 普通函数
 * 
 * @author yqs
 * 
 */
public abstract class CommonFunction extends TolerantFunction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.datanew.excel.script.function.Function#call(com.datanew.excel.script.antlr.AstNode,
	 *      com.datanew.excel.script.context.ScriptContext)
	 */
	protected Object callFun(FelNode node, FelContext context) {
		// 如果参数中包含表达式，执行表达式。将表达式替换成表达式执行结果。
		Object[] children = evalArgs(node, context);
		return call(children);
	}


	public static Object[] evalArgs(FelNode node, FelContext context) {
		Object[] returnMe = null;
		Object[] children = node.getChildrenArray();
		int size = children.length;
		if (size > 0) {
			returnMe = new Object[size];
			System.arraycopy(children, 0, returnMe, 0, size);
			for (int i = 0; i < size; i++) {
				Object child = children[i];
				if (child instanceof Expression) {
					Expression childExp = ((Expression) child);
					returnMe[i] = childExp.eval(context);
				}
			}
		}
		return returnMe;

//		Object[] returnMe = null;
		//		List children = node.getChildren();
		//		if (children != null) {
		//			int size = children.size();
		//			if (size > 0) {
		//				returnMe = children.toArray(new Object[size]);
		//				for (int i = 0; i < size; i++) {
		//					Object child = children.get(i);
		//					if (child instanceof Expression) {
		//						Expression childExp = ((Expression) child);
		//						returnMe[i] = childExp.eval(context);
		//					}
		//				}
		//					}
		//				}
		//		return returnMe;
	}

	public static void main(String[] args) {
		List list = new ArrayList();
		String[] abc = new String[] { "1", "3", "4" };
		for (int i = 0; i < abc.length; i++) {
			String string = abc[i];
			list.add(string);
		}
		int time = 1000000;
		long s1 = System.currentTimeMillis();

		for (int i = 0; i < time; i++) {
			abc.clone();
		}
		long s2 = System.currentTimeMillis();
		System.out.println("花费的时间:" + (s2 - s1));

		for (int i = 0; i < time; i++) {
			list.toArray(new Object[0]);
		}
		long s3 = System.currentTimeMillis();
		System.out.println("花费的时间:" + (s3 - s2));
		//		Object[] returnMe = null;
		//		Object[] children = node.getChildrenArray();
		//		int size = children.length;
		//		if (size > 0) {
		//			returnMe = (Object[]) children.clone();
		//			for (int i = 0; i < size; i++) {
		//				Object child = children[i];
		//				if (child instanceof Expression) {
		//					Expression childExp = ((Expression) child);
		//					returnMe[i] = childExp.eval(context);
		//				}
		//			}
		//		}
		//		return returnMe;
	}

	/**
	 * 调用函数
	 * 
	 * @param arguments
	 * @return
	 */
	abstract public Object call(Object[] arguments);
}
