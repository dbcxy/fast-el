package com.greenpineyu.fel.antlr;

import com.greenpineyu.fel.context.ScriptContext;

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
	Object interpret(ScriptContext context, AstNode node);

}
