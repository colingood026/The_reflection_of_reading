# Reflection與Extend

另一個建立物件的函數，很多資源庫會有extend(這不是javaascript自帶的)的方法，用叫做reflection的東西做到extend，補足原型繼承。

> ### Reflection
>
> 一個物件可以看到自己的東西，然後改變自己的屬性和方法。
>
> 可以藉由這樣使用一個很有用的模式，稱為extend。

```javascript
var persion = {
    firstname:'Default',
    lastname:'Default',
    getFullName:function(){
        return this.firstname + ' ' + this.lastname;
    }
}
var john = {
    firstname:'John',
    lastname:'Doe'
}
// 以下建立物件和設定原型的方式僅供DEMO使用，實務上不建議，會大幅降低效能
// 記得所有物件都有別的物件的參考
john.__proto__ = person; // 現在 john的原型指向person
        
// for in statement
for(var prop in john){
    if(john.hasOwnProperty(prop)){ // 確認這個屬性是否為john獨有的        
        console.log(prop + ':' + john[prop]);
    }
}

var jane = {
    address:'111 Mary St',
    getFormalFullName:function(){
        return this.last + ', ' + this.firstname;
    }
}
var jim = {
    getFirstName:function(){
        return firstname;
    }
}
// 在這邊用 underscore.js舉例
// 這邊 john會結合jane跟jim的屬性跟方法，遇到同名的屬性以後面的物件為主(後壓前)，請參閱 underscore.js的原始碼
_.extend(john, jane, jim);
```

> 注意，下一版有javascript有個東西叫「extends」，有加「s」，會用來設定原型。