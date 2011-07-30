package com.greenpineyu.fel.function.operator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.Foo;
import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.CommonFunction;
import com.greenpineyu.fel.function.Function;
import com.greenpineyu.fel.parser.AbstFelNode;
import com.greenpineyu.fel.parser.FelNode;
import com.greenpineyu.fel.parser.FunNode;

public class Dot implements Function {

	static final Map<Class<?>,Class<?>> PRIMITIVE_TYPES;
	static {
		PRIMITIVE_TYPES = new HashMap<Class<?>,Class<?>>();
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

	public Object call(FelNode node, FelContext context) {
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
		if (right instanceof FelNode) {
			FelNode exp = (FelNode) right;
			if (exp instanceof FunNode) {
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

	private static Object callMethod(Object obj,FelNode node,FelContext context){
		Class[] argsType = null;
		Method method = null;
		Object[] args = null;
		if (node.getChildCount() == 1 && node.getChildren().get(0) == AbstFelNode.NULL_NODE) {

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
		
		Method get = getMethod(obj, property);
		
		if (get == null) {
			return null;
		}
		Object[] args = null;
		if(get.getName().equals("get")){
			args = new Object[] { property };
		}
		return invoke(obj, get, args);
	}

	private static Method getMethod(Object obj, String property) {
		//查找方法的顺序 :getProperty->isProperty->get
		Class<?> clz = obj.getClass();
		Method get = null;
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
			Class<String>[] parameterTypes = new Class[] { String.class };
			get = getMethod(clz, name, parameterTypes);
		}
		return get;
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
	
	

	public FelMethod toMethod(FelNode node, FelContext context) {
		
		StringBuilder sb = new StringBuilder();
		List<FelNode> children = node.getChildren();
		FelNode l = children.get(0);
		FelMethod leftMethod = l.toMethod(context);
		Class<?> cls = leftMethod.getReturnType();
		String objType = "";
		if(cls !=null){
			objType = cls.getName();
		}
		sb.append("(");
		sb.append(leftMethod.getCode());
		sb.append(").");
		FelNode rightNode = children.get(1);
		Method method = ReflectUtil.findMethod(cls, rightNode.getText());
		String rightMethod = rightNode.getText();
		if(method!=null){
			rightMethod = method.getName();
		}
		String rightMethodParam = "";
		List<FelNode> params = rightNode.getChildren();
		if(params!= null && !params.isEmpty()&&method.getParameterTypes().length>0){
			for (FelNode n : params) {
				FelMethod paramMethod = n.toMethod(context);
				rightMethodParam+=paramMethod.getCode()+",";
			}
		}
		if(rightMethodParam.endsWith(",")){
			rightMethodParam =rightMethodParam.substring(0,rightMethodParam.length()-1);
		}
		rightMethod+="("+rightMethodParam+")";
		
		sb.append(rightMethod);
		
		
		
		/*
		Object returnMe = null;
		List children = child; 
		Object left = children.get(0);
		if (left instanceof Expression) {
			Expression exp = (Expression) left;
			context.setCbEnabled(false);
			left = exp.eval(context);
			context.setCbEnabled(true);
		}
		Object right = children.get(1);
		if (right instanceof FelNode) {
			FelNode exp = (FelNode) right;
			if (exp instanceof FunNode) {
				//是函数，调用left中的方法
				returnMe = callMethod(left, exp, context);
			} else {
				//是属性，调用left中的属性
				returnMe = callGet(left, exp.getText());
			}
		}*/
		FelMethod returnMe = new FelMethod( method == null?null:method.getReturnType(), sb.toString());
		return returnMe;
	}
	
	
	
	public static void main(String[] args) {
		FelEngine e = new FelEngineImpl();
		String a = "abcd";
		FelContext ctx = e.getContext();
		ctx.set("a", a);
		Foo foo = new Foo("aFoo");
		ctx.set("foo", foo);
		ctx.set("A", 2);
		ctx.set("B", 3);
		String text = "a.substring(1).substring(1)";
		text = "foo.getCount()";
		text = "A*B";
		text = "1+'2'+1";
		text = "-1";
		text = "+1";
		text = "\"foo\" + \"bar\" == \"foobar\"";
		text = "foo.getCount()";
		text = "\"abc\".indexOf('bc')";
		text = "\"abc\".substring(1)";
		FelNode parse = e.parse(text);
		Object result = e.eval(text);
		System.out.println(result);
		Expression exp = e.compiler(text, null);
		Object eval = exp.eval(ctx);
		System.out.println(eval);
		testEff();
	}
	
	static public void testEff(){
		String str = "40.52334+60*(21.8144+17*32.663)";
			FelEngine e = new FelEngineImpl();
			double d = 40.52334+60*(21.8144+17*32.663);
			System.out.println(d);
			
			long start = System.currentTimeMillis();
		Expression compiler = e.compiler(str, null);
		System.out.println(compiler.eval(null));
		int count =100*1000*1000;
		for(int i = 0;i<count;i++){
			compiler.eval(null);
		}
		long end = System.currentTimeMillis();
		System.out.println("cost:"+(end - start));
		
	}
	

}
