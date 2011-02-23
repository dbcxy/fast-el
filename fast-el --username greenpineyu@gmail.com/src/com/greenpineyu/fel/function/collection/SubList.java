/**
 * 
 */
package com.greenpineyu.fel.function.collection;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

import com.greenpineyu.fel.common.FunctionUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * @author Administrator
 * 
 */
public class SubList extends CommonFunction {

	/**
	 * 语法：subList(srcList,startPos,count)
	 */
	public Object call(Object[] arguments) {
		if (!ArrayUtils.isEmpty(arguments) && arguments.length >= 2) {
			Object arg = arguments[0];
			if (arg != null && arg instanceof Object[]) {
				java.util.List srcList = Arrays.asList((Object[]) arg);
				Object arg2 = arguments[1];
				int from = FunctionUtil.toInteger(arg2)-1;
				int to = 0;
				if (arguments.length > 2) {
					Object arg3 = arguments[2];
					to = FunctionUtil.toInteger(arg3);
				} else {
					to = srcList.size() - from;
				}
				to += from;
				return srcList.subList(from, to).toArray();
			}
		}
		return null;
	}

	public String getName() {
		return "sublist";
	}

}
