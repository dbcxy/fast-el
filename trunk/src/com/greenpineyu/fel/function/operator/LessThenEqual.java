package com.greenpineyu.fel.function.operator;

import com.greenpineyu.fel.common.NumberUtil;

public class LessThenEqual extends LessThen {
	
	@Override
	public String getName() {
		return "<=";
	}
	
	/**
	 * 小于等于
	 * @see com.greenpineyu.fel.function.operator.RelationalOperator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	 public  boolean compare(Object left, Object right) {
		if(left == right){
			return true;
		}
		
		if(left == null || right == null){
			return false;
		}
		
		if(left instanceof Number && right instanceof Number){
			return NumberUtil.toDouble((Number)left)<=NumberUtil.toDouble((Number)right);
		}
		
		if(left instanceof Comparable && right instanceof Comparable){
			return ((Comparable)left).compareTo(right)<=0;
		}
		// TODO 是返回false还是抛出异常?
		return false;
	}

}
