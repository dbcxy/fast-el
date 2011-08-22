package com.greenpineyu.fel;

import java.util.HashMap;
import java.util.Map;

import com.greenpineyu.fel.context.FelContext;

public class PerformanceTest {

	public static void main(String[] args) {
		speed();
//		stable();
	}
	
	public static void stable(){
		final FelEngine engine = new FelEngineImpl();
		final long start = System.currentTimeMillis();
		final int times = 1;
		Thread cur = Thread.currentThread();
		for (int i = 0; i < times; i++) {
			final int temp = i;
			Thread t = new Thread(){
				public void run() {
					for (int j = 0; j < times; j++) {
						String str = temp+"+"+j;
						long s = System.currentTimeMillis();
						Expression exp = engine.compiler(str, null);
						long now = System.currentTimeMillis();
						Object value = exp.eval(null);
						System.out.println(now-start+":"+(now-s)+"****************:"+str+"="+value);
					}
				};
			};
			t.start();
//			try {
////				t.join();
//			} catch (InterruptedException e) {
//			}
		}
		System.out.println("cost:"+(System.currentTimeMillis()-start));
	}

	private static void speed() {
		FelEngine engine = new FelEngineImpl();
		FelContext ctx = engine.getContext();
		ctx.set("i", 100);
		ctx.set("pi", 3.14d);
		ctx.set("d", -3.9);
		ctx.set("b", (byte) 4);
		ctx.set("bool", false);
		Map<String,Object> m = new HashMap<String, Object>();
		m.put("d", 5);
		m.put(null,"this is null");
		ctx.set("m", m);
		ctx.set("s","hello world");
//		Object o = engine.eval("1.1f+1");
//		System.out.println(o.getClass());
//		System.out.println(1.1f+1);
		String[] exps = new String[10];
		int j = 0;
//		exps[j++] = "1000+100.0*99-(600-3*15)%(((68-9)-3)*2-100)+10000%7*71";
//		exps[j++] =  "i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ==i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ";
//		exps[j++] =  "pi*d+b-(1000-d*b/pi)/(pi+99-i*d)-i*pi*d/b";
//		exps[j++] =  "s.substring(m.d)";
//		exps[j++] =  "s.substring(1).substring(2).indexOf('world')";
		exps[j++] =  "m.get(null)";
//		Object eval = engine.eval(exps[3]);
//		System.out.println(eval);
//temp();
		int times = 10*1000 * 1000;
		times =1;
		for(String exp : exps){
			if(exp == null){
				break;
			}
			eval(engine, ctx, exp, times);
		}
	}

	private static void temp() {
		//		String s = "(1 - d * pi) - (2 + 100 - i / pi) % 99 ";
				int i = 100;
				double pi = 3.14d;
				double d = -3.9;
				byte b = (byte)4;
				boolean bool = false;
		//		System.out.println((1 - d * pi) - (2 + 100 - i / pi) % 99  );
		//		System.out.println("value:"+engine.eval(s));
		//		System.out.println("value:"+engine.compiler(s, null).eval(ctx));
		//		 str1 = "i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ==i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ";
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
		System.out.println(str1+"="+result+"--------cost:"+(end-start));
	}
	
	

}
