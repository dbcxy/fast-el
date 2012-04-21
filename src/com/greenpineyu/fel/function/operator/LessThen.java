package com.greenpineyu.fel.function.operator;

import static com.greenpineyu.fel.function.operator.Equal.appendNumber;

import java.util.List;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.Function;
import com.greenpineyu.fel.function.TolerantFunction;
import com.greenpineyu.fel.parser.FelNode;
import com.greenpineyu.fel.parser.Stable;

/**
 * 包名 .script.function.operator 类名 RelationalOperator.java 创建日期 Oct 26,
 * 20103:04:25 PM 作者 版权
 */
public class LessThen  implements Stable,Function {

//	private final String operator;
	
//	private RelationalOperator(String operator) {
//		this.operator = operator;
//	}
//	
//	public static final String LESSTHEN_STR = "<";
//	public static final String GREATERTHAN_STR = ">";
//	public static final String LESSTHENOREQUALS_STR = "<=";
//	public static final String GREATERTHANOREQUALS_STR = ">=";
//	
//	public static final RelationalOperator LESSTHEN;
//	public static final RelationalOperator GREATERTHAN;
//	public static final RelationalOperator LESSTHENOREQUALS;
//	public static final RelationalOperator GREATERTHANOREQUALS;
	
//	static {
//		LESSTHEN = new RelationalOperator(LESSTHEN_STR);
//		GREATERTHAN = new RelationalOperator(GREATERTHAN_STR);
//		LESSTHENOREQUALS = new RelationalOperator(LESSTHENOREQUALS_STR);
//		GREATERTHANOREQUALS = new RelationalOperator(GREATERTHANOREQUALS_STR);
//	}
	
	@Override
	public Object call(FelNode node, FelContext context) {
		List<FelNode> children = node.getChildren();
		if(children!=null && children.size()==2){
			Object left = TolerantFunction.eval(context,children.get(0));
			Object right = TolerantFunction.eval(context,children.get(1));
			return compare(left, right);
		}
		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
	}
	
	
//	@Override
//	public Object call(Object[] arguments) {
//		boolean result = false;
//		if(arguments != null && arguments.length == 2){
//			Object left = arguments[0];
//			Object right = arguments[1];
//			if(this == LESSTHEN){
//				result = lessThan(left, right);
//			}else if(this == GREATERTHAN){
//				result = greaterThan(left, right);
//			}else if(this == LESSTHENOREQUALS){
//				result = lessThanOrEqual(left, right);
//			}else if(this == GREATERTHANOREQUALS){
//				result = greaterThanOrEqual(left, right);
//			}
//			return new Boolean(result);
//		}
//		throw new NullPointerException("传入参数数组为空或者参数个数不正确!");
//	}
	
	/**
	 * 小于
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
    public boolean compare(Object left, Object right) {
    if(left == right){
		return false;
	}
	
	if(left == null || right == null){
		return false;
	}
	
	if(left instanceof Number && right instanceof Number){
		return NumberUtil.toDouble((Number)left)<NumberUtil.toDouble((Number)right);
	}
	
	if(left instanceof Comparable && right instanceof Comparable){
		return ((Comparable)left).compareTo(right)<0;
	}
	// TODO 是返回false还是抛出异常?
	return false;
    }

	/**
	 * 小于 <
	 * 
	 * @param left
	 * @param right
	 * @return
	 *//*
	public static boolean lessThan(Object left, Object right) {
    	if(left == right){
    		return false;
    	}
    	
    	if(left == null || right == null){
    		return false;
    	}
    	
    	if(left instanceof Number && right instanceof Number){
    		return NumberUtil.toDouble((Number)left)<NumberUtil.toDouble((Number)right);
    	}
    	// TODO 是返回false还是抛出异常?
    	return false;
    }*/
/*    @SuppressWarnings("unchecked")
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
*/	
    
    public static StringBuilder buildRelationExpr(FelNode node, FelContext ctx,
			String operator) {
		List<FelNode> child = node.getChildren();
		FelNode leftNode = child.get(0);
		FelNode rightNode = child.get(1);
		SourceBuilder leftM = leftNode.toMethod(ctx);
		SourceBuilder rightM = rightNode.toMethod(ctx);
		Class<?> leftType = leftM.returnType(ctx, leftNode);
		Class<?> rightType = rightM.returnType(ctx, rightNode);
		String left = "(" + leftM.source(ctx, leftNode) + ")";
		String right = "(" +rightM.source(ctx, rightNode) + ")";

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
		} else {
			throw new UnsupportedOperationException("类型" + leftType + "与类型"
					+ rightType + "不支持比较操作。");
		}
		return sb;
	}

	

	/**
	 * 小于等于 <=
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
   /* private boolean lessThanOrEqual(Object left, Object right) {
        return EqualsOperator.equals(left, right) || lessThan(left, right);
    }*/

	/**
	 * 大于等于 >=
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
   /* private boolean greaterThanOrEqual(Object left, Object right) {
        return EqualsOperator.equals(left, right) || greaterThan(left, right);
    }*/
	
	public String getName() {
		return "<";
	}

	@Override
	public FelMethod toMethod(FelNode node, FelContext ctx) {
		StringBuilder code = buildRelationExpr(node, ctx, this.getName());
		return new FelMethod(Boolean.class, code.toString());
	}

	public boolean stable() {
		return true;
	}
	
	public static void main(String[] args) {
		FelEngine engine = FelEngine.instance;
		System.out.println(engine.eval("6>=5"));
		
	}

	

}
