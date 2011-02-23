package com.greenpineyu.fel.function;

import java.util.HashMap;
import java.util.Map;

import com.greenpineyu.fel.function.collection.List;
import com.greenpineyu.fel.function.collection.SubList;
import com.greenpineyu.fel.function.collection.To;
import com.greenpineyu.fel.function.datetime.DateTime;
import com.greenpineyu.fel.function.datetime.Day;
import com.greenpineyu.fel.function.datetime.DaysBetween;
import com.greenpineyu.fel.function.datetime.FormatDatetime;
import com.greenpineyu.fel.function.datetime.Month;
import com.greenpineyu.fel.function.datetime.Now;
import com.greenpineyu.fel.function.datetime.Weekday;
import com.greenpineyu.fel.function.datetime.Year;
import com.greenpineyu.fel.function.logic.If;
import com.greenpineyu.fel.function.math.Abs;
import com.greenpineyu.fel.function.math.Avg;
import com.greenpineyu.fel.function.math.Cos;
import com.greenpineyu.fel.function.math.Count;
import com.greenpineyu.fel.function.math.Max;
import com.greenpineyu.fel.function.math.Min;
import com.greenpineyu.fel.function.math.Pi;
import com.greenpineyu.fel.function.math.Round;
import com.greenpineyu.fel.function.math.Sqrt;
import com.greenpineyu.fel.function.math.Sum;
import com.greenpineyu.fel.function.operator.AdditiveOperator;
import com.greenpineyu.fel.function.operator.Colon;
import com.greenpineyu.fel.function.operator.Dot;
import com.greenpineyu.fel.function.operator.EqualsOperator;
import com.greenpineyu.fel.function.operator.In;
import com.greenpineyu.fel.function.operator.Like;
import com.greenpineyu.fel.function.operator.LogicalOperator;
import com.greenpineyu.fel.function.operator.MultiplicativeOperator;
import com.greenpineyu.fel.function.operator.RelationalOperator;
import com.greenpineyu.fel.function.string.Find;
import com.greenpineyu.fel.function.string.Left;
import com.greenpineyu.fel.function.string.Len;
import com.greenpineyu.fel.function.string.Lower;
import com.greenpineyu.fel.function.string.Ltrim;
import com.greenpineyu.fel.function.string.Mid;
import com.greenpineyu.fel.function.string.RMB;
import com.greenpineyu.fel.function.string.Replace;
import com.greenpineyu.fel.function.string.Right;
import com.greenpineyu.fel.function.string.Rtrim;
import com.greenpineyu.fel.function.string.Search;
import com.greenpineyu.fel.function.string.Split;
import com.greenpineyu.fel.function.string.Str;
import com.greenpineyu.fel.function.string.Trim;
import com.greenpineyu.fel.function.string.Upper;

public class FunctionFactory {

	private static FunctionFactory instance = new FunctionFactory();

	private FunctionFactory() {
	}

	private Map<String, Function> funcMap;

	{
		funcMap = new HashMap<String, Function>();


		// 统计类(重载)
		funcMap.put("sum", new Sum());
		funcMap.put("count", new Count());
		funcMap.put("avg", new Avg());
		funcMap.put("max", new Max());
		funcMap.put("min", new Min());
		

		// 操作符函数
		funcMap.put(".", new Dot());
		//单元格区域函数
		funcMap.put(":", new Colon());
		
		funcMap.put(AdditiveOperator.ADD_STR, AdditiveOperator.ADD);// +
		funcMap.put(AdditiveOperator.SUB_STR, AdditiveOperator.SUB);// -
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
		funcMap.put(LogicalOperator.AND_STR.toLowerCase(), LogicalOperator.AND);// AND
		funcMap.put(LogicalOperator.AND2_STR, LogicalOperator.AND2);// &&
		funcMap.put(LogicalOperator.OR_STR.toLowerCase(), LogicalOperator.OR);// OR
		funcMap.put(LogicalOperator.OR2_STR, LogicalOperator.OR2);// ||
		funcMap.put(Like.getInstance().getName(), Like.getInstance());// like
		funcMap.put(In.getInstance().getName(), In.getInstance());// in
		funcMap.put(If.getInstance().getName(), If.getInstance());//if
		
		// 日期时间函数
		funcMap.put("datetime", new DateTime());
		funcMap.put("day", new Day());
		funcMap.put("daysbetween", new DaysBetween());
		funcMap.put("formatdatetime", new FormatDatetime());
		funcMap.put("month", new Month());
		funcMap.put("now", new Now());
		//date函数和now函数的功能是一样的，都是返回日期对象
		funcMap.put("date", new Now());
		funcMap.put("weekday", new Weekday());
		funcMap.put("year", new Year());
		
		//字符串函数
		funcMap.put("find", Find.getInstance());
		funcMap.put("left", Left.getInstance());
		funcMap.put("len", Len.getInstance());
		funcMap.put("lower", Lower.getInstance());
		funcMap.put("ltrim", Ltrim.getInstance());
		funcMap.put("mid", Mid.getInstance());
		funcMap.put("replace", Replace.getInstance());
		funcMap.put("right", Right.getInstance());
		funcMap.put("rmb", RMB.getInstance());
		funcMap.put("rtrim", Rtrim.getInstance());
		funcMap.put("search", Search.getInstance());
		funcMap.put("split", Split.getInstance());
		funcMap.put("str", Str.getInstance());
		funcMap.put("trim", Trim.getInstance());
		funcMap.put("upper", Upper.getInstance());
		
		// 数学函数
		funcMap.put("abs", new Abs());
		funcMap.put("cos", new Cos());
		funcMap.put("round", new Round());
		funcMap.put("pi", new Pi());
		funcMap.put("sqrt", new Sqrt());
		//		funcMap.put("number", new com.datanew.excel.script.function.math.Number());
		
		// 普通函数
		// 集合类
		funcMap.put("list", new List());
		funcMap.put("sublist", new SubList());
		funcMap.put("to", new To());

	}

	public Function getFun(String funName) {
		return (Function) funcMap.get(funName.toLowerCase());
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
