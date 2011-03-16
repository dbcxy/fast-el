package com.greenpineyu.fel.function.math;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 绝对值函数
 * 
 * @author 
 */
public class Abs extends CommonFunction {

	public Object call(Object[] arguments) {
		if (arguments.length < 1) {
			throw new NullPointerException(ERROR_ARGS);
		}
		Object obj = arguments[0];
		if (obj instanceof Number) {
			return NumberUtil.parseNumber(Math.abs(((Number) obj).doubleValue()));
		}
		return new Integer(0);
	}

	public String getName() {
		return "abs";
	}

}
