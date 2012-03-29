package com.greenpineyu.fel.context;

public interface ArrayCtx extends FelContext {
	
	/**
	 * 根据索引获取变量值
	 * @param i
	 * @return
	 */
	Object get(int i);
	
	/**
	 * 获取变量的索引
	 * @param name
	 * @return
	 */
	int getIndex(String name);

}
