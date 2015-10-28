# Fel是轻量级的高效的表达式计算引擎 #

Fel在源自于企业项目，设计目标是为了满足不断变化的功能需求和性能需求。

Fel是开放的，引擎执行中的多个模块都可以扩展或替换。Fel的执行主要是通过函数实现,运算符(+、-等都是Fel函数），所有这些函数都是可以替换的，扩展函数也非常简单。

Fel有双引擎，同时支持解释执行和编译执行。可以根据性能要求选择执行方式。编译执行就是将表达式编译成字节码（生成java代码和编译模块都是可以扩展和替换的）

Fel基于Java1.5开发，适用于Java1.5及以上版本。

表达式引擎QQ群：75055831，欢迎交流。


## Fel有多快？ ##
通常情况下，Fel-0.7每秒可以执行千万次表达式（不包含编译时间）。速度是Jexl-2.0的20倍以上。

目前还没有发现开源的表达式引擎比Fel快。

具体的测试数据请参见http://code.google.com/p/fast-el/wiki/Performance。
## 为何要使用Fel? ##
Fel语法和API非常简单，语法与Java基本相同，几乎没有学习成本。

Fel非常快，上面已经做了简单说明。

Fel整个包只有200多KB。

Fel可以非常方便的访问数组、集合、Map的元素和对象的属性。

Fel可以非常方便的调用对象的方法和类方法（如果这些还不够，可以添加自定义函数）。

Fel支持大数值高精度计算

Fel有良好的安全管理功能

如果Fel不能满足你的要求，扩展和修改Fel很简单。

## Fel不能做什么？ ##
Fel只支持表达式，不支持脚本。
## Fel适用场景： ##

Fel适合处理海量数据，Fel良好的扩展性可以更好的帮助用户处理数据。

Fel同样适用于其他需要使用表达式引擎的地方（如果工作流、公式计算、数据有效性校验等等）

## 安装 ##
### 1：获取Fel ###
项目主页：http://code.google.com/p/fast-el/
下载地址：http://code.google.com/p/fast-el/downloads/list
### 2：Jdk1.6环境 ###
使用：将fel.jar加入classpath即可。
构建Fel：下载fel-all.tar.gz，解压后将src作为源码文件夹，并且将lib/antlr-min.jar加入classpath即可。
### 3：Jdk1.5环境： ###
与jdk1.6环境下的区别在于，需要添加jdk内置的tools.jar到classpath。

## Fel使用例子： ##

### 1：算术表达式： ###
```
FelEngine fel = new FelEngineImpl();    
Object result = fel.eval("5000*12+7500");    
System.out.println(result);   
```

输出结果：67500



### 2：变量 ###
使用变量，其代码如下所示：
```
FelContext ctx = fel.getContext();    
ctx.set("单价", 5000);    
ctx.set("数量", 12);    
ctx.set("运费", 7500);    
Object result = fel.eval("单价*数量+运费");    
System.out.println(result);   
```
输出结果：67500

### 3：访问对象属性 ###
在Fel中，可能非常方便的访问对象属性，示例代码如下所示
```
FelEngine fel = new FelEngineImpl();
FelContext ctx = fel.getContext();
Foo foo = new Foo();
ctx.set("foo", foo);
Map<String,String> m = new HashMap<String,String>();
m.put("ElName", "fel");
ctx.set("m",m);
	
//调用foo.getSize()方法。
Object result = fel.eval("foo.size");

//调用foo.isSample()方法。
result = fel.eval("foo.sample");
		
//foo没有name、getName、isName方法
//foo.name会调用foo.get("name")方法。
result = fel.eval("foo.name");
		
//m.ElName会调用m.get("ElName");
result = fel.eval("m.ElName");
```

### 4:访问数组、集合、Map ###
```
FelEngine fel = new FelEngineImpl();
FelContext ctx = fel.getContext();

//数组
int[] intArray = {1,2,3};
ctx.set("intArray",intArray);
//获取intArray[0]
String exp = "intArray[0]";
System.out.println(exp+"->"+fel.eval(exp));

//List
List<Integer> list = Arrays.asList(1,2,3);
ctx.set("list",list);
//获取list.get(0)
exp = "list[0]";
System.out.println(exp+"->"+fel.eval(exp));

//集合
Collection<String> coll = Arrays.asList("a","b","c");
ctx.set("coll",coll);
//获取集合最前面的元素。执行结果为"a"
exp = "coll[0]";
System.out.println(exp+"->"+fel.eval(exp));

//迭代器
Iterator<String> iterator = coll.iterator();
ctx.set("iterator", iterator);
//获取迭代器最前面的元素。执行结果为"a"
exp = "iterator[0]";
System.out.println(exp+"->"+fel.eval(exp));

//Map
Map<String,String> m = new HashMap<String, String>();
m.put("name", "HashMap");
ctx.set("map",m);
exp = "map.name";
System.out.println(exp+"->"+fel.eval(exp));

//多维数组
int[][] intArrays= {{11,12},{21,22}};
ctx.set("intArrays",intArrays);
exp = "intArrays[0][0]";
System.out.println(exp+"->"+fel.eval(exp));

//多维综合体，支持数组、集合的任意组合。
List<int[]> listArray = new ArrayList<int[]>();
listArray.add(new int[]{1,2,3});
listArray.add(new int[]{4,5,6});
ctx.set("listArray",listArray);
exp = "listArray[0][0]";
System.out.println(exp+"->"+fel.eval(exp));
```

### 5:调用JAVA方法 ###
```
FelEngine fel = new FelEngineImpl();   
FelContext ctx = fel.getContext();   
ctx.set("out", System.out);   
fel.eval("out.println('Hello Everybody'.substring(6))");  
```
输出结果：Everybody

### 6:自定义上下文环境 ###
```
//负责提供气象服务的上下文环境   
FelContext ctx = new AbstractConetxt() {   
    public Object get(Object name) {   
        if("天气".equals(name)){   
            return "晴";   
        }   
        if("温度".equals(name)){   
            return 25;   
        }   
        return null;   
    }   
};   
FelEngine fel = new FelEngineImpl(ctx);   
Object eval = fel.eval("'天气:'+天气+';温度:'+温度");   
System.out.println(eval);  
```
输出结果：天气:晴;温度:25

### 7:多层上下文环境（命名空间） ###
```
FelEngine fel = new FelEngineImpl();   
String costStr = "成本";   
String priceStr="价格";   
FelContext baseCtx = fel.getContext();   
//父级上下文中设置成本和价格   
baseCtx.set(costStr, 50);   
baseCtx.set(priceStr,100);   
   
String exp = priceStr+"-"+costStr;   
Object baseCost = fel.eval(exp);   
System.out.println("期望利润：" + baseCost);   
   
FelContext ctx = new ContextChain(baseCtx, new MapContext());   
//通货膨胀导致成本增加（子级上下文 中设置成本，会覆盖父级上下文中的成本）   
ctx.set(costStr,50+20 );   
Object allCost = fel.eval(exp, ctx);   
System.out.println("实际利润：" + allCost);  
```
输出结果：

期望利润：50

实际利润：30

### 8:编译执行 ###
```
FelEngine fel = new FelEngineImpl();   
FelContext ctx = fel.getContext();   
ctx.set("单价", 5000);   
ctx.set("数量", 12);   
ctx.set("运费", 7500);   
Expression exp = fel.compile("单价*数量+运费",ctx);   
Object result = exp.eval(ctx);   
System.out.println(result);  
```
执行结果：67500

备注：适合处理海量数据，编译执行的速度基本与Java字节码执行速度一样快。

### 9:自定义函数 ###
```
    //定义hello函数   
    Function fun = new CommonFunction() {   
  
        public String getName() {   
            return "hello";   
        }   
           
        /*   
         * 调用hello("xxx")时执行的代码  
         */   
        @Override   
        public Object call(Object[] arguments) {   
            Object msg = null;   
            if(arguments!= null && arguments.length>0){   
                msg = arguments[0];   
            }   
            return ObjectUtils.toString(msg);   
        }   
  
    };   
    FelEngine e = new FelEngineImpl();   
    //添加函数到引擎中。   
    e.addFun(fun);   
    String exp = "hello('fel')";   
    //解释执行   
    Object eval = e.eval(exp);   
    System.out.println("hello "+eval);   
    //编译执行   
    Expression compile = e.compile(exp, null);   
    eval = compile.eval(null);   
    System.out.println("hello "+eval);   
  
```
执行结果：

hello fel

hello fel

### 10:调用静态方法 ###
如果你觉得上面的自定义函数也麻烦，Fel提供的**$**函数可以方便的调用工具类的方法
熟悉jQuery的朋友肯定知道"$"函数的威力。Fel东施效颦，也实现了一个"$"函数,其作用是获取class和创建对象。结合点操作符，可以轻易的调用工具类或对象的方法。
```
  //调用Math.min(1,2)
  FelEngine.instance.eval("$('Math').min(1,2)");
  //调用new Foo().toString();
  FelEngine.instance.eval("$('com.greenpineyu.test.Foo.new').toString());
```
通过"**$('class').method**"形式的语法，就可以调用任何等三方类包（commons lang等）及自定义工具类的方法，也可以创建对象，调用对象的方法。如果有需要，还可以直接注册Java Method到函数管理器中。

### 11 大数值计算（始于0.9版本） ###
Fel发布后，有些网友希望提供大数值计算功能，于是，大数值计算功能就有了。例子如下：
```
  FelEngine fel = FelBuilder.bigNumberEngine();
  String input = "111111111111111111111111111111+22222222222222222222222222222222";
  Object value = fel.eval(input);
  Object compileValue = fel.compile(input, fel.getContext()).eval(fel.getContext());
  System.out.println("大数值计算（解释执行）:" + value);
  System.out.println("大数值计算（编译执行）:" + compileValue);
```
由上例子可以看出，大数值计算引擎和常规计算引擎在使用方法是相同的。如果表达式数值比较大，要求精度高，可使用大数值计算引擎。不足之处是效率没有常规计算引擎高。

## 安全（始于0.8版本） ##
为了防止出现“${'System'}.exit(1)”这样的表达式导致系统崩溃。Fel加入了安全管理器，主要是对方法访问进行控制。安全管理器中通过允许访问的方法列表（白名单）和禁止访问的方法列表（黑名单）来控制方法访问。将**"java.lang.System. `* `"**加入到黑名单，表示System类的所有方法都不能访问。将**"java.lang.Math. `* `"**加入白名单，表示只能访问Math类中的方法。如果你不喜欢这个安全管理器，可以自己开发一个，非常简单，只需要实现一个方法就可以了。
