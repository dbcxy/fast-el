package com.greenpineyu.fel.function.math;

import com.greenpineyu.fel.common.NumberUtils;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 平方根函数
 * 
 */
public class Sqrt extends CommonFunction {

	public Object call(Object[] arguments) {
		if (arguments.length < 1) {
			throw new NullPointerException(ERROR_ARGS);
		}
		Object obj = arguments[0];
		if (obj instanceof Number) {
			return NumberUtils.parseNumber(Math.sqrt(((Number) obj).doubleValue()));
		}
		return new Integer(0);
	}

	public String getName() {
		return "sqrt";
	}

}
