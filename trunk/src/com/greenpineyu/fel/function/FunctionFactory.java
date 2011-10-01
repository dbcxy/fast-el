package com.greenpineyu.fel.function;

import java.util.HashMap;
import java.util.Map;

import com.greenpineyu.fel.function.operator.Add;
import com.greenpineyu.fel.function.operator.CondOperator;
import com.greenpineyu.fel.function.operator.Dot;
import com.greenpineyu.fel.function.operator.EqualsOperator;
import com.greenpineyu.fel.function.operator.LogicalOperator;
import com.greenpineyu.fel.function.operator.MultiplicativeOperator;
import com.greenpineyu.fel.function.operator.NotOper;
import com.greenpineyu.fel.function.operator.RelationalOperator;
import com.greenpineyu.fel.function.operator.Sub;

public class FunctionFactory {

	private static FunctionFactory instance = new FunctionFactory();

	private FunctionFactory() {
	}

	private Map<String, Function> funcMap;

	{
		funcMap = new HashMap<String, Function>();


		// // 统计类(重载)
//		funcMap.put("sum", new Sum());
//		funcMap.put("count", new Count());
//		funcMap.put("avg", new Avg());
//		funcMap.put("max", new Max());
//		funcMap.put("min", new Min());
//		
//
		// // 操作符函数
		funcMap.put(".", new Dot());
		// //单元格区域函数
//		funcMap.put(":", new Colon());
		
		funcMap.put(CondOperator.instance.getName(), CondOperator.instance);
		funcMap.put(Dollar.instance.getName(), Dollar.instance);
		funcMap.put(NotOper.instance.getName(), NotOper.instance);
		
		funcMap.put(Add.getInstance().getName(), Add.getInstance());// +
		funcMap.put(Sub.getInstance().getName(), Sub.getInstance());// -
		funcMap.put(EqualsOperator.EQUAL_STR, EqualsOperator.EQUAL);// ==
		funcMap.put(EqualsOperator.NOEQUAL_STR, EqualsOperator.NOEQUAL);// !=
		funcMap.put(MultiplicativeOperator.MUL_STR, MultiplicativeOperator.MUL);// *
		funcMap.put(MultiplicativeOperator.DIV_STR, MultiplicativeOperator.DIV);// /
		funcMap.put(MultiplicativeOperator.MOD_STR, MultiplicativeOperator.MOD);// %
		funcMap.put(RelationalOperator.LESSTHEN_STR,
				RelationalOperator.LESSTHEN);// <
		funcMap.put(RelationalOperator.GREATERTHAN_STR,
				RelationalOperator.GREATERTHAN);// >
		funcMap.put(RelationalOperator.LESSTHENOREQUALS_STR,
				RelationalOperator.LESSTHENOREQUALS);// <=
		funcMap.put(RelationalOperator.GREATERTHANOREQUALS_STR,
				RelationalOperator.GREATERTHANOREQUALS);// >=
//		funcMap.put(LogicalOperator.AND_STR.toLowerCase(), LogicalOperator.AND);// AND
		funcMap.put(LogicalOperator.AND2_STR, LogicalOperator.AND2);// &&
//		funcMap.put(LogicalOperator.OR_STR.toLowerCase(), LogicalOperator.OR);// OR
		funcMap.put(LogicalOperator.OR2_STR, LogicalOperator.OR2);// ||
//		funcMap.put(Like.getInstance().getName(), Like.getInstance());// like
//		funcMap.put(In.getInstance().getName(), In.getInstance());// in
//		
//		

		// //字符串函数
//		funcMap.put("find", Find.getInstance());
//		funcMap.put("left", Left.getInstance());
//		funcMap.put("len", Len.getInstance());
//		funcMap.put("lower", Lower.getInstance());
//		funcMap.put("ltrim", Ltrim.getInstance());
//		funcMap.put("mid", Mid.getInstance());
//		funcMap.put("replace", Replace.getInstance());
//		funcMap.put("right", Right.getInstance());
//		funcMap.put("rmb", RMB.getInstance());
//		funcMap.put("rtrim", Rtrim.getInstance());
//		funcMap.put("search", Search.getInstance());
//		funcMap.put("split", Split.getInstance());
//		funcMap.put("str", Str.getInstance());
//		funcMap.put("trim", Trim.getInstance());
//		funcMap.put("upper", Upper.getInstance());
//		

		// // 数学函数
//		funcMap.put("abs", new Abs());
//		funcMap.put("cos", new Cos());
//		funcMap.put("round", new Round());
//		funcMap.put("pi", new Pi());
//		funcMap.put("sqrt", new Sqrt());
		//		funcMap.put("number", new .script.function.math.Number());
		

	}

	public Function getFun(String funName) {
		return funcMap.get(funName.toLowerCase());
	}

	public void add(Function fun) {
		if (fun != null) {
			funcMap.put(fun.getName(), fun);
		}
	}

	static public FunctionFactory getInstance() {
		return instance;
	}
}
