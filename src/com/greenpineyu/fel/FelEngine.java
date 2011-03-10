package com.greenpineyu.fel;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 脚本引擎
 * @author       yqs
 * @uml.dependency   supplier="com.datanew.excel.script.function.Function"
 */
public interface FelEngine {

	/**
	 * 执行脚本，获取结果
	 * @param exp
	 * @return
	 */
	Object eval(String exp);

	FelNode parse(String exp);

	FelContext getContext();

	//	/**
	//	 * 添加函数
	//	 * @param function
	//	 */
	//	void addFunction(Function function);
	//
	//	/**
	//	 * 获取函数
	//	 * @param name
	//	 * @return
	//	 */
	//	Function getFunction(String name);

}
