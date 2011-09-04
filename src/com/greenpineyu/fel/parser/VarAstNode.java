package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;
import org.apache.commons.lang3.ObjectUtils.Null;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.compile.VarBuffer;
import com.greenpineyu.fel.context.AbstractConetxt;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.interpreter.ProxyInterpreter;

public class VarAstNode extends AbstFelNode implements SourceBuilder {
	private String text;

	public VarAstNode(Token token) {
		super(token);
		this.text = token.getText();
	}

	public String getText() {
		return this.text;
	}

	public Object interpret(FelContext context, FelNode node) {
		return context.get(text);
	}
	
	{
		resetSourceBuilder();
	}

	public SourceBuilder toMethod(FelContext ctx) {
		return this.builder;
		//			 return ctx.getValueType(ctx);
	}

	public String source(FelContext ctx, FelNode node) {
		String code = "";
		Class<?> type = returnType(ctx, node);
		boolean isNumber = Number.class.isAssignableFrom(type);
		if(this.getInterpreter()!=this||true){
			ProxyInterpreter inte = new ProxyInterpreter(this.getInterpreter(), node);
			code = "("+type.getName()+")";
			String varName = VarBuffer.push(inte);
			code+=varName+".interpret(context,null)";
			if(isNumber){
				code="("+code+").doubleValue();";
			}
			//用户设置了解释器
			return code;
		}
		String getVarCode = "context.get(\""+node.getText()+"\")";
		if(isNumber){
			//当float转double时，会丢失精度
			code = "(("+type.getName()+")"+getVarCode+").doubleValue()";
		}else{
			code = "(" + type.getName() + ")" + getVarCode;
		}
		return code;
	}

	public Class<?> returnType(FelContext ctx, FelNode node) {
		Class<?> type = ctx.getVarType(node.getText());
		if(node.getInterpreter()!=node){
			type = AbstractConetxt.getVarType(node.getInterpreter().interpret(ctx, node));
		}
		if(type == null){
			type = Null.class;
		}else if(type.isPrimitive()){
			//基本类型转换成包装类型
			type = ReflectUtil.toWrapperClass(type);
		}
		if(Number.class.isAssignableFrom(type)){
			type = Number.class;
		}
		return type;
	}
	

}
