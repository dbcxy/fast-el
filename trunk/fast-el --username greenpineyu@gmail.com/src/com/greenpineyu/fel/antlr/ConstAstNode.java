package com.greenpineyu.fel.antlr;

import org.antlr.runtime.Token;

import com.greenpineyu.fel.context.ScriptContext;

/**
 * 常量节点
 * @author yqs
 *
 */
public class ConstAstNode extends AstNodeImpl {

	private Object value;

	public ConstAstNode(Token token, Object value) {
		super(token);
		this.value = value;
	}

	public Object interpret(ScriptContext context, AstNode node) {
		return value;
	}

}
