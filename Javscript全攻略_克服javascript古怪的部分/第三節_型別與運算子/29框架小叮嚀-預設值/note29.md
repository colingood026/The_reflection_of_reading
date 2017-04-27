



在一個專案中引用了兩個 library：lib1.js, lib2.js。

引用的時候不會創造三個執行環境，而是將所有引用的js疊加在一起當作一個超大的script。

```html
<html>
    <head>

    </head>
    <body>
        <script src='lib1.js'></script>
        <script src='lib2.js'></script>
        <script src='app.js'></script>
    </body>
</html>
```

```javascript
// lib1.js
var libraryName = 'lib1';
```

```javascript
// lib2.js
var libraryName = 'lib2';
```

```javascript
// app.js
// 如果有個library有相同的變數名稱，則執行時所呼叫的結果如下
console.log(libararyName); // lib2
```

為了避免重複的變數名稱，可以使用上一節預設值的方法

```javascript
// lib2.js
window.libraryName = window.libraryName || 'lib2';
// 這是在檢查全域命名空間(global namespace)或全域物件(global object)看是否已經有那個名稱了。
// 因為libratyName位於全域環境，所以可以用window.libraryName取得。
```

```javascript
// app.js
console.log(libararyName); // lib1
```