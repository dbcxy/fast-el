package com.greenpineyu.fel.function.datetime;

import java.util.Date;

import com.greenpineyu.fel.function.CommonFunction;

/**
 * 获得系统此刻的日期时间
 * 
 * @author 钟杰
 */
public class Now extends CommonFunction {

	public Object call(Object[] arguments) {
		return new Date();
	}

	public String getName() {
		return "now";
	}

}
