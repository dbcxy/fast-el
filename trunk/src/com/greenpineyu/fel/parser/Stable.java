package com.greenpineyu.fel.parser;

public interface Stable {
	
	/**
	 * 此节点的值是否固定不变
	 * 如果每次求节点值都相同，说明此节点是稳定的。
	 * @return
	 */
	boolean stable();

}
