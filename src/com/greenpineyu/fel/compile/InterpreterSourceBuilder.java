package com.greenpineyu.fel.compile;

import com.greenpineyu.fel.context.AbstractConetxt;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.interpreter.Interpreter;
import com.greenpineyu.fel.interpreter.ProxyInterpreter;
import com.greenpineyu.fel.parser.FelNode;

public class InterpreterSourceBuilder implements SourceBuilder {
	
	
	
	
	private static final SourceBuilder instance;
		
	public static SourceBuilder getInstance() {
		return instance;
	}

	static{
		instance = new InterpreterSourceBuilder();
	}
	
	
	
	public Class<?> returnType(FelContext ctx, FelNode node) {
			return  AbstractConetxt.getVarType(node.getInterpreter().interpret(ctx, node));
	}

	/**
	 * 用户自定义解析器生成的java代码
	 * @param ctx
	 * @param node
	 * @return
	 */
	public String source(FelContext ctx, FelNode node) {
			//用户设置了解释器
			Interpreter inte = new ProxyInterpreter(node.getInterpreter(), node);
			SourceBuilder nodeBuilder = node.toMethod(ctx);
			Class<?> type =nodeBuilder.returnType(ctx, node);
			String code = "("+type.getName()+")";
			String varName = VarBuffer.push(inte,Interpreter.class);
			code+=varName+".interpret(context,null)";
			boolean isNumber = Number.class.isAssignableFrom(type);
			if(isNumber){
				code="("+code+").doubleValue()";
			}
			return code;
	}

}
