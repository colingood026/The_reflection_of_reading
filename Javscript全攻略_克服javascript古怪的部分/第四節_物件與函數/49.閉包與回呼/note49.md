# 閉包(closure)與回呼(callback)

其實在講到閉包跟回呼的觀念之前，我們已經使用過了。

例如：

```javascript
// setTimeout
function sayHiLater(){
    var greeting = 'Hi';    
    setTimeout(function(){
        console.log(greeting);
    },3000);    
}       
sayHiLater();
// jQuery uses function expressions and first-class functions!
$('button').click(function(){
	...  
});
```

都是將function當作參數傳給另一個函數。

> ### 回呼函數(callback function)
>
> 當某個函數執行完，接著你給它執行的函數，像是上述中 setTimeout函數執行完之後，接著執行我們給他的匿名函數。

```javascript
function tellMeWhenDone(callback){
    var a = 1000;
    var b = 2000;
    callback(); // the 'callback', it runs the function I gave it
}
tellMeWhenDone(function(){
    console.log('I am done');
});
tellMeWhenDone(function(){
    console.log('All done');
});   
```