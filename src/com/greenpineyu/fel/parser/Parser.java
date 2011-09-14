package com.greenpineyu.fel.parser;

/**
 * 用于分析表达式
 * 
 * @author yuqingsong
 * 
 */
public interface Parser {

	/**
	 * 将表达式解析成节点
	 * 
	 * @param exp
	 * @return
	 */
	FelNode parse(String exp);

}
