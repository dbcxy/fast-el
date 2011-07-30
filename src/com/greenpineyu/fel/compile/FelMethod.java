package com.greenpineyu.fel.compile;

/**
 *
 */
public class FelMethod {
	
	private Class<?> returnType;
	
	private String code;
	
	
	public FelMethod(Class<?> returnType,String code){
		this.returnType = returnType;
		this.code = code;
	}


	public Class<?> getReturnType() {
		return returnType;
	}


	public void setReturnType(Class<?> returnType) {
		this.returnType = returnType;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}

}
