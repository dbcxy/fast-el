package com.greenpineyu.fel.examples;

import java.util.List;

import org.apache.commons.lang.mutable.MutableInt;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.AbstractConetxt;
import com.greenpineyu.fel.context.ContextChain;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.context.MapContext;
import com.greenpineyu.fel.interpreter.ConstInterpreter;
import com.greenpineyu.fel.interpreter.Interpreter;
import com.greenpineyu.fel.parser.FelNode;

public class Example {

	public static void main(String[] args) {

		helloworld();
		System.out.println("--------------------");
		useVariable();
		System.out.println("--------------------");
		callMethod();
		System.out.println("--------------------");
		context();
		System.out.println("--------------------");
		contexts();
		System.out.println("--------------------");
		userInterpreter();
		System.out.println("--------------------");
		operatorOverload();
		System.out.println("--------------------");
		testCompile();
		// FelContext ctx = fel.getContext();
		// ctx.set("单价", "5000");
		// ctx.set("数量", new Integer(12));
		// ctx.set("运费", "7500");
		// Object result = fel.eval("单价*数量+运费");
		// System.out.println(result);
	}

	/**
	 * 入门
	 */
	public static void helloworld() {
		FelEngine fel = new FelEngineImpl();
		Object result = fel.eval("5000*12+7500");
		System.out.println(result);
	}

	/**
	 * 使用变量
	 */
	public static void useVariable() {
		FelEngine fel = new FelEngineImpl();
		FelContext ctx = fel.getContext();
		ctx.set("单价", 5000);
		ctx.set("数量", 12);
		ctx.set("运费", 7500);
		Object result = fel.eval("单价*数量+运费");
		System.out.println(result);
	}

	/**
	 * 调用对象的方法
	 */
	public static void callMethod() {
		FelEngine fel = new FelEngineImpl();
		FelContext ctx = fel.getContext();
		ctx.set("out", System.out);
		fel.eval("out.println('Hello Everybody'.substring(6))");
	}
	
	/**
	 *	自定义上下文环境 
	 */
	public static void context(){
		//负责提供气象服务的上下文环境
		FelContext ctx = new AbstractConetxt() {
			public Object get(Object name) {
				if("天气".equals(name)){
					return "晴";
				}
				if("温度".equals(name)){
					return 25;
				}
				return NOT_FOUND;
			}
		};
		FelEngine fel = new FelEngineImpl(ctx);
		Object eval = fel.eval("'天气:'+天气+';温度:'+温度");
		System.out.println(eval);
	}

	/**
	 * 多层次上下文环境(变量命名空间)
	 */
	public static void contexts() {
		FelEngine fel = new FelEngineImpl();
		String costStr = "成本";
		String priceStr="价格";
		FelContext baseCtx = fel.getContext();
		//父级上下文中设置成本和价格
		baseCtx.set(costStr, 50);
		baseCtx.set(priceStr,100);
		
		String exp = priceStr+"-"+costStr;
		Object baseCost = fel.eval(exp);
		System.out.println("期望利润：" + baseCost);

		FelContext ctx = new ContextChain(baseCtx, new MapContext());
		//通货膨胀导致成本增加（子级上下文 中设置成本，会覆盖父级上下文中的成本）
		ctx.set(costStr,50+20 );
		Object allCost = fel.eval(exp, ctx);
		System.out.println("实际利润：" + allCost);
	}
	
	public static void testCompile(){
		FelEngine fel = new FelEngineImpl();
		FelContext ctx = fel.getContext();
		ctx.set("单价", 5000);
		ctx.set("数量", 12);
		ctx.set("运费", 7500);
		Expression exp = fel.compiler("单价*数量+运费",ctx);
		Object result = exp.eval(ctx);
		System.out.println(result);
	}
	
	
	/**
	 * 
	 */
	public static void testCompileX(){
		FelEngine fel = new FelEngineImpl();
		String exp = "单价*数量";
		final MutableInt index = new MutableInt(0);

		// 数据库中单价列的记录
		final int[] price = new int[] { 2, 3, 4 };
		// 数据库中数量列的记录
		final double[] number = new double[] { 10.99, 20.99, 9.9 };
		FelContext context = new AbstractConetxt() {

			public Object get(Object name) {
				if("单价".equals(name)){
					return price[index.intValue()];
				}
				if("数量".equals(name)){
					return number[index.intValue()];
				}
				return NOT_FOUND;
			}
		};
		Expression compExp = fel.compiler(exp, context);
		for (int i = 0; i < number.length; i++) {
			index.setValue(i);
			Object eval = compExp.eval(context);
			System.out.println("总价[" + price[i] + "*" + number[i] + "=" + eval
					+ "]");
		}
	}

	/**
	 * 自定义 解释器
	 */
	public static void userInterpreter() {
		FelEngine fel = new FelEngineImpl();
		String costStr = "成本";
		FelContext rootContext = fel.getContext();
		rootContext.set(costStr, "60000");
		FelNode node = fel.parse(costStr);
		// 将变量解析成常量
		node.setInterpreter(new ConstInterpreter(rootContext, node));
		System.out.println(node.eval(rootContext));
	}

	/**
	 * 操作符重载，使用自定义解释器实现操作符重载
	 */
	public static void operatorOverload() {
		/*
		 * 扩展Fel的+运算符，使其支持数组+数组
		 */
		
		FelEngine fel = new FelEngineImpl();
		// 单价
		double[] price = new double[] { 2, 3, 4 };
		// 费用
		double[] cost = new double[] { 0.99, 0.59, 1.9 };
		FelContext ctx = fel.getContext();
		ctx.set("单价", price);
		ctx.set("费用", cost);
		String exp = "单价+费用";
		FelNode node = fel.parse(exp);
		//使用新的解释器来实现数组相加
		node.setInterpreter(new Interpreter() {
			public Object interpret(FelContext context, FelNode node) {
				List<FelNode> args = node.getChildren();
				double[] leftArg = (double[]) args.get(0).eval(context);
				double[] rightArg = (double[]) args.get(1).eval(context);
				return sum(leftArg)+sum(rightArg);
			}
			//对数组进行求和
			public double sum(double[] array){
				double d = 0;
				for (int i = 0; i < array.length; i++) {
					d+=array[i];
				}
				return d;
			}
		});
		Object eval = node.eval(ctx);
		System.out.println("数组相加:"+eval);
	}


	public static void testSpeed() {
		FelEngine fel = new FelEngineImpl();
		String exp = "40.52334+60*(21.8144+17*32.663)";
		FelNode node = fel.parse(exp);
		int times = 100 * 1000 * 1000;
		long s1 = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			//			double j = 40.52334 + 60 * (21.8144 + 17 * 32.663);
			node.eval(null);
		}
		long s2 = System.currentTimeMillis();
		System.out.println("花费的时间:" + (s2 - s1));
	}

}

class ColumnInterpreter implements Interpreter {
	MutableInt index;

	double[] records;

	ColumnInterpreter(MutableInt index, double[] records) {
		this.index = index;
		this.records = records;
	}

	public Object interpret(FelContext context, FelNode node) {
		return records[index.intValue()];
	}
}
