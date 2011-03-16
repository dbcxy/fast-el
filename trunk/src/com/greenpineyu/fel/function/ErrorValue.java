package com.greenpineyu.fel.function;

import com.greenpineyu.fel.parser.FelNode;

/**
 * 包名				.script.function
 * 类名				ERRORVALUE.java
 * 创建日期				Oct 27, 20108:56:26 AM
 * 作者				
 * 版权				
 */
public class ErrorValue {

	/**
	 * 错误节点
	 */
	private FelNode node;

	/**
	 * 错误信息
	 */
	private String errorMsg;

	public ErrorValue(FelNode node,String errorMsg){
		this.node = node;
		this.errorMsg = errorMsg;
	}
	
	public FelNode getNode() {
		return node;
	}

	public void setNode(FelNode node) {
		this.node = node;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String toString() {
		if (errorMsg != null) {
			return errorMsg;
		}
		return "执行脚本出错";
	}

}
