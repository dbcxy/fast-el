package com.greenpineyu.fel.antlr;

import com.greenpineyu.fel.context.FelContext;

public class ConstInterpreter implements Interpreter {

	private Object value;

	public ConstInterpreter(FelContext context, AstNode node) {
		this.value = node.eval(context);
	}

	public Object interpret(FelContext context, AstNode node) {
		return value;
	}

}
