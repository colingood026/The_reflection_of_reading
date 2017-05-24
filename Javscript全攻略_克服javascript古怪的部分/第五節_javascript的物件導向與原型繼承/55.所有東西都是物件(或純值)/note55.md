# 所有東西都是物件(或純值)

在javascript，除了純值和基本物件(base object)以外都有原型。

```javascript
var a = {};
var b = function(){};
var c = [];
console.log(a.__proto__); // Object{}   所有物件的原型
console.log(b.__proto__); // function() 所有函數的原型
console.log(c.__proto__); // Array[]    所有陣列的原型
// 那原型的原型?
console.log(a.__proto__.__proto__); // Object{}
console.log(b.__proto__.__proto__); // Object{}
console.log(c.__proto__.__proto__); // Object{}
```