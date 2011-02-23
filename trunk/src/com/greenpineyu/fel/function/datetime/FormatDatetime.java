package com.greenpineyu.fel.function.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.greenpineyu.fel.function.CommonFunction;

public class FormatDatetime extends CommonFunction {

	public Object call(Object[] arguments) {
		if (arguments.length < 1 || !(arguments[0] instanceof Date)) {
			throw new NullPointerException(ERROR_ARGS);
		}
		Date localObject = (Date) arguments[0];
		String format = "yyyy-MM-dd HH:mm:ss";
		if (arguments.length == 2) {
			format = (String) arguments[1];
		}
		return new SimpleDateFormat(format).format(localObject);
	}

	public String getName() {
		return "formatDatetime";
	}

}
