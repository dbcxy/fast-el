package com.greenpineyu.fel.function.operator;

import java.util.List;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.StableFunction;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 取反操作符
 *
 */
public class NotOper extends StableFunction {
	

	@Override
	public Object call(FelNode node, FelContext context) {
		List<FelNode> children = node.getChildren();
		Object eval = children.get(0).eval(context);
		if(eval!=null && eval instanceof Boolean){
			return !(Boolean)eval;
		}
		return null;
	}

	@Override
	public String getName() {
		return "!";
	}

	@Override
	public SourceBuilder toMethod(FelNode node, FelContext ctx) {
		return new SourceBuilder() {
			
			@Override
			public String source(FelContext ctx, FelNode node) {
				List<FelNode> children = node.getChildren();
				FelNode child = children.get(0);
				String src = "";
				SourceBuilder builder = child.toMethod(ctx);
				Class<?> returnType = builder.returnType(ctx, child);
				if(boolean.class.isAssignableFrom(returnType)||Boolean.class.isAssignableFrom(returnType)){
					src = "!("+builder.source(ctx, child)+")";
				}else{
					// FIXME 抛出编译异常
				}
				return src;
			}
			
			@Override
			public Class<?> returnType(FelContext ctx, FelNode node) {
				return Boolean.class;
			}
		};
	}
	
	public static void main(String[] args) {
		FelEngine fel = FelEngine.instance;
		FelContext ctx = fel.getContext();
		ctx.set("b", false);
		Object r = fel.compile("!b",ctx).eval(ctx);
		System.out.println(r);
	}

}
