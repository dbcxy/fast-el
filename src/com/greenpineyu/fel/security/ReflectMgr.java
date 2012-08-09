package com.greenpineyu.fel.security;

import java.lang.reflect.Method;
import java.util.Set;

public interface ReflectMgr {

	/**
	 * 是否允许访问某个方法
	 * @param m
	 * @return
	 */
	boolean isCallable(Method m);

	/**
	 * 添加可访问的方法
	 * @param m
	 */
	void addCallableMethod(Method m);

	void removeCallableMethod(Method m);

	/**
	 * 添加不可访问的方法
	 * @param m
	 */
	void addUncallableMethod(Method m);

	void removeUncallableMethod(Method m);

	Set<Method> getCallableMethods();

	Set<Method> getUnCallableMethods();


}
