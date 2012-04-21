package com.greenpineyu.fel.function.operator;

import java.util.List;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.exception.ParseException;
import com.greenpineyu.fel.function.StableFunction;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 三元表达式操作符
 * 
 * @author Administrator
 * 
 */
public class Cond extends StableFunction {
	

	@Override
	public Object call(FelNode node, FelContext context) {
		List<FelNode> args = ensureValid(node);
		//cond ? result1 : result2
		FelNode cond = args.get(0);
		FelNode result1 = args.get(1);
		FelNode result2 = args.get(2);
		Object eval = cond.eval(context);
		// 当cond是boolean型，并且值是true的,返回result1,否则返回result2
		if(eval !=null && eval instanceof Boolean){
			Boolean b = (Boolean)eval;
			if(b.booleanValue()){
				return result1.eval(context);
			}
		}
		return result2.eval(context);
	}

	@Override
	public String getName() {
		return "?";
	}

	@Override
	public SourceBuilder toMethod(FelNode node, FelContext ctx) {
		List<FelNode> args = ensureValid(node);
		//cond ? result1 : result2
		FelNode cond = args.get(0);
		FelNode result1 = args.get(1);
		FelNode result2 = args.get(2);
		SourceBuilder source = cond.toMethod(ctx);
		Class<?> class1 = source.returnType(ctx, cond);
		StringBuilder sb = new StringBuilder();
		Class<?> type = null;
		SourceBuilder r2 = result2.toMethod(ctx);
		if(Boolean.class.isAssignableFrom(class1)|| boolean.class.isAssignableFrom(class1)){
			// FIXME 需要判断两个结果中的父类型
			sb.append(source.source(ctx, node));
			sb.append("?");
			SourceBuilder r1 = result1.toMethod(ctx);
			type = r1.returnType(ctx, result1);
			sb.append(r1.source(ctx, result1));
			sb.append(":");
			sb.append(r2.source(ctx, result2));
		}else{
			sb.append(r2.source(ctx, result2));
			type = r2.returnType(ctx, result2);
		}
		
		return new FelMethod(type, sb.toString());
	}

	private List<FelNode> ensureValid(FelNode node) {
		List<FelNode> args = node.getChildren();
		if(args==null||args.size()!=3){
			throw new ParseException("不合法的三元表达式");
		}
		return args;
	}
	
	public static void main(String[] args) {
		String exp = "true?false?2:3:2";
		System.out.println(!(100%3-39.0<27));
		// Object a =6.7-100>39.6 ? 5==5? 4+5:6-1 : !(100%3-39.0<27) ? 8*2-199:
		// 100%3;
		// System.out.println(a);
		exp = "6.7-100>39.6 ? 5==5? 4+5:6-1 : !(100%3-39.0<27) ? 8*2-199: 100%3";
		eval(exp);
	}

	private static void eval(String exp) {
		FelEngine fel = FelEngine.instance;
		Object result = fel.eval(exp);
		System.out.println(result);
		result = fel.compile(exp, null).eval(null);
		System.out.println(result);
	}

}
