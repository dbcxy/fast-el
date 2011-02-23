package com.greenpineyu.fel.function.math;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 余弦函数
 * 
 * @author 钟杰
 */
public class Cos extends CommonFunction {

	public Object call(Object[] arguments) {
		if (arguments.length < 1) {
			throw new NullPointerException(ERROR_ARGS);
		}
		Object obj = arguments[0];
		if (obj instanceof Number) {
			return NumberUtil.parseNumber(Math.cos(((Number) obj).doubleValue()));
		}
		return new Integer(0);
	}

	public String getName() {
		return "cos";
	}

}
