package com.greenpineyu.fel;

import com.greenpineyu.fel.antlr.AstNode;
import com.greenpineyu.fel.context.ScriptContext;

/**
 * 脚本引擎
 * @author       yqs
 * @uml.dependency   supplier="com.datanew.excel.script.function.Function"
 */
public interface ScriptEngine {

	/**
	 * 执行脚本，获取结果
	 * @param exp
	 * @return
	 */
	Object eval(String exp);

	AstNode parse(String exp);

	ScriptContext getContext();

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
