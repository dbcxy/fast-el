# 介绍 #

以前的性能测试是拿JEXL作为比较对象，由于JEXL与Fel的执行速度不是一个级别的。这次就选用Java作为比较对象。看看Fel和Java之间的速度差异。


**备注：以下所有测试中的时间统计都没有包含编译时间。**

# 软硬件环境 #

|操作系统	| Microsoft Windows 7 Home Basic SP1 64bit|
|:----|:----------------------------------------|
|CPU 	|Intel(R) Core(TM) i3-2310M CPU@2.10GHz   |
|内存 	 |4G ddr3-1333                             |
|JDK 	|java version "1.6.0\_26"                 |
|Fel   |0.7.1                                    |
|Jvm参数|-server                                  |
|表达式执行次数|1亿次                                      |


# 变量 #
```
Map<String, Object> vars = new HashMap<String, Object>(); 
vars.put("i", 100); 
vars.put("pi", 3.14d); 
vars.put("d", -3.9); 
vars.put("b", (byte) 4); 
vars.put("bool", false); 
Map<String,Object> m = new HashMap<String, Object>(); 
m.put("d", 5); 
m.put(null,"this is null"); 
vars.put("m", m); 
vars.put("s","hello world");
```


## 场景1：常量计算 ##
表达式：
```
1000+100.0*99-(600-3*15)%(((68-9)-3)*2-100)+10000%7*71
```

执行结果：11181.0

|EL	|耗时（ms)|
|:--|:-----|
|fel	|4     |
|java	|685   |



## 场景2：包含多个变量的布尔表达式 ##
表达式：
```
i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ==i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99
```

执行结果：true

|EL	|耗时（ms)|
|:--|:-----|
|fel	|3389  |
|java	|7680  |

## 场景3：包含多个变量的算术表达式 ##
表达式：
```
pi*d+b-(1000-d*b/pi)/(pi+99-i*d)-i*pi*d/b
```

执行结果：295.86196287059323

|EL	|耗时（ms)|
|:--|:-----|
|fel   |2791  |
|java	|6390  |

## 场景4：调用JAVA方法 ##
表达式：
```
s.substring(m.d)
```

执行结果： world
|EL	|耗时（ms)|
|:--|:-----|
|fel	|2402  |
|java	|2709  |


## 场景5：嵌套调用JAVA方法 ##
表达式：
```
s.substring(1).substring(2).indexOf('world')
```

执行结果：3
|EL	|耗时（ms)|
|:--|:-----|
|fel	|3291  |
|java	|4208  |

## 测试结论： ##

**常量表达式：比Java快得太多了，主要是Fel对常量表达式作了优化。**

**包含多个变量的表达式：Fel比Java快。Fel同样对变量访问作了优化。**

**字符串访问：Fel比Java快。**

**总结：Fel不比Java慢。**


## 以下为测试代码 ##
```
package com.greenpineyu.fel;

import java.util.HashMap;
import java.util.Map;

import com.greenpineyu.fel.context.ArrayCtxImpl;
import com.greenpineyu.fel.context.FelContext;

@SuppressWarnings("unused")
public class PerformanceTest {

	public static void main(String[] args) {
		speed();
	}

	/**
	 * 测试性能
	 */
	private static void speed() {
		final Map<String, Object> vars = new HashMap<String, Object>();
		vars.put("i", 100);
		vars.put("pi", 3.14d);
		vars.put("d", -3.9);
		vars.put("b", (byte) 4);
		vars.put("bool", false);
		final Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("d", 5);
		vars.put("m", m);
		vars.put("s", "hello world");

		String[] exps = new String[10];
		int index = 0;
		exps[index++] = "1000+100.0*99-(600-3*15)%(((68-9)-3)*2-100)+10000%7*71";
		exps[index++] = "i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ==i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ";
		exps[index++] = "pi*d+b-(1000-d*b/pi)/(pi+99-i*d)-i*pi*d/b";
		exps[index++] = "s.substring(m.d )";
		exps[index++] = "s.substring(1).substring(2).indexOf('world')";
		
		JavaExp[] javaEls = buildJavaExp(vars, m);
		
		int times = 100 * 1000 * 1000;
		int j = 0;
		for (String exp : exps) {
			if (exp == null) {
				break;
			}
			fel(exp, vars, times);
			javaEl(javaEls[j++],times);
		}
	}

	private static JavaExp[] buildJavaExp(final Map<String, Object> vars,
			final Map<String, Integer> m) {
		int index = 0;
		JavaExp[] javaEls= new JavaExp[10];
		javaEls[index++] = new JavaExp(){
			public Object eval() {
				return 1000+100.0*99-(600-3*15)%(((68-9)-3)*2-100)+10000%7*71;
			};
		};
		javaEls[index++] = new JavaExp(){
			public Object eval() {
				int i = (Integer)vars.get("i");
				double pi = (Double)vars.get("pi");
				double d = (Double)vars.get("d");
				byte b = (Byte)vars.get("b");
				return i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ==i * pi + (d * b - 199) / (1 - d * pi) - (2 + 100 - i / pi) % 99 ;
			};
		};
		javaEls[index++] = new JavaExp(){
			public Object eval() {
				int i = (Integer)vars.get("i");
				double pi = (Double)vars.get("pi");
				double d = (Double)vars.get("d");
				byte b = (Byte)vars.get("b");
				return pi*d+b-(1000-d*b/pi)/(pi+99-i*d)-i*pi*d/b;
			};
		};
		javaEls[index++] = new JavaExp(){
			public Object eval() {
				String s = (String) vars.get("s");
				return s.substring(m.get("d"));
			};
		};
		javaEls[index++] = new JavaExp(){
			public Object eval() {
				String s = (String) vars.get("s");
				return s.substring(1).substring(2).indexOf("world");
			};
		};
		return javaEls;
	}
	
	private static long javaEl(JavaExp el,int times){
		long start = System.currentTimeMillis();
		Object result = null;
		int i = 0;
		while (i++ < times) {
			result = el.eval();
		}
		long end = System.currentTimeMillis();
		long cost = end - start;
		System.out.println("java el --------cost[" + cost + " ]---value[" + result
				+ "]");
		return cost;
	}
	
	

	private static void fel(String exp, Map<String, Object> vars, int times) {
		FelContext ctx = new ArrayCtxImpl(vars);
		fel(exp, ctx, times);
	}

	private static long fel(String exp, FelContext ctx, int times) {
		FelEngine engine = new FelEngineImpl();
		Expression expObj = engine.compile(exp, ctx);
		Object evalResult = null;
		long start = System.currentTimeMillis();
		Object result = null;
		int i = 0;
		while (i++ < times) {
			result = expObj.eval(ctx);
		}
		long end = System.currentTimeMillis();
		long cost = end - start;
		System.out.println("fel --------cost[" + cost + " ]---value[" + result
				+ "] ------exp[" + exp + "]");
		return cost;
	}

}

/**
 * java表达式
 * 
 */
interface JavaExp{
	Object eval();
}
```