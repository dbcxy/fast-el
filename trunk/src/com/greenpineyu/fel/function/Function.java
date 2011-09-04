package com.greenpineyu.fel.function;

import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

/**
 * @uml.dependency   supplier=".script.context.ScriptContext"
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
	
	
	
	SourceBuilder toMethod(FelNode node,FelContext ctx);
	
	

}
