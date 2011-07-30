package com.greenpineyu.fel.common;

import java.lang.reflect.Method;
import java.util.Date;

public class ReflectUtil {
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
	public static Method findMethod(Class<?> cls,String attr){
		if(attr == null || "".equals(attr)){
			return null;
		}
		String firstUpper = String.valueOf(attr.charAt(0)).toUpperCase()+attr.substring(1);
		String isMethod = "is"+firstUpper;
		String getMethod = "get"+firstUpper;
		Method[] methods = cls.getMethods();
		for (Method m : methods) {
			String name = m.getName();
			if(name.equals(attr) ||name.equals(getMethod)||name.equals(isMethod)){
				return m;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		findMethod(Date.class, "time");
	}

}
