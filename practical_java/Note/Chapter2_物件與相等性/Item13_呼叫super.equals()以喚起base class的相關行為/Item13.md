# 呼叫super.equals()以喚起base class的相關行為

當繼承了一個實作equals()的class，實作該子類別的equals()時要注意，要先喚起父類別的equals()來進行比較。

> byte可自動轉型為int。

```java
Golfball{
	public boolean equal(){
		.....
	}
}

MyGolfball extends Golfball{
	public boolean equal(){
		.....
        if(super.equals()){ // 要先喚起父類別的equals()
        	// 接著再比較子類別自己
        }
	}
}
```

MyGolfball是由MyGolfball自己與父類別Golfball所組成的，所以在比較時為求準確，必須確保父類別與子類別的equals()都有執行。如下圖：

<img src='images/item13_001.png'/>

那如果是MyGolfball與Golfball中間又存在另一個class：

```java
Golfball{
	public boolean equal(){
		.....
	}
}
NewGolfball extends Golfball{
	// 沒有實作equals()
}
MyGolfball extends NewGolfball{
	public boolean equal(){
		.....
        if(super.equals()){ // 要先喚起父類別的equals()
        	// 接著再比較子類別自己
        }
	}
}
```

當你為一個子類別撰寫equals()時，你必須檢查除java.lang.Object以外所有繼承的類別，看看他們是否有實作equals()，如果有，那一定要先呼叫super.equals()。