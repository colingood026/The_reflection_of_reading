# 存在(existence)與布林(booleans)

> 利用強制轉型的機制，去確認變數是否有值。

```javascript
Boolean(undefined) // false
Boolean(null) // false
Boolean('') // false
Boolean(0) // false
```

```javascript
var a;
// 在 if 陳述句裡面的東西，javascript會嘗試強制轉型程boolean
// 可以利用這個特性去確認變數是否有值。
if(a){
	...
}
```

```javascript
// 但是有個危險的地方，如果a為0的話，也會被判定為false，解法如下
var a;
a = 0;
if(a || a === 0){
	console.log('Something here'); // will be printed
}
// 根據運算子的優先性 「 === 」會比「 || 」還要早運算
if( a || true){...} // 此時a會被強制轉型成布林
if( false || true){...}
if(true){...}
// 但也不用這麼麻煩，如果a的值不太可能會是0的話，這樣寫就好了
if(a){
	...
}

```

