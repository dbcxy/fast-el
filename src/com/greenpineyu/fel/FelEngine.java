package com.greenpineyu.fel;

import com.greenpineyu.fel.compile.CompileService;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.FunMgr;
import com.greenpineyu.fel.function.Function;
import com.greenpineyu.fel.optimizer.Optimizer;
import com.greenpineyu.fel.parser.FelNode;
import com.greenpineyu.fel.parser.Parser;

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
	 * 添加函数到用户函数库中（执行表达式时，优先从用户函数库中获取函数）
	 * 
	 * @param fun
	 * @return
	 */
	void addFun(Function fun);
	
	/**
	 * 获取编译器
	 * @return
	 */
	CompileService getCompiler() ;


	/**
	 * 设置编译器
	 * @param compiler
	 */
	void setCompiler(CompileService compiler); 


	/**
	 * 获取解析器
	 * @return
	 */
	Parser getParser();


	/**
	 * 设置解析器
	 * @param parser
	 */
	void setParser(Parser parser);


	/**
	 * 获取函数管理器
	 * @return
	 */
	FunMgr getFunMgr();


	/**
	 * 设置函数管理器
	 * @param funMgr
	 */
	void setFunMgr(FunMgr funMgr); 


	/**
	 * 设置Context
	 * @param context
	 */
	void setContext(FelContext context);

}
