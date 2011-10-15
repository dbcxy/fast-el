package com.greenpineyu.fel.context;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author yuqingsong
 * 
 */
/*
 * 更合适的实现方式是使用组合，而不是继承，这里继承HashMap是为了提供get方法的效率。
 */
@SuppressWarnings("serial")
public class MapContext extends HashMap<String, Object> implements FelContext {

	public MapContext() {
	}
	
	public MapContext(Map<String,Object> map){
		this.putAll(map);
	}

	@Override
	public Object get(String name) {
		Object object = super.get(name);
		if (object != null || this.containsKey(name)) {
			// 对象有值，或者包含此变量时，返回object
			return object;
		}
		// map中不包含此变量返回NOT_FOUND
		return NOT_FOUND;
	}

	@Override
	public Class<?> getVarType(String varName) {
		return AbstractConetxt.getVarType(varName,this);
	}


	@Override
	public void set(String name, Object value) {
		this.put(name, value);
	}

	public static String toString(Object var) {
		return var == null ? null : var.toString();
	}

}
