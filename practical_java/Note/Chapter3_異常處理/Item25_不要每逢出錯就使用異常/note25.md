# 不要每逢出錯就使用異常

- 傳統錯誤處理機制：使用回傳碼。

```java
int data;
InputStream in = new InputStream("xxx.txt");
data = in.getData();
while(data != 0){
    ......
	
    data = in.getData();
}
```

- 使用異常處理。

```java
int data;
InputStream in = new InputStream("xxx.txt");
data = in.getData();
try{
    while(true){
        ......	
        data = in.getData();
    }
}catch(NoMoreDataException e){}
```

作者建議：請在「出乎程式可預料」的行為時，才使用異常處理錯誤。不要針對所有情形使用異常，應將異常用於符合其意義的地方，也就是「非尋常情況」的地方。

上述的例子中，使用回傳碼處理錯誤的方式顯得較直觀。

「傳統錯誤處理機制」與「使用異常處理」這兩者相輔相成。

