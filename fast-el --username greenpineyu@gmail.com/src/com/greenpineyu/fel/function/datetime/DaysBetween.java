package com.greenpineyu.fel.function.datetime;

import java.util.Date;

import com.greenpineyu.fel.function.CommonFunction;

public class DaysBetween extends CommonFunction {

	public Object call(Object[] arguments) {
		if (arguments.length < 2 || !(arguments[0] instanceof Date) || !(arguments[1] instanceof Date)) {
			throw new NullPointerException(ERROR_ARGS);
		}
		Date localDate1 = (Date) arguments[0];
		Date localDate2 = (Date) arguments[1];
		int i = Math.abs((int)((localDate1.getTime() - localDate2.getTime()) / 86400000.0D));
		return new Integer(i);
	}

	public String getName() {
		return "daysBetween";
	}

}
