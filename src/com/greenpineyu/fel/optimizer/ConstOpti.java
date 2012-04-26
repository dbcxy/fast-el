package com.greenpineyu.fel.optimizer;

import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.Function;
import com.greenpineyu.fel.function.operator.And;
import com.greenpineyu.fel.function.operator.Or;
import com.greenpineyu.fel.parser.ConstNode;
import com.greenpineyu.fel.parser.FelNode;
import com.greenpineyu.fel.parser.FunNode;

/**
 * 常量节点优化，优化表达式中的常量部分。
 * 表达式："1+2+var",当var是变量时，可以优化成"3+var";当var是常量，其值为3时，可以优化成"6"
 * 
 * @author yuqingsong
 * 
 */
public class ConstOpti implements Optimizer {


	@Override
	public FelNode call(FelContext ctx, FelNode node) {
		if(node.stable()){
			Object value = node.getInterpreter().interpret(ctx, node);
			return newConstNode(node, value);
		}else{
			List<FelNode> children = node.getChildren();
			if (children != null) {
				// 是否进行过短路优化
				boolean isLogicOptimized = false;
				if (node instanceof FunNode) {
					FunNode n = (FunNode) node;
					Function fun = n.getFun();
					if (fun instanceof And) {
						List<FelNode> args = node.getChildren();
						FelNode left = args.get(0);
						FelNode right = args.get(1);
						boolean isOr = fun instanceof Or;
						// 短路的判断值，or使用True来判断，and使用false来判断
						Boolean result = isOr;
						// if (isOr) {
						FelNode constNode = toShortCutConst(node, ctx, left,
								result);
						if (constNode != null) {
							return constNode;
						}
						constNode = toShortCutConst(node, ctx, right, result);
						if (constNode != null) {
							return constNode;
						}
						// else if (right.stable()) {
						// Object rightValue = node.getInterpreter()
						// .interpret(ctx, right);
						// if (result.equals(right)) {
						// isLogicOptimized = true;
						// return newConstNode(node, rightValue);
						// }
						// }
						// }else{
						// if(left.stable()){
						// Object leftValue =
						// node.getInterpreter().interpret(ctx,
						// left);
						// if (Boolean.FALSE.equals(leftValue)) {
						// children.remove(1);
						// children.set(0, newConstNode(left, leftValue));
						// }
						// }else if(right.stable()){
						// Object rightValue =
						// node.getInterpreter().interpret(ctx,
						// right);
						// if(Boolean.FALSE.equals(right)) {
						// children.remove(1);
						// children.set(0, newConstNode(right, rightValue));
						// }
						// }
						// }
					}
				}
				if (!isLogicOptimized) {
					for (int i = 0; i < children.size(); i++) {
						FelNode c = children.get(i);
						children.set(i, this.call(ctx, c));
					}
				}
			}
			return node;
		}
	}


	private FelNode toShortCutConst(FelNode node, FelContext ctx, FelNode left,
			Boolean result) {
		FelNode constNode = null;
		if (left.stable()) {
			Object leftValue = node.getInterpreter().interpret(ctx, left);
			if (result.equals(leftValue)) {
				constNode = newConstNode(node, leftValue);
			}
		}
		return constNode;
	}

	@SuppressWarnings("unused")
	private void setConstValue(List<FelNode> children, FelNode left,
			Object leftValue) {
		children.remove(1);
		children.set(0, newConstNode(left, leftValue));
	}


	private FelNode newConstNode(FelNode node, Object value) {
		Token token = new ConstOptToken(node);
		token.setText(node.getText());
		return new ConstNode(token, value);
	}

}

/**
 * 常量节点，用于保存原节点
 * 
 * @author yuqingsong
 * 
 */
@SuppressWarnings("serial")
class ConstOptToken extends CommonToken{
	@SuppressWarnings("unused")
	private final FelNode node;
	ConstOptToken(FelNode node){
		super(-1,node.getText());
		this.node = node;
	}
}
