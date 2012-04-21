package com.greenpineyu.fel.common;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectUtil {
	
	/**
	 * key为基本类型及其包装类型，value为包装类型
	 */
	static final Map<Class<?>,Class<?>> wrapperCls;
	/**
	 * key为基本类型及其包装类型，value为基本类型
	 */
	static final Map<Class<?>,Class<?>> primitiveCls;
	
	static final Map<Class<?>,Class<?>> numberClassMap;
	static{
		 numberClassMap = wrapperNumberCls();
		 primitiveCls = new HashMap<Class<?>, Class<?>>(primitiveNumberCls());
		 primitiveCls.put(boolean.class, boolean.class);
		 primitiveCls.put(Boolean.class, boolean.class);
		 
		 wrapperCls = new HashMap<Class<?>, Class<?>>(wrapperNumberCls());
		 wrapperCls.put(boolean.class, Boolean.class);
		 wrapperCls.put(Boolean.class, Boolean.class);
	}
	
	private static Map<Class<?>,Class<?>> primitiveNumberCls() {
		Map<Class<?>,Class<?>> map = new HashMap<Class<?>, Class<?>>();
		 map.put(byte.class, byte.class);
		 map.put(Byte.class, byte.class);
		 
		 map.put(short.class, short.class);
		 map.put(Short.class, short.class);
		 
		 map.put(int.class, int.class);
		 map.put(Integer.class, int.class);
		 
		 map.put(long.class, long.class);
		 map.put(Long.class, long.class);
		 
		 map.put(float.class, float.class);
		 map.put(Float.class, float.class);
		 
		 map.put(double.class, double.class);
		 map.put(Double.class, double.class);
		 
		 map.put(char.class, char.class);
		 map.put(Character.class, char.class);
		 return map;
	}

	private static Map<Class<?>,Class<?>> wrapperNumberCls() {
		Map<Class<?>,Class<?>> map = new HashMap<Class<?>, Class<?>>();
		 map.put(byte.class, Byte.class);
		 map.put(Byte.class, Byte.class);
		 
		 map.put(short.class, Short.class);
		 map.put(Short.class, Short.class);
		 
		 map.put(int.class, Integer.class);
		 map.put(Integer.class, Integer.class);
		 
		 map.put(long.class, Long.class);
		 map.put(Long.class, Long.class);
		 
		 map.put(float.class, Float.class);
		 map.put(Float.class, Float.class);
		 
		 map.put(double.class, Double.class);
		 map.put(Double.class, Double.class);
		 
		 map.put(char.class, Character.class);
		 map.put(Character.class, Character.class);
		 return map;
	}
	
	/**
	 * 是基本类型中的数值类型(包含包装类型)
	 * @return
	 */
	public static boolean isPrimitiveOrWrapNumber(Class<?> c){
		return numberClassMap.containsKey(c);
	}
	public static boolean isPrimitiveNumber(Class<?> c){
		if(c == null){
			return false;
		}
		return c.isPrimitive()&&(c!=boolean.class);
//		return numberClassMap.containsKey(c);
	}
	
	public static Class<?> toWrapperClass(Class<?> c){
		return wrapperCls.get(c);
	}
	public static Class<?> toPrimitiveClass(Class<?> c){
		return primitiveCls.get(c);
	}
	
/*
	public static void main(String[] args) {
		System.out.println((1+"2"+3));
		int[] a = new int[]{5,4,3,2,10,100,1};
		sort(a);
		System.out.println(Arrays.toString(a));
	}*/
	
	public static void sort(int[] array){
		for (int i = 1; i < array.length; i++) {
			int j = i-1;
			int current = array[i];
			for(;j>-1&&current<array[j];j--){
				array[j+1]=array[j];
			}
			array[j+1]=current;
		}
		
	}
	
	
	/**
	 * 查找方法，包含get方法和is方法。
	 * @param cls
	 * @param attr
	 * @return
	 */
	public static Method findMethod(Class<?> cls,String attr,Class<?>[] paramTypes){
		if(attr == null || "".equals(attr)){
			return null;
		}
		String firstUpper = String.valueOf(attr.charAt(0)).toUpperCase()+attr.substring(1);
		Method[] methods = cls.getMethods();
		
		Method finalMethod = null;
		String[] methodNames = new String[]{attr,"get"+firstUpper,"is"+firstUpper};
		for (String methodName : methodNames) {
			finalMethod = match(methodName, paramTypes, methods);
			if(finalMethod!=null){
				break;
			}
		}
		return finalMethod;
		
		/*
		String get = "get";
		finalMethod = match(get, paramTypes, methods, finalMethod);
		if(finalMethod!=null){
			return finalMethod;
		}*/
	}

	public static Method getMethod(Class<?> cls,String methodName,Class<?>[] paramTypes){
		Method[] methods = cls.getMethods();
		return match(methodName,paramTypes,methods);
		
	}
	private static Method match(String methodName, Class<?>[] paramValueTypes,
			Method[] methods) {
		Method finalMethod = null;
		//方法名称和参数长度核匹配的方法，当不能精确匹配时，返回此方法 
		Method nameParamLengthEqualsMethod = null;
		out:for (Method m : methods) {
			String name = m.getName();
			if(name.equals(methodName) ){
				Class<?>[] methodParamTypes = m.getParameterTypes();
				if(methodParamTypes!=null&& paramValueTypes != null){
					if(methodParamTypes.length== paramValueTypes.length){
						if(nameParamLengthEqualsMethod == null){
							nameParamLengthEqualsMethod = m;
						}
						
						//比较参数是否匹配
						for (int i = 0; i < methodParamTypes.length; i++) {
							Class<?> c1 = methodParamTypes[i];
							Class<?> c2 = paramValueTypes[i];
							if(!isTypeMatch(c1, c2)){
								//如果不匹配，找下一个方法 
								continue out;
							}
						}
						finalMethod =  m;
						break;
					}
				}else if(ArrayUtils.isEmpty(methodParamTypes)&&ArrayUtils.isEmpty(paramValueTypes)){
					//如果参数都为null,认为是方法是匹配的
					finalMethod = m;
					break;
				}
			}
		}
		return finalMethod == null?nameParamLengthEqualsMethod:finalMethod;
	}
	
	public static boolean isTypeMatch(Class<?> c1,Class<?> c2){
		if(c1 == c2||c2==Null.class){
			//当c2为Null.class时，表示参数值是null,null值可以与任何类型匹配类型
			return true;
		}
		Class<?> w1 = ReflectUtil.toWrapperClass(c1);
		Class<?> w2 = ReflectUtil.toWrapperClass(c2);
		if(w1!=null){
			//可能转换成包装类型
			if(w1==w2){
				//查看包装类型是否相等
				return true;
			}
		}
		//判断c2是不是c1的子类，如果是，返回true
		return c1.isAssignableFrom(c2);
	}
	
	static public String getClassName(Class<?> cls){
		if(cls == null){
			return "null";
		}
		return cls.getCanonicalName();
	}
	
	
}
