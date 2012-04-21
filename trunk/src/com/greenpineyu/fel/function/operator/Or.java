package com.greenpineyu.fel.function.operator;

import java.util.List;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

public class Or extends And {
	
	/** 
	 * 求逻辑或(||)
	 * @see com.greenpineyu.fel.function.operator.And#logic(com.greenpineyu.fel.context.FelContext, java.util.List)
	 */
	Boolean logic(FelContext context, List<FelNode> children) {
		Boolean leftValue = toBoolean(context, children.get(0));
		if (leftValue.booleanValue()) {
			return leftValue;
		}
		return toBoolean(context, children.get(1));
	}
	
	@Override
	public String getName() {
		return "||";
	}

}
