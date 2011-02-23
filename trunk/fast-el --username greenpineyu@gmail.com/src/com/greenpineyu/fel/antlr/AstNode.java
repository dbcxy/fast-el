package com.greenpineyu.fel.antlr;

import java.util.List;

import org.antlr.runtime.tree.Tree;

import com.greenpineyu.fel.Expression;

/**
 * @uml.dependency   supplier="com.datanew.excel.script.function.Function"
 * @uml.dependency   supplier="com.datanew.excel.script.context.ScriptContext"
 */
public interface AstNode extends Expression, Tree {



	Object[] getChildrenArray();

	List getChildren();

	/**
	 * 清空缓存结果
	 * @return
	 */

	void resetInterpreter();

	Interpreter getInterpreter();

	void setInterpreter(Interpreter interpreter);



	//	void setType(int type);

	/**
	 * 慎用此方法,此方法会修改节点内容
	 * @param text
	 */

	void setChild(int index, AstNode node);
	



}
