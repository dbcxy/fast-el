package com.greenpineyu.fel.context;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ObjectUtils.Null;

public class MapContext implements FelContext {
	/**
	 * 保存脚本上下文的变量
	 */
	private Map<Object, Object> varMap;

	public MapContext() {
		this.varMap = new HashMap<Object, Object>();
	}

	public Object get(Object name) {
		return this.varMap.get(name);
	}

	public Class<?> getVarType(String varName) {
		Object var = this.get(varName);
		if (var != null) {
			return var.getClass();
		}
		return Null.class;
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
