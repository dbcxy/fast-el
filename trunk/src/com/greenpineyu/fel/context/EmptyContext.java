package com.greenpineyu.fel.context;


/**
 * 空执行上下文
 * @author yuqingsong
 *
 */
public class EmptyContext implements FelContext{
	
	private static final FelContext instance;
	
	public static FelContext getInstance() {
		return instance;
	}

	static{
		instance= new EmptyContext();
	}
	
	private EmptyContext(){};


	public Object get(Object name) {
		return null;
	}

	public void set(String name, Object value) {
		throw new UnsupportedOperationException("空Context");
	}

	public Class<?> getVarType(String varName) {
		return null;
	}

}
