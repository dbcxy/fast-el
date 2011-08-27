package com.greenpineyu.fel.context;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ObjectUtils.Null;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class MapContext implements FelContext {
	/**
	 * 保存脚本上下文的变量
	 */
	private Map<Object, Object> varMap;

	public MapContext() {
		this.varMap = new HashMap<Object, Object>();
	}

	public Object get(Object name) {
		Object object = this.varMap.get(name);
		if(object!=null || this.varMap.containsKey(name)){
			//对象有值，或者包含此变量时，返回object
			return object;
		}
		//map中不包含此变量返回NOT_FOUND
		return NOT_FOUND;
	}

	public Class<?> getVarType(String varName) {
		return getVarType(varName,this);
	}

	public static Class<?> getVarType(String varName, FelContext ctx) {
		Object var = ctx.get(varName);
		if (var != null) {
			return var.getClass();
		}
		return NotFound.class;
	}

	public static String toString(Object var) {
		return var == null ? null : var.toString();
	}

	public void set(String name, Object value) {
		this.varMap.put(name, value);
	}

	public Object clone() {
		try {
			MapContext clone = (MapContext) super.clone();
			return clone;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
