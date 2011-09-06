package com.greenpineyu.fel.context;



public interface FelContext {
	
	/**
	 * 如果Context未找到变量，返回NOT_FOUND对象
	 */
	Object NOT_FOUND = new Object();
	
	Object NULL = new Object();
	
	/**
	 * 获取变量值
	 * @param name 变量名称
	 * @return 变量值，如果没有找到变量，返回FelContext.NOT_FOUND
	 */
	Object get(Object name);

	/**
	 * 设置变量
	 * @param name 变量名称
	 * @param value 变量值
	 */
	void set(String name, Object value);
	
	/**
	 * 设置变量类型
	 * @param type
	 * @param vars
	 */
//	void setVarType(Class<?> type,String... vars);

	
	/**
	 * 获取某个变量的类型
	 * @param 变量名称
	 * @return 如果变量值 为null或没有找到变量，请返回FelContext.NOT_FOUND.class
	 */
	Class<?> getVarType(String name);

}
