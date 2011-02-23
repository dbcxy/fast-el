package com.greenpineyu.fel.function.math;

import com.greenpineyu.fel.function.CommonFunction;

public class Pi extends CommonFunction {

	public Object call(Object[] arguments) {
		int i = arguments.length;
		double pi = 3.14159265358979D;
		if (i == 0) {
			return new Double(pi);
		} else if (i == 1) {
			Object localObject = arguments[0];
			if ((localObject instanceof Integer)) {
				return new Double(pi * ((Integer) localObject).intValue());
			}
			return new Double(pi);
		}
		return new Double(pi);
	}

	public String getName() {
		return "pi";
	}

}
