package com.greenpineyu.fel.function;

import java.util.List;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.compile.InterpreterSourceBuilder;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 普通函数
 * 
 * @author yqs
 * 
 */
public abstract class CommonFunction implements Function {

	/*
	 * (non-Javadoc)
	 * 
	 * @see .script.function.Function#call(.script.antlr.AstNode,
	 *      .script.context.ScriptContext)
	 */
	public Object call(FelNode node, FelContext context) {
		// 如果参数中包含表达式，执行表达式。将表达式替换成表达式执行结果。
		Object[] children = evalArgs(node, context);
		return call(children);
	}
	
	public SourceBuilder toMethod(FelNode node, FelContext ctx) {
		return InterpreterSourceBuilder.getInstance();
	}


	public static Object[] evalArgs(FelNode node, FelContext context) {
		Object[] returnMe = null;
		List<FelNode> children = node.getChildren();
		if(children!=null&& children.size()>0){
			Object[] args = children.toArray();
			int size = args.length;
			returnMe = new Object[size];
			System.arraycopy(args, 0, returnMe, 0, size);
			for (int i = 0; i < size; i++) {
				Object child = args[i];
				if (child instanceof Expression) {
					Expression childExp = ((Expression) child);
					returnMe[i] = childExp.eval(context);
				}
			}
		}
		return returnMe;
	}

	public static void main(String[] args) {
		/*
		 * List list = new ArrayList(); String[] abc = new String[] { "1", "3",
		 * "4" }; for (int i = 0; i < abc.length; i++) { String string = abc[i];
		 * list.add(string); } int time = 1000000; long s1 =
		 * System.currentTimeMillis();
		 * 
		 * for (int i = 0; i < time; i++) { abc.clone(); } long s2 =
		 * System.currentTimeMillis(); System.out.println("花费的时间:" + (s2 - s1));
		 * 
		 * for (int i = 0; i < time; i++) { list.toArray(new Object[0]); } long
		 * s3 = System.currentTimeMillis(); System.out.println("花费的时间:" + (s3 -
		 * s2));
		 */
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
