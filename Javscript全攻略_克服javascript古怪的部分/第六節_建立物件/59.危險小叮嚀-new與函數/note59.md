# 危險小叮嚀-「new」與函數

```javascript
function Person(firstname, lastname){
    this.firstname = firstname;
    this.lastname = lastname;    
}
//
Person.prototype.getFullName = function(){
    return this.firstname + ' ' + this.lastname
}                
var john = new Person('John','Doe');
var jane = new Person('Jane','Doe');
console.log(jane.getFullName());
var colin = Person('Colin','Doe'); // 1
console.log(colin.getFullName()); // 2
```

雖然 function Person()對我們來說是個函數建構子，但對javascript來說仍然是個函數，也就是說可以像 // 1一樣不使用new去呼叫，這會導致// 2錯誤。

所以在寫作習慣上，如果是個函數建構子，則**函數名字第一個字母大寫**能幫我們辨識誰是函數建構子。

javascript已經有其他建立物件的方式，new只是其中一種。