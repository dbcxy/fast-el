package com.greenpineyu.fel.context;


import com.greenpineyu.fel.common.ReflectUtil;

public abstract class AbstractContext implements FelContext{
	


	// @Override
	// public Object get(String name) {
	// Var var = this.getVar(name);
	// return var==null?null:var.getValue();
	// }
	
	@Override
	public void setVar(Var var) {
		// 设置变量值
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + "不能存储变量");
	}

	@Override
	public void set(String name, Object value) {
		this.setVar(new Var(name,value));
	}

	@Override
	public Var getVar(String name) {
		Object value = get(name);
		return new Var(name, value, null);
	}

	
	public static Class<?> getVarType(String varName, FelContext ctx) {
		Var var = ctx.getVar(varName);
		return var == null?null:var.getType();
	}

    public static Class<?> getVarType(Object varValue) {
    	Class<?> type = null;
		if (varValue != null) {
			type = varValue.getClass();
		}
		return getVarType(type);
	}

	public static Class<?> getVarType(Class<? extends Object> type) {
		if(type == null){
			return NULL.getClass();
		}
		if(type.isPrimitive()){
			// 基本类型转换成包装类型
			type = ReflectUtil.toWrapperClass(type);
		}
		if(ReflectUtil.isPrimitiveOrWrapNumber(type)){
			return type;
		}else if (Number.class.isAssignableFrom(type)) {
			type = Number.class;
		}
		return type;
	}
	

}
