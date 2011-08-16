package com.greenpineyu.fel.context;


public interface FelContext {


	/**
	 * Gets the value of a variable.
	 * @param name the variable's name
	 * @return the value
	 */
	Object get(Object name);

	/**
	 * Sets the value of a variable.
	 * @param name the variable's name
	 * @param value the variable's value
	 */
	void set(String name, Object value);

	
	/**
	 * 获取某个变量的类型
	 * @param varName
	 * @return
	 */
	Class<?> getVarType(String varName);

}
