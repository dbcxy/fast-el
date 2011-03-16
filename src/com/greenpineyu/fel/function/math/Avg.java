/**
 * 
 */
package com.greenpineyu.fel.function.math;

import com.greenpineyu.fel.function.CommonFunction;
import com.greenpineyu.fel.function.operator.MultiplicativeOperator;

/**
 * @author Administrator
 *
 */
public class Avg extends CommonFunction {

	/* (non-Javadoc)
	 * @see .script.function.CommonFunction#call(java.lang.Object[])
	 */
	public Object call(Object[] arguments) {
		Object result = new Double(0);
		if(arguments != null){
			Integer l = new Integer(arguments.length);
			if (l.intValue() == 0)
				return new Double(0);
			Object sum = Sum.sum(arguments);
			try {
				result = MultiplicativeOperator.divide(sum, l);
			} catch (Exception e) {
				result = new Double(0);
			}
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see .script.function.Function#getName()
	 */
	public String getName() {
		return "avg";
	}

}
