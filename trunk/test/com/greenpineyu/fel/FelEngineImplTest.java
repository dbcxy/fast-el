package com.greenpineyu.fel;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.context.FelContext;

public class FelEngineImplTest {

	/**
	 * @testng.data-provider name = "eval"
	 */

	@DataProvider(name = "eval")
	public Object[][] evalData() {
		FelEngineImpl engine = new FelEngineImpl();
		FelContext jc = engine.getContext();

		// 构建一个循环的foo
		Foo header = new Foo("header");
		Foo footer = new Foo("footer");
		header.setFoo(footer);
		footer.setFoo(header);

		jc.set("foo", header);
		jc.set("a", Boolean.TRUE);
		jc.set("b", Boolean.FALSE);
		jc.set("num", new Integer(5));
		jc.set("now", Calendar.getInstance().getTime());
		GregorianCalendar gc = new GregorianCalendar(5000, 11, 20);
		jc.set("now2", gc.getTime());
		jc.set("bdec", "7");
		jc.set("bint", "7");
		jc.set("A4", new Integer(4));
		jc.set("B5", new Integer(5));
		jc.set("f",1.1f);
		
		
		Map<String,String> m = new HashMap<String, String>();
		m.put("cpu", "AMD");
		m.put("memory", "4G");
		m.put(null, "test null key");
		jc.set("pc", m);

		Object[][] object = new Object[1000][];
		int i = 0;

		object[i++] = new Object[] { engine, "foo.getCount()",
				new Integer(header.getCount()) };
		// 算术运算
		object[i++] = new Object[] { engine, "+1", new Integer(1) };
		object[i++] = new Object[] { engine, "-1", new Integer(-1) };
//		object[i++] = new Object[] { engine, "f+1", 2.1 };
		object[i++] = new Object[] { engine, "A4*B5", new Integer(4 * 5) };

		// 逻辑运算
		object[i++] = new Object[] { engine, "5 % 10", 5 };
		object[i++] = new Object[] { engine, "5 % 2", 1 };
		object[i++] = new Object[] { engine, "11 % 5", 1 };
		object[i++] = new Object[] { engine, "a == b", Boolean.FALSE };
		object[i++] = new Object[] { engine, "a==true", Boolean.TRUE };
		object[i++] = new Object[] { engine, "a==false", Boolean.FALSE };
		object[i++] = new Object[] { engine, "1=='1'", Boolean.TRUE };
		object[i++] = new Object[] { engine, "1==1.0", Boolean.TRUE };
		object[i++] = new Object[] { engine, "1=='1.0'", Boolean.TRUE };
		object[i++] = new Object[] { engine, "1.0=='1.0'", Boolean.TRUE };
		object[i++] = new Object[] { engine, "true==false", Boolean.FALSE };
		object[i++] = new Object[] { engine, "1+'2'", "12" };
		object[i++] = new Object[] { engine, "1+'2'+1", "121" };
		object[i++] = new Object[] { engine, "'1'+2", "12" };
		object[i++] = new Object[] { engine, "'1'+'2'", "12" };
		object[i++] = new Object[] { engine, "'1'+2+'1'", "121" };
//		object[i++] = new Object[] { engine, "'1'*2+'1'", "121" };
		object[i++] = new Object[] { engine, "1.5-1", 0.5 };
		
		object[i++] = new Object[] { engine, "2 < 3", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num < 5", Boolean.FALSE };
		object[i++] = new Object[] { engine, "num < num", Boolean.FALSE };
		object[i++] = new Object[] { engine, "num < null", Boolean.FALSE };
		object[i++] = new Object[] { engine, "num < 2.5", Boolean.FALSE };
		object[i++] = new Object[] { engine, "now2 < now", Boolean.FALSE }; // test
		// comparable
		// engine,
		object[i++] = new Object[] { engine, "'6' <= '5'", Boolean.FALSE };
		object[i++] = new Object[] { engine, "num <= 5", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num <= num", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num <= null", Boolean.FALSE };
		object[i++] = new Object[] { engine, "num <= 2.5", Boolean.FALSE };
		object[i++] = new Object[] { engine, "now2 <= now", Boolean.FALSE }; // test
		// comparable

		object[i++] = new Object[] { engine, "'6' >= '5'", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num >= 5", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num >= num", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num >= null", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num >= 2.5", Boolean.TRUE };
		object[i++] = new Object[] { engine, "now2 >= now", Boolean.TRUE }; // test
		// comparable

		object[i++] = new Object[] { engine, "'6' > '5'", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num > 4", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num > num", Boolean.FALSE };
		object[i++] = new Object[] { engine, "num > null", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num > 2.5", Boolean.TRUE };
		object[i++] = new Object[] { engine, "now2 > now", Boolean.TRUE }; // test
		// comparable

		object[i++] = new Object[] { engine, "\"foo\" + \"bar\" == \"foobar\"",
				Boolean.TRUE };

		object[i++] = new Object[] { engine, "bdec > num", Boolean.TRUE };
		object[i++] = new Object[] { engine, "bdec >= num", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num <= bdec", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num < bdec", Boolean.TRUE };
		object[i++] = new Object[] { engine, "bint > num", Boolean.TRUE };
		object[i++] = new Object[] { engine, "bint == bdec", Boolean.TRUE };
		object[i++] = new Object[] { engine, "bint >= num", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num <= bint", Boolean.TRUE };
		object[i++] = new Object[] { engine, "num < bint", Boolean.TRUE };

		/*
		*//** **************** Dot operator start **************** */
		// object[i++] = new Object[] { engine, "foo.name", header.get("name")
		// };
		object[i++] = new Object[] { engine, "foo.foo", footer };
		object[i++] = new Object[] { engine, "foo.getCount()",
				new Integer(header.getCount()) };

		object[i++] = new Object[] { engine, "foo.foo.foo", header };
		object[i++] = new Object[] { engine, "foo.foo.getCount()",
				new Integer(footer.getCount()) };

		object[i++] = new Object[] { engine, "foo.getFoo().foo", header };
		object[i++] = new Object[] { engine, "foo.getFoo().getFoo()", header };

		object[i++] = new Object[] { engine, "foo.convertBoolean(true)",
				header.convertBoolean(true) };
		object[i++] = new Object[] { engine, "pc.cpu",m.get("cpu")};
		object[i++] = new Object[] { engine, "pc.memory",m.get("memory")};
		object[i++] = new Object[] { engine, "pc.get(null)",m.get(null)};
		
		/*
		*//** **************** Dot operator end **************** */
		/*
*/
		object[i++] = new Object[] { engine, "true && 1==2 && (1>2 || 2>1)",
				Boolean.FALSE };
		object[i++] = new Object[] { engine, "true && 1==1 && (1>2 || 2>1)",
				Boolean.TRUE };
		object[i++] = new Object[] { engine, "true && null", Boolean.FALSE };
		object[i++] = new Object[] { engine, "null && null", Boolean.FALSE };
		object[i++] = new Object[] { engine, "null || null", Boolean.FALSE };
		object[i++] = new Object[] { engine, "null || true", Boolean.TRUE };

		i = addStringTest(engine, object, i);

		return (Object[][]) ArrayUtils.subarray(object, 0, i);
	}

	private int addStringTest(FelEngineImpl engine, Object[][] object, int i) {
		object[i++] = new Object[] { engine, "'abc'.indexOf('bc')", 1 };
		object[i++] = new Object[] { engine, "'abc'.substring(1)", "bc" };
		return i;
	}

	/**
	 * @param engine
	 * @param expr
	 * @param expected
	 */
	@Test(dataProvider = "eval")
	public void testEvalWithCompiler(FelEngine engine, String expr,
			Object expected) {
		Expression ins = engine.compiler(expr, null);
		Object actual = ins.eval(engine.getContext());
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
	protected void testEval(FelEngine engine, String expression, Object expected) {
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

	private void assertColon(FelEngine engine, String cellArea, Object[] result) {
		Object eval = engine.eval(cellArea);
		assert eval.getClass().isArray();
		assert Arrays.equals((Object[]) eval, result);
	}

	/**
	 * @testng.data-provider name = "parse"
	 */
	public Object[][] parseData() {
		Object[][] object = new Object[1000][];
		int i = 0;
		// 算术运算
		object[i++] = new Object[] { "a.b()", "true" };
		object[i++] = new Object[] { "new Date()", "false" };
		return (Object[][]) ArrayUtils.subarray(object, 0, i);
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

	public static void main(String[] args) {
	}
}
