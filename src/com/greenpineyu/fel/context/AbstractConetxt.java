package com.greenpineyu.fel.context;


import com.greenpineyu.fel.common.ReflectUtil;

public abstract class AbstractConetxt implements FelContext{

	@Override
	public void set(String name, Object value) {
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + "不能存储变量");
	}

	@Override
	public Class<?> getVarType(String name) {
		return getVarType(name,this);
	}

	public static Class<?> getVarType(String varName, FelContext ctx) {
		Object var = ctx.get(varName);
		return getVarType(var);
	}

    public static Class<?> getVarType(Object varValue) {
		if (varValue != null) {
			Class<? extends Object> type = varValue.getClass();
		    if(type.isPrimitive()){
				// 基本类型转换成包装类型
				type = ReflectUtil.toWrapperClass(type);
			}
			if (Number.class.isAssignableFrom(type)) {
				type = Number.class;
			}
			return type;
		}
		return NULL.getClass();
	}
	

}
