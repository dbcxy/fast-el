package com.greenpineyu.fel.antlr;

import org.antlr.runtime.Token;

import com.greenpineyu.fel.context.FelContext;

public class VarAstNode extends AstNodeImpl {
	private String text;

	public VarAstNode(Token token) {
		super(token);
		this.text = token.getText();
	}

	public String getText() {
		return this.text;
	}

	public Object interpret(FelContext context, AstNode node) {
		return context.get(text);
	}

}
