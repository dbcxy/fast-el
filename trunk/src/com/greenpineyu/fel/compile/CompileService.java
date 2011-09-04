package com.greenpineyu.fel.compile;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

public class CompileService {
	
	private SourceGenerator srcGen;
	private FelCompiler complier;
	
	public SourceGenerator getSrcGen() {
		return srcGen;
	}

	public void setSrcGen(SourceGenerator srcGen) {
		this.srcGen = srcGen;
	}

	public FelCompiler getComplier() {
		return complier;
	}

	public void setComplier(FelCompiler complier) {
		this.complier = complier;
	}

	{
		srcGen = new SourceGeneratorImpl();
		complier = new FelCompilerImpl();
	}
	
	public Expression compile(FelContext ctx,FelNode node){
		JavaSource src = srcGen.getSource(ctx, node);
		return complier.compile(src);
	}
	

}
