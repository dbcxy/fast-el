package com.greenpineyu.fel.examples;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.mutable.MutableInt;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.AbstractContext;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.interpreter.ConstInterpreter;
import com.greenpineyu.fel.interpreter.Interpreter;
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

	/**
	 * 自定义解释器的高级用法
	 */
	public static void userInterpreterX() {
		/*
		 * 假设数据库中有两列，单价和数量。
		 * 现在需要通过表达式计算金额(表达式:单价*数量)。
		 * 通常的做法是通过context获取变量（单价、数量的值），
		 * 在小数量里时，这种做法是很好的，但是大数量量时，性能就很差了。
		 * 如果使用自定义的解释器，会提高效率。
		 */
		

		//数据库中单价列的记录
		String[] price = new String[] {
				"2", "3", "4"
		};
		//数据库中数量列的记录
		String[] number = new String[] {
				"10.99", "20.99", "9.9"
		};

		String exp = "单价*数量";
		FelNode node = fel.parse(exp);
		List<FelNode> children = node.getChildren();
		MutableInt index = new MutableInt(0);
		//替换节点的解释器
		for (Iterator iterator = children.iterator(); iterator.hasNext();) {
			FelNode child = (FelNode) iterator.next();
			if ("单价".equals(child.getText())) {
				child.setInterpreter(new ColumnInterpreter(index, price));
			} else if ("数量".equals(child.getText())) {
				child.setInterpreter(new ColumnInterpreter(index, number));
			}
		}

		for (int i = 0; i < number.length; i++) {
			index.setValue(i);
			Object eval = node.eval(null);
			System.out.println("金额[" + price[i] + "*" + number[i] + "=" + eval + "]");
		}
	}


	public static void main(String[] args) {
		userInterpreterX();
	}

}

class ColumnInterpreter implements Interpreter {
	MutableInt index;

	String[] records;

	ColumnInterpreter(MutableInt index, String[] records) {
		this.index = index;
		this.records = records;
	}

	public Object interpret(FelContext context, FelNode node) {
		return records[index.intValue()];
	}

}

class MyContext extends AbstractContext {

	@Override
	protected Object getObject(Object name) {
		return null;
	}

};
