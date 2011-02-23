package com.greenpineyu.fel.function.operator;

import java.math.BigDecimal;

import com.greenpineyu.fel.common.FunctionUtil;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 包名				com.datanew.excel.script.function.operator
 * 类名				RelationalOperator.java
 * 创建日期				Oct 26, 20103:04:25 PM
 * 作者				张鑫
 * 版权				杭州数新软件
 */
public class RelationalOperator extends CommonFunction {

	private String operator;
	
	private RelationalOperator(String operator) {
		this.operator = operator;
	}
	
	public static final String LESSTHEN_STR = "<";
	public static final String GREATERTHAN_STR = ">";
	public static final String LESSTHENOREQUALS_STR = "<=";
	public static final String GREATERTHANOREQUALS_STR = ">=";
	
	public static final RelationalOperator LESSTHEN;
	public static final RelationalOperator GREATERTHAN;
	public static final RelationalOperator LESSTHENOREQUALS;
	public static final RelationalOperator GREATERTHANOREQUALS;
	
	static {
		LESSTHEN = new RelationalOperator(LESSTHEN_STR);
		GREATERTHAN = new RelationalOperator(GREATERTHAN_STR);
		LESSTHENOREQUALS = new RelationalOperator(LESSTHENOREQUALS_STR);
		GREATERTHANOREQUALS = new RelationalOperator(GREATERTHANOREQUALS_STR);
	}
	
	
	public Object call(Object[] arguments) {
		boolean result = false;
		if(arguments != null && arguments.length == 2){
			Object left = arguments[0];
			Object right = arguments[1];
			if(this == LESSTHEN){
				result = lessThan(left, right);
			}else if(this == GREATERTHAN){
				result = greaterThan(left, right);
			}else if(this == LESSTHENOREQUALS){
				result = lessThanOrEqual(left, right);
			}else if(this == GREATERTHANOREQUALS){
				result = greaterThanOrEqual(left, right);
			}
			return new Boolean(result);
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}

	/**
	 * 小于 <
	 * @param left
	 * @param right
	 * @return
	 */
    public static boolean lessThan(Object left, Object right) {
    	if ((left == right) || (left == null) || (right == null)) {
		    return false;
		} else if (FunctionUtil.isFloatingPointNumber(left) || FunctionUtil.isFloatingPointNumber(right)) {
		    double leftDouble = FunctionUtil.toDouble(left);
		    double rightDouble = FunctionUtil.toDouble(right);
		    return leftDouble < rightDouble;
		} else if (left instanceof BigDecimal || right instanceof BigDecimal) {
			BigDecimal l  = FunctionUtil.toBigDecimal(left);
			BigDecimal r  = FunctionUtil.toBigDecimal(right);
			return l.compareTo(r) < 0;
		} else if (FunctionUtil.isNumberable(left) || FunctionUtil.isNumberable(right)) {
		    long leftLong = FunctionUtil.toLong(left);
		    long rightLong = FunctionUtil.toLong(right);
		    return leftLong < rightLong;
		} else if (left instanceof String || right instanceof String) {
            String leftString = left.toString();
            String rightString = right.toString();
            return leftString.compareTo(rightString) < 0;
        } else if (left instanceof Comparable) {
            final Comparable comparable = (Comparable) left;
            return comparable.compareTo(right) < 0;
        } else if (right instanceof Comparable) {
            final Comparable comparable = (Comparable) right;
            return comparable.compareTo(left) > 0;
        }
		return false;
    }

	/**
	 * 大于 >
	 * @param left
	 * @param right
	 * @return
	 */
    public static boolean greaterThan(Object left, Object right) {
        if (left == null || right == null) {
            return false;
        }
        return !EqualsOperator.equals(left, right) && !lessThan(left, right);
    }

	/**
	 * 小于等于 <=
	 * @param left
	 * @param right
	 * @return
	 */
    private boolean lessThanOrEqual(Object left, Object right) {
        return EqualsOperator.equals(left, right) || lessThan(left, right);
    }

	/**
	 * 大于等于 >=
	 * @param left
	 * @param right
	 * @return
	 */
    private boolean greaterThanOrEqual(Object left, Object right) {
        return EqualsOperator.equals(left, right) || greaterThan(left, right);
    }
	
	public String getName() {
		return this.operator;
	}

}
