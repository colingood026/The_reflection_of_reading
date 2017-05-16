# 重載函數(function overload)

在 javascript中沒有像 java, c#, c++那樣的 function overload方式；因為在 javascript，函數就是物件，所以沒有這種處理函數的方式。

不過沒關係，javascript是**一級函數**，還是有幾種變通方式。

以下是其中一種常用的方式：

```javascript
function greeting(firstName, lastName, language){
    // TODO ...
}
function greetingEnglish(firstName, lastName){
    greeting(firstName, lastName, 'en');
}
function greetingSpanish(firstName, lastName){
    greeting(firstName, lastName, 'es');
}
greetingEnglish('John','Doe');
greetingSpanish('Colin','Lee');
```

補充：[一級函數](http://www.ithome.com.tw/node/75500)