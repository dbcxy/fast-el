package com.greenpineyu.fel.function.datetime;

import java.util.Date;
import java.util.GregorianCalendar;

import com.greenpineyu.fel.function.CommonFunction;

/**
 * 取得指定日期所在的月份,数值介于1到12之间。
 * 
 * @author 钟杰
 */
public class Month extends CommonFunction {

	public Object call(Object[] arguments) {
		if (arguments.length < 1) {
			throw new NullPointerException(ERROR_ARGS);
		}
		Date localDate = (Date) arguments[0];
		GregorianCalendar localGregorianCalendar = new GregorianCalendar();
		localGregorianCalendar.setTime(localDate);
		return new Integer(localGregorianCalendar.get(2) + 1);
	}

	public String getName() {
		return "month";
	}

}
