package com.greenpineyu.fel.compile;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;
import com.greenpineyu.fel.parser.Optimizable;

public interface SourceGenerator {
	
	/**
	 * 获取表达式JAVA源代码
	 * @param node TODO
	 * @return 
	 */
	JavaSource getSource(FelContext ctx, FelNode node);
	
	void addOpti(Optimizable opti);
	
	
}
