package com.greenpineyu.fel;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.Function;
import com.greenpineyu.fel.optimizer.Optimizer;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 表达式引擎
 * 
 * @author yqs
 */
public interface FelEngine {

	/**
	 * 默认实例
	 */
	FelEngine instance = new FelEngineImpl();

	/**
	 * 执行表达式，获取结果
	 * 
	 * @param exp
	 * @return
	 */
	Object eval(String exp);

	/**
	 * 使用指定的引擎上下文执行表达式，获取结果
	 * 
	 * @param exp
	 * @param ctx 引擎上下文
	 * @return
	 */
	Object eval(String exp, FelContext ctx);

	/**
	 * 解析表达式为节点
	 * 
	 * @param exp
	 * @return
	 */
	FelNode parse(String exp);

	/**
	 * 编译表达式
	 * 
	 * @param exp
	 * @param ctx
	 * @param opts 编译优化选项
	 * @return
	 */
	Expression compile(String exp, FelContext ctx, Optimizer... opts);

	/**
	 * @return 引擎执行环境
	 */
	FelContext getContext();

	/**
	 * 添加函数到全局函数库中（所有的引擎实例共享一个函数库）
	 * 
	 * @param fun
	 * @return
	 */
	boolean addFun(Function fun);

}
