# 觀念小叮嚀-內建的函數建構子

```javascript
var a = new String('3');
var b = new Number(5);
```

以上就是內建的函數建構子，但要注意，a跟b看起來像純值，但他們**不是純值(primitive value)，而是物件**，裡面包含了純值。

學過原型屬性之後，我們可以加些方法道內建的物件上

```javascript
String.prototype.isLengthBiggerThan = function(limit){
    return this.length > limit;
}
'abc'.isLengthBiggerThan(2); // 1 true
Number.prototype.isPositive = function(){
    return this > 0;
}
var a = new Number(3);
a.isPositive(); // 2 true
5.isPositive(); // 3 error....
```

若純值是字串，javascript會自動幫我們轉換成物件，所以在 // 1可以取用到 isLengthBiggerThan()；但若純值是數字，javascript並不會自動幫我們轉換成物件。

----

#### 一般來說不應該用內建的函數建構子在純值上。

```javascript
var a = 3;
var b = new Number(3);
console.log(a == b); // 1 true
console.log(a === b); // 2 false
var c = Number('3'); // 3
```

// 1比較的時候javascript會自動幫我們轉型。

// 2比較的時候javascript則不會幫我們自動轉型，而是用原本的型別下去比較。

// 3的時候不是在建立物件，而是將字串轉成數值。