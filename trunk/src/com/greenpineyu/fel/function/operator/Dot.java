package com.greenpineyu.fel.function.operator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.common.ArrayUtils;
import com.greenpineyu.fel.common.Null;
import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.CommonFunction;
import com.greenpineyu.fel.function.Function;
import com.greenpineyu.fel.parser.FelNode;

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


	@Override
	public String getName() {
		return DOT;
	}

	@Override
	public Object call(FelNode node, FelContext context) {
		//		System.out.println("call dot:" + node.toString());
		List<FelNode> children = node.getChildren();
		Object left = children.get(0);
		if (left instanceof Expression) {
			Expression exp = (Expression) left;
			left = exp.eval(context);
		}
		FelNode right = children.get(1);
			FelNode exp = right;
			Class<?>[] argsType = new Class<?>[0];
//			if(clearNullNode(right) == null){
//				if(right.getChildren()!=null){				
//					right.getChildren().clear();
//				}
//			}
			Object[] args = CommonFunction.evalArgs(right, context);
			if (!ArrayUtils.isEmpty(args)) {
				argsType = new Class[args.length];
				for (int i = 0; i < args.length; i++) {
					if(args[i]==null){
						argsType[i]=Null.class;
						continue;
					}
					argsType[i] = args[i].getClass();
				}
			}
			Method method = null;
		Class<?> cls = left instanceof Class<?> ? (Class<?>) left : left
				.getClass();

				method = ReflectUtil.findMethod(cls, right.getText(),argsType);
		// //是函数，调用left中的方法
//				returnMe = callMethod(left, exp, context);
			if(method == null){
				method = ReflectUtil.findMethod(cls, "get", new Class<?>[]{String.class});
				args = new Object[]{exp.getText()};
			// 是属性，调用left中的属性
//				returnMe = callGet(left, exp.getText());
			}
			if(method != null){
//				method.setAccessible(true);
				return invoke(left, method, args);
			}
			return null;
	}

	/*
	 * private static Class getPrimitiveType(Class clz){ Class primitive =
	 * PRIMITIVE_TYPES.get(clz); return primitive == null ? clz : primitive; }
	 */

	/*
	 * private static Object callMethod(Object obj,FelNode node,FelContext
	 * context){ Class<?>[] argsType = null; Method method = null; Object[] args
	 * = null; if (node.getChildCount() == 1 && node.getChildren().get(0) ==
	 * AbstFelNode.NULL_NODE) {
	 * 
	 * } else { args = CommonFunction.evalArgs(node, context); if
	 * (!ArrayUtils.isEmpty(args)) { argsType = new Class[args.length]; for (int
	 * i = 0; i < args.length; i++) { Class<?> argType = args[i].getClass();
	 * argsType[i] = getPrimitiveType(argType); } } } method =
	 * getMethod(obj.getClass(), node.getText(), argsType); return invoke(obj,
	 * method, args); }
	 */

	/**
	 * 调用 getXxx、isXxx、get(property)获取属性值
	 * 
	 * @param obj
	 * @param property
	 * @return
	 */
	/*
	 * private static Object callGet(Object obj, String property) { if (obj ==
	 * null){ return null; }
	 * 
	 * Method get = getMethod(obj, property); if (get == null) { return null; }
	 * Object[] args = null; if(get.getName().equals("get")){ args = new
	 * Object[] { property }; } return invoke(obj, get, args); }
	 */

	/*
	 * private static Method getMethod(Object obj, String property) { // 查找方法的顺序
	 * :getProperty->isProperty->get Class<?> clz = obj.getClass(); Method get =
	 * null; String firstUpper =
	 * property.substring(0,1).toUpperCase()+property.substring(1); //
	 * 获取getPrpperty get = getMethod(clz, "get"+firstUpper, null); if(get ==
	 * null){ // 获取isPrpperty get = getMethod(clz, "is" + firstUpper, null); }
	 * 
	 * if(get == null){ // 获取get String name = "get";
	 * 
	 * @SuppressWarnings("unchecked") Class<String>[] parameterTypes = new
	 * Class[] { String.class }; get = getMethod(clz, name, parameterTypes); }
	 * return get; }
	 */

	/**
	 * 调用方法
	 * 
	 * @param obj
	 * @param method
	 * @param args
	 * @return
	 */
	public static Object invoke(Object obj, Method method, Object[] args) {
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
	 * 
	 * @param clz
	 * @param name
	 * @param parameterTypes
	 * @return
	 */
	/*
	 * private static Method getMethod(Class<?> clz, String name, Class<?>[]
	 * parameterTypes) { Method get = null; try { get = clz.getMethod(name,
	 * parameterTypes); } catch (SecurityException e) { e.printStackTrace(); }
	 * catch (NoSuchMethodException e) { e.printStackTrace(); } return get; }
	 */
	
	

	@Override
	public FelMethod toMethod(FelNode node, FelContext context) {
		
		StringBuilder sb = new StringBuilder();
		List<FelNode> children = node.getChildren();
		FelNode l = children.get(0);
		SourceBuilder leftMethod = l.toMethod(context);
		Class<?> cls = leftMethod.returnType(context, l);
		String leftSrc = leftMethod.source(context, l);
		if (cls.isPrimitive()) {
			Class<?> wrapperClass = ReflectUtil.toWrapperClass(cls);
			// 如果左边返回的值的基本类型，要转成包装类型[eg:((Integer)1).doubleValue()]
			sb.append("((").append(wrapperClass.getSimpleName()).append(")")
					.append(leftSrc).append(")");
		} else {
			sb.append(leftSrc);
		}
		sb.append(".");
		Method method  = null;
		FelNode rightNode = children.get(1);
		List<FelNode> params = rightNode.getChildren();
		List<SourceBuilder> paramMethods = new ArrayList<SourceBuilder>();
		Class<?>[] paramValueTypes = null;
		boolean hasParam = params!= null && !params.isEmpty();
		String rightMethod = rightNode.getText();
		String rightMethodParam = "";
		if(hasParam){
			// 有参数
			paramValueTypes = new Class<?>[params.size()];
			for (int i = 0; i < params.size(); i++) {
				FelNode p = params.get(i);
				SourceBuilder paramMethod = p.toMethod(context);
				paramMethods.add(paramMethod);
				paramValueTypes[i] = paramMethod.returnType(context, p);
			}
			// 根据参数查找方法
			method = ReflectUtil.findMethod(cls, rightNode.getText(),paramValueTypes);
			if(method != null){
				Class<?>[] paramTypes = method.getParameterTypes();
				/*
				for (int i = 0; i < paramTypes.length; i++) {
					Class<?> paramType = paramTypes[i];
					Class<?> paramValueType = paramValueTypes[i];
					SourceBuilder paramMethod = paramMethods.get(i);
					String paramCode = getParamCode(paramType, paramValueType, paramMethod,context);
					rightMethodParam+=paramCode + ",";
				}
				*/
				for (int i = 0; i < paramTypes.length; i++) {
					Class<?> paramType = paramTypes[i];
					FelNode p = params.get(i);
					String paramCode = getParamCode(paramType, p,context);
					rightMethodParam+=paramCode + ",";
				}
				rightMethod = method.getName();
			}
		}else{
			method = ReflectUtil.findMethod(cls, rightNode.getText(),new Class<?>[0]);
			if(method == null){
				// 当没有找到方法 ，直接使用get方法来获取属性
				method = ReflectUtil.getMethod(cls, "get", new Class<?>[]{String.class});
				if(method!=null){
					rightMethod = "get";
					rightMethodParam ="\""+ rightNode.getText()+"\"";
				}
			}else{
				rightMethod = method.getName();
			}
		}
	
		if(method!=null){
		}
		/*
		if(hasParam && paramTypes.length>0){
		
			for (FelNode n : params) {
				FelMethod paramMethod = n.toMethod(context);
				Class<?> c = paramTypes[i];
				Class<?> wrapperClass = ReflectUtil.toWrapperClass(c);
				String className = null;
				if(wrapperClass!=null){
					className = wrapperClass.getName();
				}else{
					className = c.getName();
				}
				rightMethodParam+="("+className+")"+paramMethod.getCode()+",";
			}
		}
		*/
		if(rightMethodParam.endsWith(",")){
			rightMethodParam =rightMethodParam.substring(0,rightMethodParam.length()-1);
		}
		rightMethod+="("+rightMethodParam+")";
		
		sb.append(rightMethod);

		/*
		 * Object returnMe = null; List children = child; Object left =
		 * children.get(0); if (left instanceof Expression) { Expression exp =
		 * (Expression) left; context.setCbEnabled(false); left =
		 * exp.eval(context); context.setCbEnabled(true); } Object right =
		 * children.get(1); if (right instanceof FelNode) { FelNode exp =
		 * (FelNode) right; if (exp instanceof FunNode) { //是函数，调用left中的方法
		 * returnMe = callMethod(left, exp, context); } else { //是属性，调用left中的属性
		 * returnMe = callGet(left, exp.getText()); } }
		 */
		FelMethod returnMe = new FelMethod( method == null?null:method.getReturnType(), sb.toString());
		return returnMe;
	}

	/**
	 * 获取参数代码
	 * 
	 * @param paramType
	 *            方法声明的参数类型
	 * @param paramValueType
	 *            参数值的类型
	 * @param paramMethod
	 * @return
	 */
	public static String getParamCode(Class<?> paramType,FelNode node,FelContext ctx) {
		// 如果类型相等（包装类型与基本类型（int和Integer)也认为是相等 ），直接添加参数。
		String paramCode = "";
		 SourceBuilder paramMethod = node.toMethod(ctx);
		Class<?> paramValueType = paramMethod.returnType(ctx, node);
		if (ReflectUtil.isTypeMatch(paramType, paramValueType)) {
			paramCode = paramMethod.source(ctx, node);
		} else {
			// 如果类型不匹配，使用强制转型
			String className = null;
			Class<?> wrapperClass = ReflectUtil.toWrapperClass(paramType);
			if (wrapperClass != null) {
				className = wrapperClass.getName();
			} else {
				className = paramType.getName();
			}
			paramCode = "(" + className + ")" + paramMethod.source(ctx, node);
		}
		return paramCode;
	}

	/**
	 * 如果只有一个空参数(AbstFelNode.NULL_NODE)，将其去掉。
	 * （在支持abc(,,,)这样的语法时，需要添加空参数作为占位符。当只有一个空参数时，可以将其去掉）
	 * 
	 * @param rightNode
	 * @return
	 * @deprecated,由于语法文件改变，不需要再清除空节点。
	 */
//	public static List<FelNode> clearNullNode(FelNode rightNode) {
//		List<FelNode> params = rightNode.getChildren();
//		if(params!=null){
//			if(params.size()==1&&params.get(0)== AbstFelNode.NULL_NODE){
//				// 如果只有一个空参数，视为null
//				params.clear();
//			}
//		}
//		return params;
//	}
	
	static void  b(Integer a){}
	static void  c(int a){}
	
	public static void main(String[] args) {
		/*
		int g = 0;
		Integer f = 0;
		b(g);
		b(f);
		c(g);
		c(f);
		
		
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
		text = "foo.foo";
		FelNode parse = e.parse(text);
		Object result = e.eval(text);
		System.out.println(result);
		Expression exp = e.compiler(text, null);
		Object eval = exp.eval(ctx);
		System.out.println(eval);
//		testEff();
 */
	}
	
	static public void testEff(){
		String str = "40.52334+60*(21.8144+17*32.663)";
			FelEngine e = new FelEngineImpl();
			double d = 40.52334+60*(21.8144+17*32.663);
			System.out.println(d);
			
			long start = System.currentTimeMillis();
		Expression compiler = e.compile(str, null);
		Object complierValue = compiler.eval(null);
		System.out.println(complierValue);
		Object evalValue = e.eval(str);
		System.out.println(evalValue.equals(complierValue));
		int count =100*1000*1000;
		count = 10;
		for(int i = 0;i<count;i++){
			System.out.println(compiler.eval(null));
		}
		long end = System.currentTimeMillis();
		System.out.println("cost:"+(end - start));
	}
	

}
