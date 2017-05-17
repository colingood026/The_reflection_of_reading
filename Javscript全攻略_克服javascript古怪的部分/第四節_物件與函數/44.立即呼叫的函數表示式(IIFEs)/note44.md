# 立即呼叫的函數表示式(IIFE)s

#### Immediately Invoked Function Expression (IIFE)s

創造函數的時候就執行該函數

```javascript
// function statement 函數陳述句(一開始就被放到記憶體中，但不會執行)
function greeting(name){
    console.log('Hello ' + name);
}
greeting('Colin');        
// function expression 函數表示式(一開始不會被放到記憶體中，要等執行到這行才會被放到記憶體)
var greeting = function(name){
    console.log('Hello ' + name);
}
greeting('Colin');
// IIFE 立即函數表示式
var greeting = function(name){
    return 'Hello ' + name;
}('Colin'); 
console.log(greeting); // 這時greeting是個字串，而不是函數，不能被呼叫
```

----

```javascript
// 以上兩種code都是有效的，且待在那邊沒做任何事，但無法對它們做任何事
3;
'I am String'; 
// 那如果是函數呢?
function(name){ // 1
    return 'Hello ' + name;
}; // error...
```

因為當語法解析器讀到 // 1的時候，它看到 function，它預期這是個函數陳述句，它想要 function之後有個名稱，不可以是匿名的，但又不想寫成函數表示式。

要怎麼讓語法解析器了解我們不想要讓上述的例子成為函數陳述句呢？要確保 function這個字不是程式碼的第一個字。

> 最簡單有效的方法：把函數放進「( )」；「( )」也是個運算子。

**括號**接受的是表示式，會回傳東西的，而不是陳述句，例如只會有 ( 3 + 2 )，而不會有( if(...) )。

javascript引擎知道在括號內的東西一定是表示式，它假設我們所寫的這個函數是函數表示式，我們正在創造函數物件。

```javascript
// (firstName)放在裡面或外面都可以
var firstName = 'John'
(function(name){
    return 'Hello ' + name;
}(firstName));
// 
var firstName = 'John'
(function(name){
    return 'Hello ' + name;
})(firstName);

```