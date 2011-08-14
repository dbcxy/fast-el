package com.greenpineyu.fel.context;

import java.util.HashMap;
import java.util.Map;

import com.greenpineyu.fel.common.Callback;

public abstract class AbstractContext implements FelContext {

	private FelContext parent;

	private Callback cb;

	/**
	 * 保存脚本上下文的变量
	 */
	private Map<Object, Object> property;

	/**
	 * 是否找到某个变量
	 */
	private boolean isFound;

	/**
	 * 是否禁用callback
	 */
	private boolean cbEnabled;

	public AbstractContext() {
		this.property = new HashMap<Object, Object>();
		cbEnabled = true;
	}

	public Object get(Object name) {
		isFound = false;
		Object object = getObject(name);

		if (isFound) {
			// 本级取到了，调用callback处理对象
			if (cb != null && cbEnabled) {
				return cb.callback(object);
			}
		} else {
			object = this.property.get(toString(name));
			if (object != null) {
				return object;
			}

			// 本级没有取到，从父级中取
			if (this.parent != null) {
				return this.parent.get(name);
			}
		}
		return object;
	}

	/**
	 * 只在本级Context中取对象，只需要返回对象，如果要取对象的值，由callback对象处理
	 * 
	 * @param name
	 * @return
	 */
	abstract protected Object getObject(Object name);

	public Class<?> getValueType(String varName) {
		Object var = this.get(varName);
		if (var != null) {
			return var.getClass();
		}
		return Object.class;
	}

	public static String toString(Object var) {
		return var == null ? null : var.toString();
	}

	public FelContext getParent() {
		return this.parent;
	}

	public boolean has(String name) {
		boolean has = get(name) != null;
		if (has) {
			return has;
		}
		if (this.parent != null) {
			return this.parent.has(name);
		}
		return false;
	}

	public void set(String name, Object value) {
		if (this.property == null) {
			this.property = new HashMap();
		}
		this.property.put(name, value);
	}

	public void setParent(FelContext context) {
		this.parent = context;
	}

	public void setCallback(Callback cb) {
		this.cb = cb;
		// 循环向上设置callback
		FelContext parent = this.parent;
		if (parent != null) {
			parent.setCallback(cb);
		}
	}

	public Callback getCallback() {
		return this.cb;
	}

	public void setFound(boolean isFound) {
		this.isFound = isFound;
	}

	public boolean isFound() {
		return this.isFound;
	}

	public Object clone() {
		try {
			AbstractContext clone = (AbstractContext) super.clone();
			return clone;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean isCbEnabled() {
		return this.cbEnabled;
	}

	public void setCbEnabled(boolean cbEnabled) {
		this.cbEnabled = cbEnabled;
	}

}
