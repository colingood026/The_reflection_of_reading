# 危險小叮嚀-陣列與for-in

因為在javascript中，陣列就是物件，所以可以用reflection的方式遍歷裡面所有的成員。

```javascript
var arr = ['John','Jane','Jim'];
for(var prop in arr){
    console.log(prop + ':' + arr[prop]);
}
```

但用 for-in遍歷陣列會有問題，會遍歷到它的原型屬性，如下會印出prototype的myCustomFeature：

```javascript
Array.prototype.myCustomFeature = 'cool';
var arr = ['John','Jane','Jim'];
for(var prop in arr){
    console.log(prop + ':' + arr[prop]);
}
```

所以遍歷陣列不建議用 for-in