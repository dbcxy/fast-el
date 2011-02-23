/**
 * 
 */
package com.greenpineyu.fel.function.collection;

import java.util.ArrayList;

import org.apache.commons.lang.ArrayUtils;

import com.greenpineyu.fel.function.CommonFunction;

/**
 * @author Administrator
 * 
 */
public class List extends CommonFunction {

	/**
	 * 语法：list(valueExp1{,valueExp2{,valueExp3{,……}}})
	 */
	public Object call(Object[] arguments) {
		if (!ArrayUtils.isEmpty(arguments)) {
			java.util.List list = new ArrayList();
			for (int i = 0; i < arguments.length; i++) {
				Object arg = arguments[i];
				if (arg instanceof Object[]) {
					Object[] os = (Object[]) arg;
					for (int j = 0; j < os.length; j++) {
						list.add(os[j]);
					}
				} else {
					list.add(arg);
				}
			}
			return list.toArray();
		}
		return null;
	}

	public String getName() {
		return "list";
	}

}
