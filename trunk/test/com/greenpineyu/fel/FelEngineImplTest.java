package com.greenpineyu.fel;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.context.Var;
import com.greenpineyu.fel.interpreter.Interpreter;
import com.greenpineyu.fel.optimizer.Interpreters;
import com.greenpineyu.fel.parser.FelNode;

public class FelEngineImplTest {

	/**
	 * @testng.data-provider name = "eval"
	 */

	FelEngineImpl engine = new FelEngineImpl();
	@DataProvider(name = "eval")
	public Object[][] evalData() {
		FelContext jc = engine.getContext();

		// 构建一个循环的foo
		Foo header = new Foo("header");
		Foo footer = new Foo("footer");
		header.setFoo(footer);
		footer.setFoo(header);

		jc.set("foo", header);
		jc.set("a", Boolean.TRUE);
		jc.set("b", Boolean.FALSE);
		Integer num = new Integer(5);
		jc.set("num", num);
		jc.set("now", Calendar.getInstance().getTime());
		GregorianCalendar gc = new GregorianCalendar(5000, 11, 20);
		jc.set("now2", gc.getTime());
		jc.set("bdec", "7");
		jc.set("bint", "7");
		jc.set("A4", new Integer(4));
		jc.set("B5", num);
		jc.set("f",1.1f);
		
		
		Map<String,String> m = new HashMap<String,String>();
		m.put("cpu", "AMD");
		m.put("memory", "4G");
		m.put(null, "test null key");
//		jc.set("pc", m);
		jc.setVar(new Var("pc", m,Map.class));

		Object[][] a = new Object[1000][];
		AtomicInteger i = new AtomicInteger(-1);

				
		// 算术运算
				add(a, i, "+1", new Integer(1));
				add(a, i, "+num", num);
				add(a, i, "+num+num", +num+num);
				add(a, i, "-num--num", -num-(-num));
		//		if(true){
		//			return subarray(object, i);
		//		}
				add(a, i, "-1", new Integer(-1) );
		add(a, i, "2*-1", -2);
		add(a, i, "1--1", 2);
		add(a, i, "-1--1", 0);
		add(a, i, "+1-+1", 0);
		add(a, i, "-1.23-1", -2.23);
		//		add(object, i, "f+1", 2.1 );
				add(a, i, "A4*B5", new Integer(4 * 5) );

		// 逻辑运算
				add(a, i, "5 % 10", 5 );
				add(a, i, "5 % 2", 1 );
				add(a, i, "11 % 5", 1 );
				add(a, i, "a == b", Boolean.FALSE );
				add(a, i, "a==true", Boolean.TRUE );
				add(a, i, "a==false", Boolean.FALSE );
				add(a, i, "1=='1'", Boolean.TRUE );
				add(a, i, "1==1.0", Boolean.TRUE );
				add(a, i, "1=='1.0'", Boolean.TRUE );
				add(a, i, "1.0=='1.0'", Boolean.TRUE );
				add(a, i, "true==false", Boolean.FALSE );
				add(a, i, "1+'2'", "12" );
				add(a, i, "1+'2'+1", "121" );
				add(a, i, "'1'+2", "12" );
				add(a, i, "'1'+'2'", "12" );
				add(a, i, "'1'+2+'1'", "121" );
		//		add(object, i, "'1'*2+'1'", "121" );
				add(a, i, "1.5-1", 0.5 );
				add(a, i, "1/3", 1.0 / 3 );
				add(a, i, "2*(4+3)", 14);
				
				
				add(a, i, "2 < 3", Boolean.TRUE );
				add(a, i, "num < 5", Boolean.FALSE );
				add(a, i, "num < num", Boolean.FALSE );
				add(a, i, "num < null", Boolean.FALSE );
				add(a, i, "num < 2.5", Boolean.FALSE );
				add(a, i, "now2 < now", Boolean.FALSE ); // test
				// comparable
				// engine,
				add(a, i, "'6' <= '5'", Boolean.FALSE );
				add(a, i, "num <= 5", Boolean.TRUE );
				add(a, i, "num <= num", Boolean.TRUE );
				add(a, i, "num <= null", Boolean.FALSE );
				add(a, i, "num <= 2.5", Boolean.FALSE );
				add(a, i, "now2 <= now", Boolean.FALSE ); // test
				// comparable

				add(a, i, "'6' >= '5'", Boolean.TRUE );
				add(a, i, "num >= 5", Boolean.TRUE );
				add(a, i, "num >= num", Boolean.TRUE );
				add(a, i, "num >= null", Boolean.TRUE );
				add(a, i, "num >= 2.5", Boolean.TRUE );
				add(a, i, "now2 >= now", Boolean.TRUE ); // test
				// comparable

				add(a, i, "'6' > '5'", Boolean.TRUE );
				add(a, i, "num > 4", Boolean.TRUE );
				add(a, i, "num > num", Boolean.FALSE );
				add(a, i, "num > null", Boolean.TRUE );
				add(a, i, "num > 2.5", Boolean.TRUE );
				add(a, i, "now2 > now", Boolean.TRUE ); // test
				// comparable

				add(a, i, "\"foo\" + \"bar\" == \"foobar\"",
						Boolean.TRUE );

				add(a, i, "bdec > num", Boolean.TRUE );
				add(a, i, "bdec >= num", Boolean.TRUE );
				add(a, i, "num <= bdec", Boolean.TRUE );
				add(a, i, "num < bdec", Boolean.TRUE );
				add(a, i, "bint > num", Boolean.TRUE );
				add(a, i, "bint == bdec", Boolean.TRUE );
				add(a, i, "bint >= num", Boolean.TRUE );
				add(a, i, "num <= bint", Boolean.TRUE );
				add(a, i, "num < bint", Boolean.TRUE );

				add(a, i, "foo == foo", Boolean.TRUE);
				add(a, i, "foo.foo !=null", Boolean.TRUE);
				add(a, i, "foo != foo.foo", Boolean.TRUE);

				add(a, i, "'A' == 'A' || 'B' == 'B' && 'A' == 'A' && 'A' == 'A'",
						Boolean.TRUE);
				add(a, i,
						"'A' != 'A' && 'B' == 'B' && 'A' == 'A' && 'A' == 'A'",
						Boolean.FALSE );
				add(a, i, "true?1:2", 1);
				add(a, i, "true?false?2:3:1", 3);
				add(a,
						i,
						"6.7-100>39.6 ? 5==5? 4+5:6-1 : !(100%3-39.0<27) ? 8*2-199: 100%3",
						1);

		/*
		*//** **************** Dot operator start **************** */
		// add(object, i, "foo.name", header.get("name")
		// );
		add(a, i, "$('Math').max($('Math').min(1,2),3).doubleValue()", 3.0);
		add(a, i, "$('" + Foo.class.getName() + "').sayHello('fel')",
				Foo.sayHello("fel"));
		add(a, i, "$('" + Foo.class.getName() + ".new').get('name')",
				new Foo().get("name"));
		add(a, i, "foo.foo", footer );
		add(a, i, "foo.getCount()",
				new Integer(header.getCount()) );

		add(a, i, "foo.foo.foo", header );
		add(a, i, "foo.foo.getCount()",
				new Integer(footer.getCount()) );

		add(a, i, "foo.getFoo().foo", header );
		add(a, i, "foo.getFoo().getFoo()", header );
		add(a, i, "foo.getFoo().getFoo().getFooes()[1]", header.getFoo().getFoo().getFooes()[1] );
		add(a, i, "foo.getFoo().getFoo().getFooes()[1].name", header.getFoo().getFoo().getFooes()[1].get("name") );

		add(a, i, "foo.convertBoolean(true)",
				header.convertBoolean(true) );
		add(a, i, "pc.cpu",m.get("cpu"));
		add(a, i, "pc.memory",m.get("memory"));
		add(a, i, "pc.get(null)",m.get(null));
		add(a,i,"pc.put('cpu','intel')",m.get("cpu"));
		
		/*
		*//** **************** Dot operator end **************** */
		/*
*/
		add(a, i, "true && 1==2 && (1>2 || 2>1)",
				Boolean.FALSE );
		add(a, i, "true && 1==1 && (1>2 || 2>1)",
				Boolean.TRUE );
		add(a, i, "true && null", Boolean.FALSE );
		add(a, i, "null && null", Boolean.FALSE );
		add(a, i, "null || null", Boolean.FALSE );
		add(a, i, "null || true", Boolean.TRUE );

		addStringTest(a, i);

		return subarray(a, i.intValue());
	}

	private void add(Object[][] array, AtomicInteger i, String exp, Object value) {
		array[i.incrementAndGet()] = new Object[] { exp, value };
	}

	private Object[][] subarray(Object[][] object, int i) {
		return ArrayUtils.subarray(object, 0, i);
	}

	private void addStringTest(Object[][] object,
			AtomicInteger i) {
		object[i.incrementAndGet()] = new Object[] { "'abc'.indexOf('bc')", 1 };
		object[i.incrementAndGet()] = new Object[] { "'abc'.substring(1)", "bc" };
	}

	/**
	 * @param engine
	 * @param expr
	 * @param expected
	 */
	@Test(dataProvider = "eval")
	public void testEvalWithCompiler(String expr,
			Object expected) {
		Expression ins = engine.compile(expr, null);
		Object actual = ins.eval(engine.getContext());
		compare(expected, actual);
	}

	public static void compare(Object expected, Object actual) {
		if(actual instanceof Number && expected instanceof Number){
			assert NumberUtil.toDouble(actual)==NumberUtil.toDouble(expected);
		}else{
			assert ObjectUtils.equals(expected, actual);
		}
	}

	/**
	 * @testng.test dataProvider="eval" group = "script"
	 */
	@Test(dataProvider = "eval")
	protected void testEval(String expression, Object expected) {
		Object actual = engine.eval(expression);
		if (actual instanceof Object[]) {
			Object[] objs = (Object[]) actual;
			StringBuffer buf = new StringBuffer();
			for (int j = 0; j < objs.length; j++) {
				buf.append(objs[j]);
				if (j < objs.length - 1)
					buf.append(",");
			}
			actual = buf.toString();
		}
		assert ObjectUtils.equals(expected, actual);
		// assertEquals(expression, expected, actual);
	}

	/*
	 * private void assertColon(FelEngine engine, String cellArea, Object[]
	 * result) { Object eval = engine.eval(cellArea); assert
	 * eval.getClass().isArray(); assert Arrays.equals((Object[]) eval, result);
	 * }
	 */

	/**
	 * @testng.data-provider name = "parse"
	 */
	public Object[][] parseData() {
		Object[][] object = new Object[1000][];
		int i = 0;
		// 算术运算
		object[i++] = new Object[] { "a.b()", "true" };
		object[i++] = new Object[] { "new Date()", "false" };
		return subarray(object, i);
	}

	/**
	 * @testng.test dataProvider="parse" group = "script"
	 */
	protected void testParse(String expression, String expected) {
		FelEngine engine = new FelEngineImpl();
		boolean isPassed = true;
		try {
			engine.parse(expression);
		} catch (Exception e) {
			isPassed = false;
		}
		assert isPassed == new Boolean(expected).booleanValue();
	}
	/**
	 * 
	 */
	// @Test
	public void testConcurrent(){
		int i = 100;
		ExecutorService pool =
			new ThreadPoolExecutor(0, i,
					1L, TimeUnit.SECONDS,
					new SynchronousQueue<Runnable>());
		final boolean[] result = new boolean[i];
		for (int j = 0; j < i; j++) {
			final int pos = j;
			pool.submit(new Runnable() {
				@Override
				public void run() {
					final FelEngine e = new FelEngineImpl();
					final FelContext ctx = e.getContext();
					Interpreters inte = new Interpreters();
					// 随机生成A,B,C三个字母
					String varName =String.valueOf((char)(65+(int)(Math.random()*3)));
					final String varValue = varName+"_value";
					inte.add(varName, new Interpreter() {
						@Override
						public Object interpret(FelContext context, FelNode node) {
							return varValue;
						}
					});

					Object value = e.compile(varName, ctx, inte).eval(null);
					//System.out.println(varName+"=>"+(value == varValue));
					result[pos]= value == varValue;
				}

			});
		}
		pool.shutdown();
		while(!pool.isTerminated()){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (boolean b : result) {
			assert b;
		}
	}

	public static void main(String[] args) {
		
		FelEngineImplTest test = new FelEngineImplTest();
		// test.testConcurrent();

		FelEngineImpl engine = new FelEngineImpl();
		Object eval = engine.eval("$('Math').max(1,2)");
		System.out.println(eval);

	}
}
