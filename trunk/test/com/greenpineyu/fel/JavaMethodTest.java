package com.greenpineyu.fel;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.JavaMethod;

public class JavaMethodTest {
	
	int a = 1;
	int b = 2;

	FelEngine engine;
	FelContext ctx;
	
	@BeforeTest
	public void init(){
		engine = FelEngine.instance;
	}

	 @Test(dataProvider = "dp")
	 public void eval(String exp, Object actual) {
		 FelEngineImplTest.compare(engine.eval(exp), actual);
	 }

	@Test(dataProvider = "dp")
	public void compile(String exp, Object actual) {
		Expression expObj = engine.compile(exp, ctx);
		FelEngineImplTest.compare(expObj.eval(ctx), actual);
	}
	
//public Object eval(FelContext context) {
//        
//        return com.greenpineyu.fel.JavaMethodTest.staticWithParam((java.lang.Integer)((java.lang.Boolean)((ArrayCtx)context).get(0)),(java.lang.Integer)((java.lang.Boolean)((ArrayCtx)context).get(1)));
//    }

	@DataProvider
	public Object[][] dp() {
		ctx = engine.getContext();
		ctx.set("a", a);
		ctx.set("b", b);
		try {
			
			Class<?>[] paramTypes = new Class<?>[]{int.class,int.class};
			Method staticWithoutParam = JavaMethodTest.class
					.getMethod("staticWithoutParam");
			engine.getFunMgr()
					.add(
							new JavaMethod("staticWithoutParam",
									staticWithoutParam, null));
			Method staticWithParam = JavaMethodTest.class
					.getMethod("staticWithParam",paramTypes);
			engine.getFunMgr().add(
					new JavaMethod("staticParam", staticWithParam, null));

			Method noParam = JavaMethodTest.class.getMethod("noParam");
			engine.getFunMgr().add(new JavaMethod("objMehtod", noParam, this));
			Method param = JavaMethodTest.class.getMethod("param",paramTypes);
			engine.getFunMgr().add(new JavaMethod("objMethodWithParam", param, this));

			return new Object[][] {
					{"staticWithoutParam()", staticWithoutParam() }, 
					{"staticParam(a,b)", staticWithParam(a,b)}, 
					{"objMehtod()", noParam()}, 
					{"objMethodWithParam(a,b)", param(a,b)}, 
					};
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String staticWithoutParam() {
		return "staticWithoutParam";
	}

	public static int staticWithParam(int a, int b) {
		return a + b;
	}

	public String noParam() {
		return "noParam";
	}

	public int param(int a, int b) {
		return staticWithParam(a, b);
	}

}
