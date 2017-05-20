# 框架小叮嚀-function factories

```javascript
function makeGreeting(language){
    return function(firstName,lastName){
        if(language === 'en'){
            console.log('Hello ' + firstName + ' ' + lastName);    
        }
        if(language === 'es'){
            console.log('Hola ' + firstName + ' ' + lastName);    
        }        
    }
}        
var greetEnglish = makeGreeting('en');
var greetSpanish = makeGreeting('es');        
greetEnglish('John','Doe'); // Hello John Doe    
greetSpanish('John','Doe'); // Hola John Doe
```

下列圖片是執行情的情況：

<img src='images/48_001.jpg' width='500'>

<img src='images/48_002.jpg' width='500'>

<img src='images/48_003.jpg' width='500'>

<img src='images/48_004.jpg' width='500'>

<img src='images/48_005.jpg' width='500'>

<img src='images/48_006.jpg' width='500'>

