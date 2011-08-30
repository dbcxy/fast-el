package com.greenpineyu.fel.function.operator;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.CommonFunction;
import com.greenpineyu.fel.parser.FelNode;
import com.greenpineyu.fel.parser.Optimizable;
import com.greenpineyu.fel.parser.Stable;

import static com.greenpineyu.fel.function.operator.EqualsOperator.*;

/**
 * 包名				.script.function.operator
 * 类名				RelationalOperator.java
 * 创建日期				Oct 26, 20103:04:25 PM
 * 作者				
 * 版权				
 */
public class RelationalOperator extends CommonFunction implements Stable {

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
    	if(left != null && right != null){
    		if ((left == right)) {
    			return false;
    		} else if (NumberUtil.isFloatingPointNumber(left) || NumberUtil.isFloatingPointNumber(right)) {
    			double leftDouble = NumberUtil.toDouble(left);
    			double rightDouble = NumberUtil.toDouble(right);
    			return leftDouble < rightDouble;
    		} else if (left instanceof BigDecimal || right instanceof BigDecimal) {
    			BigDecimal l  = NumberUtil.toBigDecimal(left);
    			BigDecimal r  = NumberUtil.toBigDecimal(right);
    			return l.compareTo(r) < 0;
    		} else if (NumberUtil.isNumberable(left) || NumberUtil.isNumberable(right)) {
    			long leftLong = NumberUtil.toLong(left);
    			long rightLong = NumberUtil.toLong(right);
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
    	}else{
    		return left == null?true:false;
    	}
		return false;
    }
    
    public static StringBuilder buildRelationExpr(FelNode node, FelContext ctx,
			String operator) {
		List<FelNode> child = node.getChildren();
		FelNode leftNode = child.get(0);
		FelNode rightNode = child.get(1);
		FelMethod leftM = leftNode.toMethod(ctx);
		FelMethod rightM = rightNode.toMethod(ctx);
		Class<?> leftType = leftM.getReturnType();
		Class<?> rightType = rightM.getReturnType();
		String left = "(" + leftM.getCode() + ")";
		String right = "(" +rightM.getCode() + ")";

		StringBuilder sb = new StringBuilder();
		// 只要有一个是数值型，就将另一个也转成值型。
		if (Number.class.isAssignableFrom(leftType)) {
			sb.append(left);
			sb.append(operator);
			appendNumber(rightType, right, sb);
		} else if (Number.class.isAssignableFrom(rightType)) {
			appendNumber(leftType, left, sb);
			sb.append(operator);
			sb.append(right);
		}  else if (Comparable.class.isAssignableFrom(leftType)&&Comparable.class.isAssignableFrom(rightType)) {
			sb.append("NumberUtil.compare(" + left + ","+ right + ")"+operator+"0");
			NumberUtil.compare(new Date(), new Date());
		} else {
			throw new UnsupportedOperationException("类型"+leftType+"与类型"+rightType+"不支持比较操作。");
		}
		return sb;
	}

	/**
	 * 大于 >
	 * @param left
	 * @param right
	 * @return
	 */
    public static boolean greaterThan(Object left, Object right) {
        if (left != null && right != null) {
            return !EqualsOperator.equals(left, right) && !lessThan(left, right);
        }
        return left == null?false:true;
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

	public FelMethod toMethod(FelNode node, FelContext ctx) {
		StringBuilder code = buildRelationExpr(node, ctx, this.getName());
		return new FelMethod(Boolean.class, code.toString());
	}

	public boolean stable() {
		return true;
	}

}
