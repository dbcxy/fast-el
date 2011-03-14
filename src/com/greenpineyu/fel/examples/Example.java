package com.greenpineyu.fel.examples;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.AbstractContext;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.interpreter.ConstInterpreter;
import com.greenpineyu.fel.parser.FelNode;

public class Example {
	static FelEngine fel = new FelEngineImpl();

	/**
	 * 入门
	 */
	public static void helloworld() {
		Object result = fel.eval("5000*12+7500");
		System.out.println(result);
	}

	/**
	 * 使用变量
	 */
	public static void useVariable() {
		FelContext ctx = fel.getContext();
		ctx.set("单价", "5000");
		ctx.set("数量", new Integer(12));
		ctx.set("运费", "7500");
		Object result = fel.eval("单价*数量+运费");
		System.out.println(result);
	}

	/**
	 * 调用对象的方法
	 */
	public static void callMethod() {
		FelContext ctx = fel.getContext();
		ctx.set("out", System.out);
		fel.eval("out.println('Hello Everybody')");
	}

	/**
	 * 自定义执行上下文
	 */
	public static void contexts() {
		String costStr = "成本";
		FelContext rootContext = fel.getContext();
		rootContext.set(costStr, "60000");
		Object baseCost = fel.eval(costStr);
		System.out.println("基本费用：" + baseCost);
		MyContext myContext = new MyContext();
		myContext.setParent(rootContext);
		myContext.set(costStr, new Integer(67500));
		Object allCost = fel.eval(costStr, myContext);
		System.out.println("所有费用：" + allCost);
	}

	/**
	 * 自定义 解释器
	 */
	public static void userInterpreter() {
		String costStr = "成本";
		FelContext rootContext = fel.getContext();
		rootContext.set(costStr, "60000");
		FelNode node = fel.parse(costStr);
		//将变量解析成常量
		node.setInterpreter(new ConstInterpreter(rootContext, node));
		//下面这段代码执行速度非常高
		node.eval(rootContext);
	}

	public static void main(String[] args) {
		contexts();
	}

}

class MyContext extends AbstractContext {

	@Override
	protected Object getObject(Object name) {
		return null;
	}

};
