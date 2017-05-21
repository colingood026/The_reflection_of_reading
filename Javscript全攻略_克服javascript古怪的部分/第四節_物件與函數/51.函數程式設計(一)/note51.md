# 函數程式設計(一)

在還沒有一級函數的概念之前，我們會這麼寫：

```javascript
var arr1 = [1,2,3];
console.log(arr1);
var arr2 = [];
for(var i=0; i < arr1.length; i++){
    arr2.push(arr1[i]*2);
}
console.log(arr2);
```

但javascript是一級函數，可以做到不一樣的，可以把函數當作參數傳入另一個函數，組合出不一樣的函數：

```javascript
function mapForEach(arr, fn){
    var newArr = [];
    for(var i=0; i < arr.length; i++){
        newArr.push(fn(arr[i]));
    }   
    return newArr;
}       
var arr1 = [1,2,3,4];
console.log(arr1);
// 1
var arr2 = mapForEach(arr1,function(item){
    return item*2;
});
console.log(arr2);
// 2
var arr3 = mapForEach(arr1,function(item){
    return item > 2;
});
console.log(arr3);  
// 3
var checkPastLimit = function(limiter, item){
    return item > limiter;
}       
var arr4 = mapForEach(arr1, checkPastLimit.bind(this,3))
console.log(arr4);
// 4 跟 //3 不同在於我只需要輸入 limiter就好了
var checkPastLimitSimplified = function(limiter){
    return function(limiter, item){
        return item > limiter;
    }.bind(this,limiter);       
}        
var arr5 = mapForEach(arr1, checkPastLimitSimplified(5))
console.log(arr5);
```

**函數程式設計要注意的：你的函數，尤其是小函數，當你在移動或傳入小函數時，盡量不要改變 data**