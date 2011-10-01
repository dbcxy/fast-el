package com.greenpineyu.fel;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;

import com.googlecode.aviator.AviatorEvaluator;
import com.greenpineyu.fel.context.AbstractConetxt;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.context.MapContext;

@SuppressWarnings("unused")
public class PerformanceTest {

	public static void main(String[] args) {
		speed();
		// stable();
		// testConcurrent();
	}

	public static void stable() {
		final FelEngine engine = new FelEngineImpl();
		final long start = System.currentTimeMillis();
		final int times = 10;
		for (int i = 0; i < times; i++) {
			final int temp = i;
			Thread t = new Thread() {
				@Override
				public void run() {
					for (int j = 0; j < times; j++) {
						String str = temp + "+" + j;
						long s = System.currentTimeMillis();
						Expression exp = engine.compile(str, null);
						long now = System.currentTimeMillis();
						Object value = exp.eval(null);
						System.out.println("[" + (now - start) + ":"
								+ (now - s) + "]****************:" + str + "="
								+ value);
					}
				};
			};
			t.start();
		}
		// System.out.println("cost:" + (System.currentTimeMillis() - start));
	}

	private static void speed() {
		Map<String, Object> vars = new HashMap<String, Object>();
		vars.put("i", 100);
		vars.put("pi", 3.14d);
		vars.put("d", -3.9);
		vars.put("b", (byte) 4);
		vars.put("bool", false);
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("d", 5);
		m.put(null, "this is null");
		vars.put("m", m);
		vars.put("s", "hello world");

		String[] exps = new String[10];
		int i = 0;
		exps[i++] = "1000+100.0*99-(600-3*15)%(((68-9)-3)*2-100)+10000%7*71";
		exps[i++] = "i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ==i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ";
		exps[i++] = "pi*d+b-(1000-d*b/pi)/(pi+99-i*d)-i*pi*d/b";
		exps[i++] = "s.substring(m.d)";
		exps[i++] = "s.substring(1).substring(2).indexOf('world')";
		int times = 10 * 1000 * 1000;
		// times =1;
		for (String exp : exps) {
			if (exp == null) {
				break;
			}
			fel(exp, vars, times);
			// jexl(exp, vars, times);
			// aviator(exp, vars, times);
		}
	}

	private static void fel(String exp, Map<String, Object> vars, int times) {
		FelContext ctx = new MapContext(vars);
//		ctx = new MapContext(vars);
		fel(exp, ctx, times);
	}

	private static long fel(String exp, FelContext ctx, int times) {
		FelEngine engine = new FelEngineImpl();
		Expression expObj = engine.compile(exp, ctx);
		Object evalResult = null;
		long start = System.currentTimeMillis();
		Object result = null;
		int i = 0;
		while (i++ < times) {
			result = expObj.eval(ctx);
		}
		long end = System.currentTimeMillis();
		// System.out.println(result + " == " + evalResult + "："
//				+ result.equals(evalResult));
		long cost = end - start;
		System.out.println("--------cost[" + cost + " ]---value[" + result
				+ "] ------exp[" + exp + "]");
		return cost;
	}
	private static void jexl(String exp, Map<String, Object> vars, int times) {
		JexlEngine je = new JexlEngine();
		JexlContext ctx = new org.apache.commons.jexl2.MapContext(vars);

		Object result = null;
		final org.apache.commons.jexl2.Expression e = je.createExpression(exp);

		long start = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			result = e.evaluate(ctx);
		}
		long end = System.currentTimeMillis();
		System.out.println("--------cost[ " + (end - start) + " ] ------exp="
				+ result);
	}

	private static void aviator(String exp, Map<String, Object> vars, int times) {
		com.googlecode.aviator.Expression e = AviatorEvaluator.compile(exp);
		Object result = null;
		long start = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			result = e.execute(vars);
		}
		long end = System.currentTimeMillis();
		System.out.println("--------cost[ " + (end - start) + " ] ------exp="
				+ result);
	}

	public static void testConcurrent(){
		// int threads = 10;
		concurrent(50);
		concurrent(100);
		concurrent(200);
	}

	private static void concurrent(int threads) {
		ExecutorService exeService=Executors.newFixedThreadPool(threads);
		final String[] exps = new String[10];
		int i = 0;
		exps[i++] = "1000+100.0*99-(600-3*15)%(((68-9)-3)*2-100)+10000%7*71";
		exps[i++] =  "i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ==i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ";
		exps[i++] =  "pi*d+b-(1000-d*b/pi)/(pi+99-i*d)-i*pi*d/b";
		exps[i++] =  "pi*d+b-(1000-d*b/pi)/(pi+99-i*d)-i*pi*d/b";
		exps[i++] =  "'hello world'.substring(1).substring(2).indexOf('world')";
	    final int times = 1*1000*1000;
		final FelContext ctx = new AbstractConetxt() {
			int index = 0;
			int size = 10;
			Object[] vars = new Object[size];
			{
				for (int i = 0; i < vars.length; i++) {
					vars[i] = Math.random() * 100;
				}
			}
			@Override
			public Object get(String name) {
				return vars[index++ % size];
			}
		};
		FutureTask<?>[] tasks = new FutureTask[threads];
		long start = System.currentTimeMillis();
		for (int j = 0; j < threads; j++) {
			final int current=j%i;
			FutureTask<Long> f = new FutureTask<Long>(new Callable<Long>() {
				
				@Override
				public Long call() throws Exception {
					return fel(exps[current], ctx, times);
				}
			});
			tasks[j] = f;
			exeService.submit(f);
		}
		long costCount = 0;
		for (int j = 0; j < tasks.length; j++) {
			FutureTask<?> t = tasks[j];
			Long object;
			try {
				object = (Long)t.get();
				costCount+=object;
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		long end = System.currentTimeMillis();
		double avg = 1.0*costCount/threads;
		long  finishTime = end - start;
		System.out.println("线程数：" + threads + ";总时间：" + finishTime + ";平均时间："
				+ avg);
		
		exeService.shutdown();
	}

	/*
	 * private static FelContext getContext() { return new AbstractConetxt() {
	 * int index = 0; int size = 10; Object[] vars = new Object[size]; { for
	 * (int i = 0; i < vars.length; i++) { vars[i] = Math.random() * 100; } }
	 * 
	 * public Object get(Object name) { return vars[index++ % size]; } }; }
	 */

}

