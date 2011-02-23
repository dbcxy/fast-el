package com.greenpineyu.fel.antlr;

import org.antlr.runtime.Token;

import com.greenpineyu.fel.context.FelContext;

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

	public Object interpret(FelContext context, AstNode node) {
		return value;
	}

}
