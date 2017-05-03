# 框架小叮嚀-偽裝命名空間(faking namespaces)

> 命名空間：
>
> 變數、物件和函數的容器，只是個包裝物、容器。通常是用來維持變數、物件和函數的名稱分開。

但是 javascript 沒有命名空間，可以用物件做到。

```javascript
// 變數名稱一樣，彼此會覆寫
var greet = 'hello';
var greet = 'hola';
console.log(greet); // hola
```

```javascript
var english = {};
var spanish = {};
english.greet = 'hello';
spanish.greet = 'hola';
// 這樣寫會出錯，因為「.」是個運算子，左相依性
english.greetings.greet = 'hello'; 
undefined.greet // error
// 必須先這樣寫
english.greetings = {};
english.greetings.greet = 'hello'; // OK
```