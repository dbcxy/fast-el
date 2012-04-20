package com.greenpineyu.fel;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.greenpineyu.fel.context.FelContext;

public class CollectionGetTest {

	Integer index = 1;

	FelEngine engine;
	FelContext ctx;
	int[] pa = { 1, 2, 3 };
	int[][] pa2 = { { 10, 20 }, { 30, 40 } };
	Integer[] wa = { 11, 22, 33 };
	Integer[][] wa2 = { { 100, 200 }, { 300, 400 } };
	List<String> l = new ArrayList<String>();
	List<List<String>> ll = new ArrayList<List<String>>();
	{
		engine = new FelEngineImpl();
		ctx = engine.getContext();
		ctx.set("index", index);
		ctx.set("pa", pa);
		ctx.set("wa", wa);

		ctx.set("pa2", pa2);

		ctx.set("wa2", wa2);

		l.add("a");
		l.add("b");
		ctx.set("l", l);

		ll.add(l);

		ArrayList<String> l2 = new ArrayList<String>(l);
		l2.add("c");
		ll.add(l2);
		ctx.set("ll", ll);
	}

	@Test(dataProvider = "dp")
	public void eval(String exp, Object actual) {
		FelEngineImplTest.compare(engine.eval(exp), actual);
	}

	@Test(dataProvider = "dp")
	public void compile(String exp, Object actual) {
		Expression expObj = engine.compile(exp, ctx);
		FelEngineImplTest.compare(expObj.eval(ctx), actual);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { { "wa[index]", wa[index] }, { "pa[1]", pa[1] },
				{ "pa2[1]", pa2[1] }, { "wa2[index]", wa2[index] },
				{ "l[index]", l.get(1) }, { "l[1]", l.get(1) },
				{ "ll[1][1]", ll.get(1).get(1) }, };
	}

}
