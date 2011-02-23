package com.greenpineyu.fel.function.operator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.antlr.AstNode;
import com.greenpineyu.fel.antlr.AstNodeImpl;
import com.greenpineyu.fel.antlr.FunAstNode;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.CommonFunction;
import com.greenpineyu.fel.function.Function;

public class Dot implements Function {

	static final Map PRIMITIVE_TYPES;
	static {
		PRIMITIVE_TYPES = new HashMap();
		PRIMITIVE_TYPES.put(Boolean.class, Boolean.TYPE);
		PRIMITIVE_TYPES.put(Byte.class, Byte.TYPE);
		PRIMITIVE_TYPES.put(Character.class, Character.TYPE);
		PRIMITIVE_TYPES.put(Double.class, Double.TYPE);
		PRIMITIVE_TYPES.put(Float.class, Float.TYPE);
		PRIMITIVE_TYPES.put(Integer.class, Integer.TYPE);
		PRIMITIVE_TYPES.put(Long.class, Long.TYPE);
		PRIMITIVE_TYPES.put(Short.class, Short.TYPE);
	}
	public static final String DOT = ".";


	public String getName() {
		return DOT;
	}

	public Object call(AstNode node, FelContext context) {
		//		System.out.println("call dot:" + node.toString());
		Object returnMe = null;
		List children = node.getChildren();
		Object left = children.get(0);
		if (left instanceof Expression) {
			Expression exp = (Expression) left;
			context.setCbEnabled(false);
			left = exp.eval(context);
			context.setCbEnabled(true);
		}
		Object right = children.get(1);
		if (right instanceof AstNode) {
			AstNode exp = (AstNode) right;
			if (exp instanceof FunAstNode) {
				//是函数，调用left中的方法
				returnMe = callMethod(left, exp, context);
			} else {
				//是属性，调用left中的属性
				returnMe = callGet(left, exp.getText());
			}
		}
		return returnMe;
	}

	private static Class getPrimitiveType(Class clz){
		Class primitive = (Class) PRIMITIVE_TYPES.get(clz);
		return primitive == null ? clz : primitive;
	}

	private static Object callMethod(Object obj,AstNode node,FelContext context){
		Class[] argsType = null;
		Method method = null;
		Object[] args = null;
		if (node.getChildCount() == 1 && node.getChildren().get(0) == AstNodeImpl.NULL_NODE) {

		} else {
			args = CommonFunction.evalArgs(node, context);
			if (!ArrayUtils.isEmpty(args)) {
				argsType = new Class[args.length];
				for (int i = 0; i < args.length; i++) {
					Class argType = args[i].getClass();
					argsType[i] = getPrimitiveType(argType);
				}
			}
		}
		method = getMethod(obj.getClass(), node.getText(), argsType);
		return invoke(obj, method, args);
		
	}

	/**
	 * 调用 getXxx、isXxx、get(property)获取属性值
	 * @param obj
	 * @param property
	 * @return
	 */
	private static Object callGet(Object obj, String property) {
		if (obj == null){
			return null;
		}
		
		//查找方法的顺序 :getProperty->isProperty->get
		Class clz = obj.getClass();
		Method get = null;
		Object[] args = null;
		String firstUpper = property.substring(0,1).toUpperCase()+property.substring(1);
		//获取getPrpperty
		get = getMethod(clz, "get"+firstUpper, null);
		if(get == null){
			//获取isPrpperty
			get = getMethod(clz, "is" + firstUpper, null);
		}

		if(get == null){
			//获取get
			String name = "get";
			Class[] parameterTypes = new Class[] { String.class };
			get = getMethod(clz, name, parameterTypes);
			args = new Object[] { property };
		}
		
		if (get == null) {
			return null;
		}
		return invoke(obj, get, args);
	}

	/**
	 * 调用方法
	 * @param obj
	 * @param method
	 * @param args
	 * @return
	 */
	private static Object invoke(Object obj, Method method, Object[] args) {
		try {
			return method.invoke(obj, args);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 获取方法对象
	 * @param clz
	 * @param name
	 * @param parameterTypes
	 * @return
	 */
	private static Method getMethod(Class clz, String name, Class[] parameterTypes) {
		Method get = null;
		try {
			get = clz.getMethod(name, parameterTypes);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return get;
	}

}
