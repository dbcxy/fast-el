package com.greenpineyu.fel.compile;

public class JavaSource {

	/**
	 * 类名，不包含包名
	 */
	private String simpleName;
	
	/**
	 * java源码
	 */
	private String source;
	
	/**
	 * 包名
	 */
	private String packageName;
	
	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getSimpleName() {
		return simpleName;
	}

	public void setSimpleName(String name) {
		this.simpleName = name;
	}

	public String getName(){
		return packageName + "." + simpleName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}



}
