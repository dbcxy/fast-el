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
	 * 执行表达式，获取结果
	 * @param exp
	 * @return
	 */
	Object eval(String exp);

	/**
	 * 解析表达式为节点
	 * @param exp
	 * @return
	 */
	FelNode parse(String exp);

	FelContext getContext();

}
