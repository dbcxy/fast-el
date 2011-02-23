package com.greenpineyu.fel.function.collection;

import java.util.ArrayList;

import org.apache.commons.lang.ArrayUtils;

import com.greenpineyu.fel.common.FunctionUtil;
import com.greenpineyu.fel.exception.EvalException;
import com.greenpineyu.fel.function.CommonFunction;

public class To extends CommonFunction {

	/**
	 * 语法：to(startExp,endExp{,stepExp})
	 */
	public Object call(Object[] arguments) {
		if (!ArrayUtils.isEmpty(arguments) && arguments.length >= 2) {
			Object arg1 = arguments[0];
			int start = FunctionUtil.toInteger(arg1);
			Object arg2 = arguments[1];
			int end = FunctionUtil.toInteger(arg2);
			int step = 1;
			if (arguments.length > 2) {
				Object arg3 = arguments[2];
				step = FunctionUtil.toInteger(arg3);
			}
			java.util.List list = new ArrayList();
			if (step > 0) {
				int k = start;
				while (k <= end) {
					list.add(new Integer(k));
					k += step;
				}
			} else if (step < 0) {
				//步进为负时，从大到小遍历
				int k = start;
				while (k >= end) {
					list.add(new Integer(k));
					k += step;
				}
			} else {
				throw new EvalException("步进不能为0");
			}
			//			list.add(new Integer(start));
			//			
			//			int k = start;
			//			while (Math.abs(k + step) <= Math.abs(end)) {
			//				k += step;
			//				list.add(new Integer(k));
			//			}
			return list.toArray();
		}
		return null;
	}

	public String getName() {
		return "to";
	}


}
