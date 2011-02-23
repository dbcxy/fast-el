package com.greenpineyu.fel.function.math;

import org.apache.commons.lang.ArrayUtils;

import com.greenpineyu.fel.function.CommonFunction;
import com.greenpineyu.fel.function.operator.AdditiveOperator;

public class Sum extends CommonFunction {

	public Object call(Object[] arguments) {
		return sum(arguments);
	}
	
	/**
	 * 求和
	 * @param arguments
	 * @return
	 */
	public static Object sum(Object[] arguments){
		Double d = new Double(0);
		Object result = d;
		if (!ArrayUtils.isEmpty(arguments)) {
			for (int i = 0; i < arguments.length; i++) {
				Object arg = arguments[i];
				Object tmp = null;
				try {
					tmp = AdditiveOperator.add(result, arg);
				} catch (RuntimeException e) {
					tmp = null;
				}
				if(tmp ==  null || tmp instanceof String){
					continue ;
				}else{
					result = tmp;
				}
			}
		}
		return result;
	}

	public String getName() {
		return "sum";
	}

}
