# 物件與物件實體語法(object literals syntax)

```javascript
// 以下兩種寫法一樣結果
var person = new Object();
person.firstname = 'Tony';
person.lastname = 'Alice';
//
var person = {}; // 物件實體語法
var person = {
	firstname:'Tony',
	lastname:'Alice'
}
```

「 {} 」在這邊不是運算子，javascript 在解析語法時，看到大括號，且不是當作 if 條件式或迴圈時，它會假設你在創造物件。