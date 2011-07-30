package com.greenpineyu.fel.compile;

import com.greenpineyu.fel.Expression;

public interface FelCompiler {
	
	/**
	 * 将表达式编译成Expression class
	 * @param javasource
	 * @return
	 */
	Class<Expression> compile(String expr);
	
	/**
	 * 
	 * 编译表达式，并创建Expression
	 * @param expr
	 * @return
	 */
	public Expression newInstance(String expr);

}
