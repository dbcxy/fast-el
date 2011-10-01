package com.greenpineyu.fel.compile;

/**
 * @author yuqingsong
 * 
 */
public class ConstExpSrc extends JavaSource {

	public ConstExpSrc(Object o) {
		this.value = new ConstExp(o);
	}

	private final ConstExp value;

	public ConstExp getValue() {
		return value;
	}

}
