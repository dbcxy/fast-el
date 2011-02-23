package com.greenpineyu.fel.function.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.greenpineyu.fel.function.CommonFunction;

/**
 * 将字符串转换成日期时间函数
 * 
 * @author 钟杰
 */
public class DateTime extends CommonFunction {

	public Object call(Object[] arguments) {
		if (arguments.length < 1) {
			throw new NullPointerException(ERROR_ARGS);
		}
		String Defaultformat = "yyyy-MM-dd HH:mm:ss";
		if (arguments.length == 1) {
			String datetime = (String) arguments[0];
			if (datetime == null) {
				throw new NullPointerException(ERROR_ARGS);
			}
			SimpleDateFormat sdf = new SimpleDateFormat(Defaultformat);
			Date date = null;
			try {
				date = sdf.parse(datetime);
			} catch (ParseException e) {
				throw new IllegalArgumentException("传入的日期时间错误,解析失败!");
			}
			return date;
		} else {
			String datetime = (String) arguments[0];
			String format = (String) arguments[1];
			SimpleDateFormat srcSdf = new SimpleDateFormat(format);
			Date date = null;
			try {
				date = srcSdf.parse(datetime);
			} catch (ParseException e) {
				throw new IllegalArgumentException("传入的日期时间错误,解析失败!");
			}
			return date;
		}
	}

	public String getName() {
		return "datetime";
	}

}
