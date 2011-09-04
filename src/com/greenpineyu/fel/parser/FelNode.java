package com.greenpineyu.fel.parser;

import java.util.List;

import org.antlr.runtime.tree.Tree;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.interpreter.Interpreter;

/**
 * 解析后的节点，组成表达式的元素都会被解析成节点。
 * @author yqs
 *
 */
public interface FelNode extends Expression, Tree ,Stable{

	/**
	 * 获取子节点
	 */
	List<FelNode> getChildren();

	/**
	 * 重置解释器
	 * @return
	 */

	void resetInterpreter();
	
	/**
	 * 节点中的解释器是否默认的解释器
	 * @return
	 */
	boolean isDefaultInterpreter();

	Interpreter getInterpreter();

	void setInterpreter(Interpreter interpreter);
	
	void setSourcebuilder(SourceBuilder builder);
	
	
	SourceBuilder toMethod(FelContext ctx);


}
