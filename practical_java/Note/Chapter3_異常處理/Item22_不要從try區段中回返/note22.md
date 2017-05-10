# 不要在try區段中回返

```java
try{
	...  
}finally{
	...
}
```

只要try之後有接著finally，則finally區塊一定會被執行。

```java
class FinallyTest{
	public static void main(String[] args){
    	System.out.println(method1()); // 2
    	System.out.println(method2()); // 4
	}
	public static int method1(){
    	try{
        	return 2;  
    	}catch(Exception e){
        	return 3;  
    	} 
	}  
	public static int method2(){
    	try{
        	return 3;  
    	}finally{
        	return 4;  
    	}
	}
}
```

上面的例子中，method2雖然在try裡面return 2，但是finally接著執行改成回傳4。

所以，請不要在try區塊內使用break, return, continue。