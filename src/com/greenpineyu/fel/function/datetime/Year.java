package com.greenpineyu.fel.function.datetime;

import java.util.Date;
import java.util.GregorianCalendar;

import com.greenpineyu.fel.function.CommonFunction;

/**
 * 从日期型数据中获得年信息
 * 
 * @author 钟杰
 */
public class Year extends CommonFunction {

	public Object call(Object[] arguments) {
		if (arguments.length < 1) {
			throw new NullPointerException(ERROR_ARGS);
		}
		Date localDate = (Date) arguments[0];
		GregorianCalendar localGregorianCalendar = new GregorianCalendar();
		localGregorianCalendar.setTime(localDate);
		return new Integer(localGregorianCalendar.get(1));
	}

	public String getName() {
		return "year";
	}

}
