package com.greenpineyu.fel.function.operator;

public class NotEqual extends Equal {
	
	@Override
	boolean compare(Object left, Object right) {
		return equals(left, right)==false;
	}
	
	@Override
	String toMethod(String left, String right) {
		return  "ObjectUtils.notEqual(" + left + "," + right + ")";
	}
	
	@Override
	public String getName() {
		return "!=";
	}

}
