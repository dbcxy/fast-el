package com.greenpineyu.fel.function.math;

import com.greenpineyu.fel.common.NumberUtils;
import com.greenpineyu.fel.function.CommonFunction;


public class Round extends CommonFunction {

	public Object call(Object[] arguments) {
		if (arguments.length < 2) {
			throw new NullPointerException(ERROR_ARGS);
		}
		Object localObject1 = arguments[0];
		Object localObject2 = arguments[1];
		double d1 = 1.0D;
		if (((localObject1 instanceof Number)) && ((localObject2 instanceof Number))) {
			double d2 = ((Number) localObject1).doubleValue();
			int i = 0;
			if (d2 < 0.0D) {
				d2 = Math.abs(d2);
				i = 1;
			}
			int j;
			double d3;
			if (((Number) localObject2).intValue() < 0) {
				for (j = 1; j <= -1 * ((Number) localObject2).intValue(); j++) {
					d1 *= 10.0D;
				}
				if (((Number) localObject1).doubleValue() >= 0.0D) {
					d3 = Math.round(d2 / d1) * d1;
				} else {
					d3 = Math.round(d2 / d1) * d1;
				}
			} else if (((Number) localObject2).intValue() == 0) {
				if (((Number) localObject1).doubleValue() >= 0.0D) {
					d3 = Math.round(d2);
				} else {
					d3 = Math.round(d2);
				}
			} else {
				for (j = 1; j <= ((Number) localObject2).intValue(); j++) {
					d1 *= 10.0D;
				}
				if (((Number) localObject1).doubleValue() >= 0.0D) {
					d3 = Math.round(d2 * d1) / d1;
				} else {
					d3 = Math.round(d2 * d1) / d1;
				}
			}
			if (i != 0) {
				//return new Double(-d3);
				return NumberUtils.parseNumber(-d3);
			}
			//return new Double(d3);
			return NumberUtils.parseNumber(d3);
		}
		return new Integer(0);
	}

	public String getName() {
		return "round";
	}

}
