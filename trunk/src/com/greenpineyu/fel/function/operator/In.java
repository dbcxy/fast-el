package com.greenpineyu.fel.function.operator;

import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名 .script.function.operator 类名 In.java 创建日期 Nov 4,
 * 20101:36:45 PM 作者  版权 
 */
public class In extends CommonFunction {

	private static final In in;

	static {
		in = new In();
	}

	private In() {
	}

	public static In getInstance() {
		return in;
	}

	public Object call(Object[] arguments) {
		if (arguments == null || arguments.length < 2)
			throw new NullPointerException("传入参数数组为空或者参数个数不正确!");

		Object obj = arguments[0];
		for (int j = 1; j < arguments.length; j++) {
			if (arguments[j] == null)
				continue;
			if (arguments[j] instanceof Object[]) {
				Object[] objs = (Object[]) arguments[j];
				for (int i = 0; i < objs.length; i++) {
					boolean result = false;
					try {
						result = EqualsOperator.equals(obj, objs[i]);
					} catch (Exception e) {
						result = false;
					}
					if (result) {
						return Boolean.TRUE;
					}
				}
			} else {
				if (EqualsOperator.equals(obj, arguments[j])) {
					return Boolean.TRUE;
				}
			}
		}
		return Boolean.FALSE;

	}

	public String getName() {
		return "in";
	}

}
