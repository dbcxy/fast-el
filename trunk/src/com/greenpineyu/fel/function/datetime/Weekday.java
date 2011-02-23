package com.greenpineyu.fel.function.datetime;

import java.util.Date;
import java.util.GregorianCalendar;

import com.greenpineyu.fel.function.CommonFunction;

/**
 * 取得指定日期的星期几,数值介于1到7之间。
 * 
 * @author 钟杰
 */
public class Weekday extends CommonFunction {

	public Object call(Object[] arguments) {
		if (arguments.length < 1) {
			throw new NullPointerException(ERROR_ARGS);
		}
		Date localDate = (Date) arguments[0];
		GregorianCalendar localGregorianCalendar = new GregorianCalendar();
		localGregorianCalendar.setTime(localDate);
		if (localGregorianCalendar.get(7) == 1) {
			return new Integer(7);
		} else {
			return new Integer(localGregorianCalendar.get(7) - 1);
		}
	}

	public String getName() {
		return "weekday";
	}

}
