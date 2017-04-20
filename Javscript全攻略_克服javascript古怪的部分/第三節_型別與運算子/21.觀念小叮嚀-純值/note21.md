# 運算子(operators)

a special function that is syntactically(written) differently

一個特別的運算子，但它和其他你自己寫的函數不同，一般來說，運算子需要兩個參數來回傳一個結果。

範例：

```javascript
var a = 3 + 4;
// 這是個加法運算子，它是一個函數，只不過函數名字不叫add，而是直接用+號
function +(a, b){
	return; // add the two numbers
}
// 平常呼叫的方式
+(3, 4); 
// 但是和平常呼叫函數不同，javascript以及其他程式語言呼叫的方式
3 + 4; // 中輟表示法，將函數名稱寫在兩個參數中間，javascript所使用的方式
+3 4;  // 前綴表示法
3 4+;  // 後綴表示法
// 本質上就是一個具有兩個參數的函數，而這個函數會回傳一個值
```



concept：觀念