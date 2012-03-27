package com.greenpineyu.fel.context;

/**
 * 上下文链，可以处理多级上下文。 在获取变量时，先从本级取，取不到再从上级取。 设置变量时，只设置到本级中
 * 
 * @author yuqingsong
 * 
 */
public class ContextChain implements FelContext{

	/**
	 * 上级context
	 */
	private final FelContext parent;
	/**
	 * 本级context
	 */
	private final FelContext current;
	
	public ContextChain(FelContext parent,FelContext current){
		this.parent = parent;
		this.current = current;
	}

	@Override
	public Object get(String name) {
		Var var = this.getVar(name);
		return var != null?var.getValue():null;
	}

	@Override
	public void set(String name, Object value) {
		current.set(name, value);
	}

//	@Override
//	public Class<?> getVarType(String varName) {
//		return AbstractConetxt.getVarType(varName, this);
//	}

	@Override
	public Var getVar(String name) {
		Var object = current.getVar(name);
		if(object != null){
			return object;
		}
		return parent.getVar(name);
	}

	@Override
	public void setVar(Var var) {
		current.setVar(var);
	}

}
