package com.greenpineyu.fel;

import com.greenpineyu.fel.context.FelContext;

public class PerformanceTest {

	public static void main(String[] args) {
		FelEngine engine = new FelEngineImpl();
		FelContext ctx = engine.getContext();
		ctx.set("i", 100);
		ctx.set("pi", 3.14d);
		ctx.set("d", -3.9);
		ctx.set("b", (byte) 4);
		ctx.set("bool", false);
//		Object o = engine.eval("1.1f+1");
//		System.out.println(o.getClass());
		System.out.println(1.1f+1);
		String str1 = "1000+100.0*99-(600-3*15)%(((68-9)-3)*2-100)+10000%7*71";
		String s = "(1 - d * pi) - (2 + 100 - i / pi) % 99 ";
		int i = 100;
		double pi = 3.14d;
		double d = -3.9;
		byte b = (byte)4;
		boolean bool = false;
		System.out.println((1 - d * pi) - (2 + 100 - i / pi) % 99  );
		System.out.println("value:"+engine.eval(s));
		System.out.println("value:"+engine.compiler(s, null).eval(ctx));
		 str1 = "i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ==i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ";
		int times = 1000 * 1000;
		//eval(engine, ctx, str1, times);
	}

	private static void eval(FelEngine engine, FelContext ctx, String str1,
			int times) {
		Expression compiler = engine.compiler(str1, null);
		long start = System.currentTimeMillis();
		Object result = null;
		for (int i = 0; i < times; i++) {
			result = compiler.eval(ctx);
//			result = engine.eval(str1);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		 System.out.println(result);
	}

}
