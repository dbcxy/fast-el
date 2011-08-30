package com.greenpineyu.fel.common;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils.Null;

public class ReflectUtil {
	
	static final Map<Class<?>,Class<?>> cls;
	static{
		 cls = new HashMap<Class<?>, Class<?>>();
		 cls.put(byte.class, Byte.class);
		 cls.put(Byte.class, Byte.class);
		 
		 cls.put(short.class, Short.class);
		 cls.put(Short.class, Short.class);
		 
		 cls.put(int.class, Integer.class);
		 cls.put(Integer.class, Integer.class);
		 
		 cls.put(long.class, Long.class);
		 cls.put(Long.class, Long.class);
		 
		 cls.put(float.class, Float.class);
		 cls.put(Float.class, Float.class);
		 
		 cls.put(double.class, Double.class);
		 cls.put(Double.class, Double.class);
		 
		 cls.put(boolean.class, Boolean.class);
		 cls.put(Boolean.class, Boolean.class);
		 
		 cls.put(char.class, Character.class);
		 cls.put(Character.class, Character.class);
	}
	
	public static Class<?> toWrapperClass(Class<?> c){
		return cls.get(c);
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
}
