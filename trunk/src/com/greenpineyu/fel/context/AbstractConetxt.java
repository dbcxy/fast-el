package com.greenpineyu.fel.context;

import org.omg.CosNaming.NamingContextPackage.NotFound;

public abstract class AbstractConetxt implements FelContext{


	public void set(String name, Object value) {
		throw new UnsupportedOperationException(this.getClass().getSimpleName()+"不能存储变量");
	}

	public Class<?> getVarType(String name) {
		return getVarType(name,this);
	}

	public static Class<?> getVarType(String varName, FelContext ctx) {
		Object var = ctx.get(varName);
		if (var != null) {
			return var.getClass();
		}
		return NotFound.class;
	}
	

}
