/**
 * 
 */
package com.greenpineyu.fel.function.math;

import com.greenpineyu.fel.function.CommonFunction;

/**
 * @author Administrator
 *
 */
public class Count extends CommonFunction {

	/* (non-Javadoc)
	 * @see com.datanew.excel.script.function.CommonFunction#call(java.lang.Object[])
	 */
	public Object call(Object[] arguments) {
		if(arguments != null){
			return new Integer(arguments.length);
		}
		return new Integer(0);
	}

	/* (non-Javadoc)
	 * @see com.datanew.excel.script.function.Function#getName()
	 */
	public String getName() {
		return "count";
	}

}
