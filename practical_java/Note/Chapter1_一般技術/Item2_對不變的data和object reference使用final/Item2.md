<h1>對不變的data和object reference使用final</h1>

final是immutable的。

```java
static final int x = 10;
```

使用final宣告，任何試圖修改 ***x*** 的code將無法通過編譯。<br/>

關鍵字final可防止class內的個體資料(instance data)遭到修改。<br/>

但常數物件又如何？

```java
static final Circle wheel = new Circle(5,0);
選項：
a:wheel.setRadius(4,2);
b:wheel = new new Circle(7,4);
```

a會通過編譯，並且 ***wheel*** 裡面的值會改變；但是b會拋出錯誤。<br/>

雖然已經宣告 ***wheel*** 為final，但是在a並沒有改變 ***wheel*** 的值，而是改變 ***wheel*** 所指物件的值，***wheel*** 沒有變化仍然指向同一個物件。<br/>

變數 ***wheel*** 是一個object reference，它指向物件所在的heap位置(參考實踐8)。<br/>

相反在b企圖改變 ***wheel*** 的值，也就是企圖另 ***wheel*** 指向另一個物件。 ***wheel*** 是final，必須永遠指向同一個物件。<br/>

然而 ***wheel*** 所指物件並不受final影響，因此是mutable的。<br/>

結論：
1.final只能防止變數值的改變。<br/>

2.如果被宣告為final是個object reference，那麼該reference不能被改變，必須永遠指向同一個物件；然而被指向的物件可以被隨意改變。<br/>

immutable物件參考實踐63,65