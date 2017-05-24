# 函數建構子，new與javascript的歷史

建立物件的幾種方法：

1. 物件實體語法(object literal syntax)：var person = {};
2. 像 java用 new的：var john = new Person();

### 「new」關鍵字

```javascript
function Person(){ // 0    
    console.log(this); // Person {}
    this.firstname = 'John';
    this.lastname = 'Doe';
    console.log('function invoked');
}
var john = new Person(); // 1
console.log(john); // Person { firstname:'John', lastname:'Doe'}
```

// 0：函數建構子

// 1：「new」運算子建立了一個新物件，然後將this指向它，然後呼叫了 function Person。

當函數被呼叫時，執行環境會產生this給我們，而在 // 1的時候「new」改變了this指向的東西(**window -> Person {}**)，現在this指向了新的空物件(**Person {}**)。

用「new」運算子不會回傳值，而是回傳被new運算子建立的物件。

**但是**...如果new所呼叫的函數有回傳東西的話：

```javascript
function Person(){    
    this.firstname = 'John';
    this.lastname = 'Doe';
    return function(){
        console.log('sdfd');
    }    
}
var john = new Person();
console.log(john); // function(){ console.log('sdfd');}
```

> 「new」：
>
> 1. 建立一個新的空物件，將this指向該物件。
> 2. 如果後面緊接著呼叫的函數沒有回傳值，則會回傳剛剛建立的新物件。

---

### 函數建構子

> 一個普通的函數，用來建立物件，當你在呼叫函數前面放了 new關鍵字，在執行環境的創造階段被產生的 this變數會指向新的空物件，當函數結束執行時，該物件會被函數自動回傳，總結函數建構子就是用來建立物件的。

```javascript
function Person(firstname, lastname){    
    this.firstname = firstname;
    this.lastname = lastname;
}
var john = new Person('John','Doe');
console.log(john);
var jane = new Person('Jane','Doe');
console.log(jane);
```



