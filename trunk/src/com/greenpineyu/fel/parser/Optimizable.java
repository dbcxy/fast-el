package com.greenpineyu.fel.parser;

import com.greenpineyu.fel.context.FelContext;

/**
 * 可优化的
 * @author yuqingsong
 *
 */
public interface Optimizable  {
	
	
	FelNode optimize(FelContext ctx, FelNode node);
}
