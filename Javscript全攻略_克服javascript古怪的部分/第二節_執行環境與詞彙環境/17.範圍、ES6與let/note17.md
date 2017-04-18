# 範圍、ES6與let

- 範圍

執行環境 + 變數環境 + 詞彙環境 = 範圍，特別是範圍鏈

範圍是變數可以被取用的區域。

有時如果有兩個相同變數，或一個新的複製品，例如呼叫相同函數兩次，它會各有一個自己的執行環境，而如果有兩個看起來相同的變數，在記憶體中它們其實是兩個不同的變數。

- let

```javascript
if(a > b){
	let c = true;  
}
```

like var，let 讓javascript使用一種東西叫做區塊範圍(block scoping)，會被創造在執行階段，變數仍會被放入記憶體中，設值為undefined，但尚未執行到 let c = true;這一行時，javascript不會讓我們使用。