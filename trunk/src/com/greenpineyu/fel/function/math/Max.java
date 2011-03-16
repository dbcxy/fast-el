/**
 * 
 */
package com.greenpineyu.fel.function.math;

import org.apache.commons.lang.ArrayUtils;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.function.CommonFunction;
import com.greenpineyu.fel.function.operator.RelationalOperator;

/**
 * @author Administrator
 *
 */
public class Max extends CommonFunction {

	/* (non-Javadoc)
	 * @see .script.function.CommonFunction#call(java.lang.Object[])
	 */
	public Object call(Object[] arguments) {
		Object result = null;
		boolean isFrist = true;
		if (!ArrayUtils.isEmpty(arguments)) {
			for (int i = 0; i < arguments.length; i++) {
				Object arg = arguments[i];
				if(arg == null){
					continue ;
				}else{
					try {
						arg = NumberUtil.toBigDecimal(arg);
					} catch (Exception e) {
						continue ;
					}
				}
				if(isFrist){
					result = arg;
					isFrist = false;
					continue ;
				}
				boolean g = RelationalOperator.greaterThan(result, arg);
				if(!g){
					result = arg;
				}
			}
		}
		if(result instanceof String){
			result = new Double((String)result);
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see .script.function.Function#getName()
	 */
	public String getName() {
		return "max";
	}

}
