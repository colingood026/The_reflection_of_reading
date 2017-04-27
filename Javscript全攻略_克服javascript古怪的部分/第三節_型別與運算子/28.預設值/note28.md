# 預設值(Default Value)

```javascript
function greet(name){
	console.log('Hello ' + name);
}
greet(); // Hello undefined
```

javascript不在乎參數是否真的有值，所以呼叫函數時不傳入參數也是可以的。

當函數被呼叫時，一個新的執行環境被創造，然後這個變數是在函數內被創造，雖然傳入的值是在呼叫時才知道，但這個變數在記憶體已經被設定為undefined。

給予預設值的幾種方式之一：

```javascript
function greet(name){
	name = name || '<Your name here>';
	console.log('Hello ' + name);
}
greet(); // Hello <Your name here>
greet('Colin'); // Hello Colin
// 但是使用這種特性還是要注意 0 的問題
greet(0); // Hello <Your name here>
```

「 || 」運算子不只會回傳 true 或 false

```javascript
undefined || 'hello'
=> 'hello' // Boolean('hello') => true 會回傳可以被強制轉型成 true 原本的值
'hi' || 'hello' => 'hi'
0 || 1 => 1
```