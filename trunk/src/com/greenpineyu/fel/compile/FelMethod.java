package com.greenpineyu.fel.compile;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

/**
 *
 */
public class FelMethod implements SourceBuilder {
	
	private Class<?> returnType;
	
	private String code;
	  
	
	public FelMethod(Class<?> returnType,String code){
		this.returnType = returnType;
		this.code = code;
	}


	public Class<?> returnType(FelContext ctx, FelNode node) {
		return returnType;
	}


	public void setReturnType(Class<?> returnType) {
		this.returnType = returnType;
	}


	public String source(FelContext ctx, FelNode node) {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


}
