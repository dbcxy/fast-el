package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;

import com.greenpineyu.fel.context.FelContext;

/**
 * 常量节点
 * @author yqs
 *
 */
public class ConstNode extends FelNodeImpl {

	private Object value;

	public ConstNode(Token token, Object value) {
		super(token);
		this.value = value;
	}

	public Object interpret(FelContext context, FelNode node) {
		return value;
	}

}
