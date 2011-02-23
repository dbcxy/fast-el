package com.greenpineyu.fel.antlr;

import com.greenpineyu.fel.context.ScriptContext;

public class ConstInterpreter implements Interpreter {

	private Object value;

	public ConstInterpreter(ScriptContext context, AstNode node) {
		this.value = node.eval(context);
	}

	public Object interpret(ScriptContext context, AstNode node) {
		return value;
	}

}
