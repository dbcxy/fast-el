package com.greenpineyu.fel.context;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author yuqingsong
 * 
 */
/*
 * 更合适的实现方式是使用组合，而不是继承，这里继承HashMap是为了提高get方法的效率。
 */
@SuppressWarnings("serial")
public class MapContext extends HashMap<String, Var> implements FelContext {
	public MapContext() {
	}
	
	public MapContext(Map<String,Object> map){
//		this.putAll(map);
		if(map != null){
			for (Map.Entry<String, Object> e : map.entrySet()) {
				String name = e.getKey();
				Object value = e.getValue();
				this.set(name, value);
			}
		}
	}

	@Override
	public Object get(String name) {
		Var object = super.get(name);
		if (object != null) {
			// 对象有值，或者包含此变量时，返回object
			return object.getValue();
		}
		return null;
		// map中不包含此变量返回NOT_FOUND
//		return NOT_FOUND;
	}

//	@Override
//	public Class<?> getVarType(String varName) {
//		return AbstractConetxt.getVarType(varName,this);
//	}


	@Override
	public void set(String name, Object value) {
		// 如果变量已经存在，就不再重复创建变量。
		Var var = getVar(name);
		if (var != null) {
			var.setValue(value);
		} else {
			this.put(name, new Var(name, value));
		}
	}

	public static String toString(Object var) {
		return var == null ? null : var.toString();
	}

	@Override
	public Var getVar(String name) {
		return super.get(name);
	}

	@Override
	public void setVar(Var var) {
		super.put(var.getName(), var);
	}

}
