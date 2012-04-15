package com.greenpineyu.fel.common;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.greenpineyu.fel.function.operator.Add;

/**
 * 包名				.common
 * 类名				NumberUtil.java
 * 创建日期				Oct 26, 20109:14:28 AM
 * 作者				
 * 版权				
 */
public class NumberUtil {
	
	/** Double.MAX_VALUE as BigDecimal. */
    protected static final BigDecimal BIGD_DOUBLE_MAX_VALUE = BigDecimal.valueOf((long) Double.MAX_VALUE);
    /** Double.MIN_VALUE as BigDecimal. */
    protected static final BigDecimal BIGD_DOUBLE_MIN_VALUE = BigDecimal.valueOf((long) Double.MIN_VALUE);
    /** Long.MAX_VALUE as BigInteger. */
    protected static final BigInteger BIGI_LONG_MAX_VALUE = BigInteger.valueOf(Long.MAX_VALUE);
    /** Long.MIN_VALUE as BigInteger. */
    protected static final BigInteger BIGI_LONG_MIN_VALUE = BigInteger.valueOf(Long.MIN_VALUE);

	/**
	 * 转换成Boolean 
	 * @param val
	 * @return
	 * @throws ConvertException 
	 */
	public static boolean toBoolean(Object val) {
		return toBooleanObj(val).booleanValue();
    }

	/**
	 * 转换成Boolean 
	 * @param val
	 * @return
	 * @throws ConvertException 
	 */
	public static Boolean toBooleanObj(Object val) {
		if (val == null) {
			return Boolean.FALSE;
		} else if (val instanceof Boolean) {
			return ((Boolean) val);
		} else if (val instanceof String) {
			return Boolean.valueOf((String) val);
		}
		return Boolean.FALSE;
	}

	/**
	 * 转换成int
	 * @param val
	 * @return
	 * @throws ConvertException 
	 */
	public static int toInteger(Object val) {
        if (val == null) {
        	throw new IllegalArgumentException("Integer coercion exception. arg is null");
        } else if (val instanceof String) {
            if ("".equals(val)) {
                return 0;
            }
            return Integer.parseInt((String) val);
        } else if (val instanceof Character) {
            return ((Character) val).charValue();
        } else if (val instanceof Boolean) {
            throw new IllegalArgumentException("Boolean->Integer coercion exception");
        } else if (val instanceof Number) {
            return ((Number) val).intValue();
        }

        throw new IllegalArgumentException("Integer coercion exception. Can't coerce type: "
                + val.getClass().getName());
    }

	/**
	 * 转换成long
	 * @param val
	 * @return
	 * @throws ConvertException 
	 */
	public static long toLong(Object val) {
        if (val == null) {
        	throw new NumberFormatException("Long coercion exception. arg is null");
        } else if (val instanceof String) {
            if ("".equals(val)) {
                return 0;
            }
            return Long.parseLong((String) val);
        } else if (val instanceof Character) {
            return ((Character) val).charValue();
        } else if (val instanceof Boolean) {
            throw new NumberFormatException("Boolean->Long coercion exception");
        } else if (val instanceof Number) {
            return ((Number) val).longValue();
        }

        throw new NumberFormatException("Long coercion exception. Can't coerce type: " + val.getClass().getName());
    }

	/**
	 * 转换成BigInteger
	 * @param val
	 * @return
	 * @throws ConvertException 
	 */
	public static BigInteger toBigInteger(Object val) {
        if (val instanceof BigInteger) {
            return (BigInteger) val;
        } else if (val == null) {
        	throw new IllegalArgumentException("BigInteger coercion exception. arg is null");
        } else if (val instanceof String) {
            String string = (String) val;
            if ("".equals(string.trim())) {
                return BigInteger.ZERO;
            }
            return new BigInteger(string);
        } else if (val instanceof Number) {
            return new BigInteger(val.toString());
        } else if (val instanceof Character) {
            int i = ((Character) val).charValue();
            return BigInteger.valueOf(i);
        }
        
        throw new IllegalArgumentException("BigInteger coercion exception. Can't coerce type: "
                + val.getClass().getName());
    }

	/**
	 * 转换成BigDecimal
	 * @param val
	 * @return
	 * @throws ConvertException 
	 */
	public static BigDecimal toBigDecimal(Object val) {
        if (val instanceof BigDecimal) {
            return (BigDecimal) val;
        } else if (val == null) {
        	throw new IllegalArgumentException("BigDecimal coercion exception. arg is null");
        } else if (val instanceof String) {
            String string = (String) val;
            if ("".equals(string.trim())) {
                return BigDecimal.valueOf(0);
            }
            return new BigDecimal(string);
        } else if (val instanceof Number) {
            return new BigDecimal(val.toString());
        } else if (val instanceof Character) {
            int i = ((Character) val).charValue();
            return new BigDecimal(i);
        }
        
        throw new IllegalArgumentException("BigDecimal coercion exception. Can't coerce type: "
                + val.getClass().getName());
    }

	/**
	 * 转换成double
	 * @param val
	 * @return
	 * @throws ConvertException 
	 */
	public static double toDouble(Object val) {
        if (val == null) {
        	throw new IllegalArgumentException("Double coercion exception. arg is null");
        } else if (val instanceof String) {
            String string = (String) val;
            if ("".equals(string.trim())) {
                return 0;
            }
            return Double.parseDouble(string);
        } else if (val instanceof Character) {
            int i = ((Character) val).charValue();
            return i;
        } else if (val instanceof Number) {
            return toDouble((Number)val);
        } else if (val instanceof Boolean) {
            throw new IllegalArgumentException("Boolean->Double coercion exception");
        }
        throw new IllegalArgumentException("Double coercion exception. Can't coerce type: "
                + val.getClass().getName());
    }

	/**
	 * 转换成String
	 * @param val
	 * @return
	 */
//	public static String toString(Object val) {
//        if (val == null) {
//            val = "";
//        }
//        if(val.getClass().isArray()){
//			Object[] array = (Object[]) val;
//			if (array.length == 1) {
//				return ObjectUtils.toString(array[0]);
//			}
//			return ArrayUtils.toString(array);
//        }
//        return val.toString();
//    }
	
	public static Number narrow(Number original) {
        if (original == null) {
            return original;
        }
        Number result = original;
        if (original instanceof BigDecimal) {
            BigDecimal bigd = (BigDecimal) original;
            if (bigd.compareTo(BIGD_DOUBLE_MAX_VALUE) > 0) {
                return original;
            }
        }
        if (original instanceof Double || original instanceof Float || original instanceof BigDecimal) {
            double value = original.doubleValue();
            if (value <= Float.MAX_VALUE && value >= Float.MIN_VALUE) {
                result = Float.valueOf(result.floatValue()+"");
            }
        } else {
            if (original instanceof BigInteger) {
                BigInteger bigi = (BigInteger) original;
                if (bigi.compareTo(BIGI_LONG_MAX_VALUE) > 0
                    || bigi.compareTo(BIGI_LONG_MIN_VALUE) < 0) {
                    return original;
                }
            }
            long value = original.longValue();
            if (value <= Byte.MAX_VALUE && value >= Byte.MIN_VALUE) {
                result = Byte.valueOf(value+"");
            } else if (value <= Short.MAX_VALUE && value >= Short.MIN_VALUE) {
                result = Short.valueOf(value+"");
            } else if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE) {
                result = Integer.valueOf(value+"");
            }
        }
        return result;
    }

	/**
	 * 测试是否浮点类型
	 * @param left
	 * @param right
	 * @return
	 */
	public static boolean isFloatingPointType(Object left, Object right) {
        return left instanceof Float || left instanceof Double || right instanceof Float || right instanceof Double;
    }

	/**
	 * 测试是否浮点数
	 * @param val
	 * @return
	 */
	public static boolean isFloatingPointNumber(Object val) {
        if (val instanceof Float || val instanceof Double) {
            return true;
        }
        if (val instanceof String) {
            String string = (String) val;
            return string.indexOf('.') != -1 || string.indexOf('e') != -1 || string.indexOf('E') != -1;
        }
        return false;
    }

	/**
	 * 是否浮点类型
	 * @param o
	 * @return
	 */
	public static boolean isFloatingPoint(final Object o) {
        return o instanceof Float || o instanceof Double;
    }

	/**
	 * 是否数字类型
	 * @param o
	 * @return
	 */
	public static boolean isNumberable(final Object o) {
        return o instanceof Integer
            || o instanceof Long
            || o instanceof Byte
            || o instanceof Short;
    }

	/**
	 * 是否有效数值
	 * @param lhs
	 * @param rhs
	 * @param bigi
	 * @return
	 */
	public static Number narrowBigInteger(Object lhs, Object rhs, BigInteger bigi) {
        if (!(lhs instanceof BigInteger || rhs instanceof BigInteger)
            && bigi.compareTo(BIGI_LONG_MAX_VALUE) <= 0
            && bigi.compareTo(BIGI_LONG_MIN_VALUE) >= 0) {
            long l = bigi.longValue();
            if (!(lhs instanceof Long || rhs instanceof Long)
                && l <= Integer.MAX_VALUE
                && l >= Integer.MIN_VALUE) {
                return Integer.valueOf(l + "");
            }
            return Long.valueOf(l + "");
        }
        return bigi;
    }

	/**
	 * 是否有效参数
	 * @param args
	 * @return
	 */
	public static boolean narrowArguments(Object[] args) {
        boolean narrowed = false;
        for (int a = 0; a < args.length; ++a) {
            Object arg = args[a];
            if (arg instanceof Number) {
                Object narg = narrow((Number) arg);
                if (narg != arg) {
                    narrowed = true;
                }
                args[a] = narg;
            }
        }
        return narrowed;
    }
	

	/**
	 * 自动转换为更小类型的对象返回
	 * 
	 * @param i
	 * @return
	 */
/*	public static Object parseNumber(int i) {
		short s = (short) i;
		if (s == i) {
			return new Short(s);
		}
		return new Integer(i);
	}*/

	/**
	 * @see parseNumber
	 */
	public static Object parseNumber(long l) {
		int i = (int) l;
		if (i == l) {
			return new Integer(i);
		}
		return new Long(l);
	}
	
	/**
	 * @see parseNumber
	 */
	public static Object parseNumber(double d) {
		long f = (long) d;
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
				return parseNumber(Double.parseDouble(trimValue));
			} catch (NumberFormatException e) {
			}
		}
		return null;
	}
	
	
	/**
	 * 将Number转换成double
	 * @param number
	 * @return
	 */
	public static double toDouble(Number number){
		if(number instanceof Float){
			//float转double时，会出现精度问题。"(double)1.1f"的值类似于1.1000000476837158),
			//使用 Double.parseDouble(number.toString());则不会出现问题。
			return Double.parseDouble(number.toString());
		}
		return number.doubleValue();
	}
	
	
	public static <T extends Comparable<T>> int compare(T a,T b){
		if(a != null&& b!=null){
			return a.compareTo(b);
		}
		return a==null?-1:1;
	}

	/**
	 * 计算对象数组
	 * @param obj
	 * @return
	 */
	public static Object calArray(Object obj) {
		if (!(obj instanceof Object[]))
			return obj;
		
		Object result = new Integer(0);
		if (!ArrayUtils.isEmpty((Object[])obj)){
			for (int i=0; i< ((Object[])obj).length;i++){
				result = Add.add(result,((Object[])obj)[i]);
			}
		}
		return result;
	}
	
	/**
	 * 两个类型进行四则运算的结果类型
	 * @param left
	 * @param right
	 * @return
	 */
	public static Class<?> arithmeticClass(Class<?> left,Class<?> right){
		if(isDoubleClass(left)||isDoubleClass(right)){
			return double.class;
		}
		if(isLongClass(left)||isLongClass(right)){
			return long.class;
		}
		return int.class;
//		if(isIntClass(left)){
//			return left;
//		}
//		if(isIntClass(right)){
//			return right;
//		}
//		return int.class;
//		return Double.class;
	}
	
	public static boolean isDoubleClass(Class<?> type){
		return type==Double.class||type == double.class;
	}
	public static boolean isLongClass(Class<?> type){
		return type==Long.class||type == long.class;
	}
//	public static boolean isIntClass(Class<?> type){
//		return type==Integer.class||type == int.class;
//	}
//	public static boolean isShortClass(Class<?> type){
//		return type==Short.class||type == short.class;
//	}
//	public static boolean isCharClass(Class<?> type){
//		return type==Character.class||type == int.class;
//	}
//	public static boolean isByteClass(Class<?> type){
//		return type==Integer.class||type == int.class;
//	}
	
}
