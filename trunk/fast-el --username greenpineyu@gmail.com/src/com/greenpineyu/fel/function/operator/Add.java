package com.greenpineyu.fel.function.operator;

import java.util.Iterator;

import com.greenpineyu.fel.antlr.AstNode;
import com.greenpineyu.fel.context.ScriptContext;
import com.greenpineyu.fel.function.Function;

public class Add implements Function {
	
	private static Add instance;
	
	static{
		instance = new Add();
	}
	private Add(){}
	

	/* (non-Javadoc)
	 * @see com.datanew.excel.script.function.Function#call(com.datanew.excel.script.AstNode, com.datanew.excel.script.context.ScriptContext)
	 */
	public Object call(AstNode node, ScriptContext context) {
		Object returnMe = null;
		boolean isAdd = node.getText().equals("+");
		for (Iterator iterator = node.getChildren().iterator(); iterator.hasNext();) {
			Object child = (Object) iterator.next();
			if (child instanceof AstNode) {
				AstNode childNode = (AstNode) child;
				child = childNode.eval(context);
			}
			if (child instanceof String) {
				if (returnMe == null) {
					returnMe = child;
					continue;
				}
				if (isAdd) {
					returnMe = returnMe + (String) child;
				} else {
					throw new IllegalStateException("calc " + node + " error!");
				}
			}
			if (child instanceof Number) {
				if (returnMe == null) {
					returnMe = child;
					continue;
				}
				Number value = (Number) child;
				if (returnMe instanceof Number) {
					Number r = (Number) returnMe;
					returnMe = new Double(isAdd ? r.doubleValue() + value.doubleValue() : r.doubleValue()
							- value.doubleValue());
				}
			}
		}
		return returnMe;
	}

	public static Add getInstance() {
		return instance;
	}

	public String getName() {
		throw new UnsupportedOperationException("还没有实现[2010-10-19]");
	}

}
