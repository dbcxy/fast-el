package com.greenpineyu.fel.parser;

import com.greenpineyu.fel.context.FelContext;

public class ConstInterpreter implements Interpreter {

	private Object value;

	public ConstInterpreter(FelContext context, FelNode node) {
		this.value = node.eval(context);
	}

	public Object interpret(FelContext context, FelNode node) {
		return value;
	}

}
