package com.greenpineyu.fel.interpreter;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

public class ConstInterpreter implements Interpreter {

	private Object value;

	public ConstInterpreter(FelContext context, FelNode node) {
		this.value = node.eval(context);
	}

	public Object interpret(FelContext context, FelNode node) {
		return value;
	}

}
