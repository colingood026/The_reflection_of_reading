# 使用finally避免資源洩漏(resource leaks)

使用finally關閉資源的好處：程式碼變得簡潔。

```java
try{
	ServerSocket socket = new ServerSocket();
	....  
}catch{
	...
}finally{
	// close resource
	socket.close();
}
```

JDK7之後增加了**try-with-resources**，以下寫法同上述。

```java
try(ServerSocket socket = new ServerSocket()){
	...  
}catch(){
	...
}
```

[finally 或是 try-with-resource 在close時拋出異常遮蔽了原始的異常該如何處理](http://teddy-chen-tw.blogspot.tw/2013/11/javatrycatchfinally5cleanup-failure.html)