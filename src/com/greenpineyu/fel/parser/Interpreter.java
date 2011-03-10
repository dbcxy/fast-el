package com.greenpineyu.fel.parser;

import com.greenpineyu.fel.context.FelContext;

/**
 * 解析器,用于解析AstNode的值
 * @author yqs
 *
 */
public interface Interpreter {

	/**
	 * @param context
	 * @return
	 */
	Object interpret(FelContext context, FelNode node);

}
