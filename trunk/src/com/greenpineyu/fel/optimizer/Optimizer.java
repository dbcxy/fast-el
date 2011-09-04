package com.greenpineyu.fel.optimizer;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 优化器
 * @author yuqingsong
 *
 */
public interface Optimizer  {
	
	
	FelNode call(FelContext ctx, FelNode node);
}
