package com.greenpineyu.fel.function;

import com.greenpineyu.fel.antlr.FelNode;
import com.greenpineyu.fel.context.FelContext;

/**
 * @uml.dependency   supplier="com.datanew.excel.script.context.ScriptContext"
 */
public interface Function {

	/**
	 * 获取函数的名称
	 * @return
	 */
	String getName();

	/**
	 * 调用函数
	 * @param arguments
	 * @return
	 */
	Object call(FelNode node, FelContext context);

}
