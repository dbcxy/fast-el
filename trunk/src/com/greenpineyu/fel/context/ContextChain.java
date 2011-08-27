package com.greenpineyu.fel.context;

/**
 * 上下文链，可以处理多级上下文。
 * 在获取变量时，先从本级取，取不到再从上级取。
 * 设置变量时，只设置到本级中
 * @author yuqingsong
 *
 */
public class ContextChain implements FelContext{
	
	/**
	 * 上级context
	 */
	private FelContext parent;
	/**
	 * 本级context
	 */
	private FelContext current;
	
	public ContextChain(FelContext parent,FelContext current){
		this.parent = parent;
		this.current = current;
	}

	public Object get(Object name) {
		Object object = current.get(name);
		if(object != NOT_FOUND){
			return object;
		}
		Object parentObj = parent.get(name);
		if(parentObj!=NOT_FOUND){
			return parentObj;
		}
		return NOT_FOUND;
	}

	public void set(String name, Object value) {
		current.set(name, value);
	}

	public Class<?> getVarType(String varName) {
		return AbstractConetxt.getVarType(varName, this);
	}

}
