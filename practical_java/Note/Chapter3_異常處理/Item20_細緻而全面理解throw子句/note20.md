# 細緻而全面理解throw子句

```java
class Exception1 extends Exception
class Exception2 extends Exception1
class Exception3 extends Exception2  
```



```java
public void foo(int i) throws Exception1 {
	if(i == 1){
    	throw new Exception1();
	}else if(i == 2){
    	throw new Exception2();
	}else{
		throw new Exception3();
	}
}
```

雖然Exception2, Exception3都衍生自 Exception1，可以通過編譯，但使用者只知道它會拋出 Exception1，更清楚的寫法如下：

```java
foo(int i) throws Exception1, Exception2, Exception3
```

-----------------------------

覆寫時是否可以覆寫superclass方法所拋出的異常?

```java
public class Base {
	public void foo(int i) throws FileNotFoundException {
    	throw new FileNotFoundException();
	}
}
public class Derived extends Base{
	public void foo(int i) throws IOException {
		throw new IOException();
	}
}
```

Error:(11, 17) java: foo(int) in org.colin.Chapter3.Item20.Derived cannot override foo(int) in org.colin.Chapter3.Item20.Base 

overridden method does not throw java.io.IOException

看來是不行。

解決方式：

1. 不拋出異常
2. 也拋出相同的異常
3. 拋出FileNotFoundException的衍生異常

如果覆寫時新增加的code拋出異常，必須就地處理。