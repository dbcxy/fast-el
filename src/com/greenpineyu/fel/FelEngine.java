package com.greenpineyu.fel;

import com.greenpineyu.fel.common.Callable;
import com.greenpineyu.fel.compile.FelCompiler;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.optimizer.Optimizer;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 脚本引擎
 * @author       yqs
 * @uml.dependency   supplier=".script.function.Function"
 */
public interface FelEngine {

	/**
	 * 执行表达式，获取结果
	 * @param exp
	 * @return
	 */
	Object eval(String exp);

	/**
	 * 使用指定的引擎上下文执行表达式，获取结果
	 * @param exp 
	 * @param ctx 引擎上下文
	 * @return
	 */
	Object eval(String exp, FelContext ctx);

	/**
	 * 解析表达式为节点
	 * @param exp
	 * @return
	 */
	FelNode parse(String exp);
	
	Expression compile(String exp,FelContext ctx,Optimizer... opts);

	FelContext getContext();
	
	

}
