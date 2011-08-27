package com.greenpineyu.fel.context;

import java.util.HashMap;
import java.util.Map;

public class MapContext implements FelContext {
	/**
	 * 保存脚本上下文的变量
	 */
	private Map<String, Object> varMap;

	public MapContext() {
		this(new HashMap<String, Object>());
	}
	
	public MapContext(Map<String,Object> map){
		this.varMap = map;
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
		return AbstractConetxt.getVarType(varName,this);
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
