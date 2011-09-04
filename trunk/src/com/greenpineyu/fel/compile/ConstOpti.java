package com.greenpineyu.fel.compile;

import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.apache.commons.lang3.ObjectUtils;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.optimizer.Optimizer;
import com.greenpineyu.fel.parser.ConstNode;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 常量节点优化，表达式："1+2+var",当var是变量时，可以优化成"3+var";当var是常量，其值为3时，可以优化成"6"
 * @author yuqingsong
 *
 */
public class ConstOpti implements Optimizer {


	public FelNode call(FelContext ctx, FelNode node) {
		if(node.stable()){
			Object value = node.getInterpreter().interpret(ctx, node);
			Token token = new ConstOptToken(node);
			token.setText(ObjectUtils.toString(value));
			return new ConstNode(token, value);
		}else{
			List<FelNode> children = node.getChildren();
			if(children !=null){
				for (int i = 0; i < children.size(); i++) {
					FelNode c = (FelNode) children.get(i);
					children.set(i, this.call(ctx, c));
				}
			}
			return node;
		}
	}

}
/**
 * 常量节点，用于保存原节点
 * @author yuqingsong
 *
 */
@SuppressWarnings("serial")
class ConstOptToken extends CommonToken{
	@SuppressWarnings("unused")
	private FelNode node;
	ConstOptToken(FelNode node){
		super(-1,node.getText());
		this.node = node;
	}
}
