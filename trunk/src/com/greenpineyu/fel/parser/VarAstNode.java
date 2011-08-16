package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;

import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.context.FelContext;

public class VarAstNode extends AbstFelNode {
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

	public FelMethod toMethod(FelContext ctx) {
		Class<?> type = ctx.getVarType(this.text);
		if(type!=null &&!type.isAssignableFrom(Number.class)){
			
		}
		return new FelMethod(type, "("+type.getName()+")context.get(\""+this.text+"\")");
//		return ctx.getValueType(ctx);
	}

}
