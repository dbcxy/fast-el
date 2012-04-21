package com.greenpineyu.fel.function;

import java.util.HashMap;
import java.util.Map;

import com.greenpineyu.fel.function.operator.Add;
import com.greenpineyu.fel.function.operator.CollectionGet;
import com.greenpineyu.fel.function.operator.Cond;
import com.greenpineyu.fel.function.operator.Div;
import com.greenpineyu.fel.function.operator.Dot;
import com.greenpineyu.fel.function.operator.Equal;
import com.greenpineyu.fel.function.operator.GreaterThan;
import com.greenpineyu.fel.function.operator.GreaterThenEqual;
import com.greenpineyu.fel.function.operator.LessThen;
import com.greenpineyu.fel.function.operator.LessThenEqual;
import com.greenpineyu.fel.function.operator.And;
import com.greenpineyu.fel.function.operator.Mod;
import com.greenpineyu.fel.function.operator.Mul;
import com.greenpineyu.fel.function.operator.NotEqual;
import com.greenpineyu.fel.function.operator.NotOper;
import com.greenpineyu.fel.function.operator.Or;
import com.greenpineyu.fel.function.operator.Sub;

public class FunMgr {

//	private static FunMgr instance = new FunMgr();

	public FunMgr() {
		userFunMap = new HashMap<String,Function>();
	}
	
	/**
	 * 用户函数
	 */
	private Map<String, Function> userFunMap;

	/**
	 * 共用函数
	 */
	private Map<String, Function> funcMap;

	{
		funcMap = new HashMap<String, Function>();

		// // 操作符函数
		addFun(new Dot());
//		funcMap.put(".", new Dot());
		
		addFun(new CollectionGet());
//		funcMap.put(new CollectionGet().instance.getName(), CollectionGet.instance);
		
		addFun(new Cond());
//		funcMap.put(CondOperator.instance.getName(), CondOperator.instance);
		addFun(new Dollar());
//		funcMap.put(Dollar.instance.getName(), Dollar.instance);
		addFun(new NotOper());
//		funcMap.put(NotOper.instance.getName(), NotOper.instance);
		
		addFun(new Add());//+
		addFun(new Sub());//-
//		funcMap.put(Add.getInstance().getName(), Add.getInstance());// +
//		funcMap.put(Sub.getInstance().getName(), Sub.getInstance());// -
//		funcMap.put(EqualsOperator.EQUAL_STR, EqualsOperator.EQUAL);// ==
		addFun(new Equal());//==
		addFun(new NotEqual());//!=
//		funcMap.put(EqualsOperator.NOEQUAL_STR, EqualsOperator.NOEQUAL);// !=
		addFun(new Mul());// *
		addFun(new Div());// /
		addFun(new Mod());// %
//		funcMap.put(MultiplicativeOperator.MUL_STR, MultiplicativeOperator.MUL);// *
//		funcMap.put(MultiplicativeOperator.DIV_STR, MultiplicativeOperator.DIV);// /
//		funcMap.put(MultiplicativeOperator.MOD_STR, MultiplicativeOperator.MOD);// %
		addFun(new LessThen());// <
		addFun(new LessThenEqual());// <=
		addFun(new GreaterThan());// >
		addFun(new GreaterThenEqual());// >=
//		funcMap.put(RelationalOperator.LESSTHEN_STR,
//				RelationalOperator.LESSTHEN);// <
//		funcMap.put(RelationalOperator.GREATERTHAN_STR,
//				RelationalOperator.GREATERTHAN);// >
//		funcMap.put(RelationalOperator.LESSTHENOREQUALS_STR,
//				RelationalOperator.LESSTHENOREQUALS);// <=
//		funcMap.put(RelationalOperator.GREATERTHANOREQUALS_STR,
//				RelationalOperator.GREATERTHANOREQUALS);// >=
//		funcMap.put(LogicalOperator.AND_STR.toLowerCase(), LogicalOperator.AND);// AND
		addFun(new And());// &&
		addFun(new Or());// ||
//		funcMap.put(LogicalOperator.AND2_STR, LogicalOperator.AND2);// &&
//		funcMap.put(LogicalOperator.OR_STR.toLowerCase(), LogicalOperator.OR);// OR
//		funcMap.put(LogicalOperator.OR2_STR, LogicalOperator.OR2);// ||
//		funcMap.put(Like.getInstance().getName(), Like.getInstance());// like
//		funcMap.put(In.getInstance().getName(), In.getInstance());// in

		
		

	}

	private void addFun(Function fun) {
		funcMap.put(fun.getName(), fun);
	}

	/**
	 * 获取函数。先从用户函数中取，如没有获取到，再从共用函数中获取。
	 * @param funName
	 * @return
	 */
	public Function getFun(String funName) {
		if(funName!=null) {
			String newFunName = getLowerCaseName(funName);
			Function userFun = userFunMap.get(newFunName);
			if(userFun != null){
				return userFun;
			}
			return funcMap.get(newFunName);
		}
		return null;
	}

	private String getLowerCaseName(String funName) {
		return funName.toLowerCase();
	}

	/**
	 * 添加函数到用户函数库中
	 * @param fun
	 */
	public void add(Function fun) {
		if (fun != null) {
			String name = fun.getName();
			if(name==null || "".equals(name)){
				throw new IllegalArgumentException("函数名称不能为空");
			}else{
				userFunMap.put(getLowerCaseName(name), fun);
			}
		}
	}
	
	
	/**
	 * 移除用户函数
	 * @param name
	 */
	public void remove(String name){
		if (name != null) {
			userFunMap.remove(getLowerCaseName(name));
		}
	}

//	static public FunMgr getInstance() {
//		return instance;
//	}
}
