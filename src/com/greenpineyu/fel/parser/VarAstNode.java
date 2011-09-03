package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;
import org.apache.commons.lang3.ObjectUtils.Null;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.FelContext;

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
		this.builder  = this;
	}

	public SourceBuilder toMethod(FelContext ctx) {
		return this.builder;
		//			 return ctx.getValueType(ctx);
	}

	public String source(FelContext ctx, FelNode node) {
		FelNode node2 = this;
		Class<?> type = returnType(ctx, node2);
		String getVarCode = "context.get(\""+node2.getText()+"\")";
		String code = "";
		if(Number.class.isAssignableFrom(type)){
			//当float转double时，会丢失精度
			code = "(("+type.getName()+")"+getVarCode+").doubleValue()";
		}else{
			code = "(" + type.getName() + ")" + getVarCode;
		}
		return code;
	}

	public Class<?> returnType(FelContext ctx, FelNode node) {
		FelNode node2 = this;
		Class<?> type = ctx.getVarType(node2.getText());
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
