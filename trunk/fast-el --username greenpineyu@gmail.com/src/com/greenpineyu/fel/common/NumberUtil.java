package com.greenpineyu.fel.common;


public class NumberUtil {
	/**
	 * 自动转换为更小类型的对象返回
	 * 
	 * @param i
	 * @return
	 */
	public static Object parseNumber(int i) {
		short s = (short) i;
		if (s == i) {
			return new Short(s);
		}
		return new Integer(i);
	}

	/**
	 * @see NumberUtil#parseNumber(int)
	 */
	public static Object parseNumber(long l) {
		int i = (int) l;
		if (i == l) {
			return parseNumber(i);
		}
		return new Long(l);
	}

	/**
	 * @see NumberUtil#parseNumber(int)
	 */
	public static Object parseNumber(float f) {
		int i = (int) f;
		if (i == f) {
			return parseNumber(i);
		}
		return new Float(f);
	}

	/**
	 * @see NumberUtil#parseNumber(int)
	 */
	public static Object parseNumber(double d) {
		float f = (float) d;
		if (f == d) {
			return parseNumber(f);
		}
		return new Double(d);
	}

	/**
	 * 将字符串转换成数值
	 * @param str
	 * @return
	 */
	public static Object parseNumber(String str) {
		if (str != null) {
			String trimValue = str.trim();
			try {
				return NumberUtil.parseNumber(Double.parseDouble(trimValue));
			} catch (NumberFormatException e) {
			}
		}
		return null;
	}

}
