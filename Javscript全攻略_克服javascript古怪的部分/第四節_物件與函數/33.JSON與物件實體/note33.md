# JSON與物件實體(object literal)

### JSON != javascript object

> 相異點：JSON裡面的屬性名稱「一定」要被引號所包住。較嚴格。
>
> JSON字串只是受到 javascript object 所啟發的網路傳輸格式。

技術上來說，JSON是物件實體語法的子集合。

代表只要在JSON中是有效的，在物件實體語法就是有效的；反之則不然。

javascript 內建 JSON 轉換的語法。

```javascript
var objectLiteral = {
    firstname:'Mary',
    isAprogrammer:true
}
console.log(JSON.stringify(objectLiteral));
//
var jsonValue = JSON.parse('{ "firstname":"Mary", "isAprogrammer":true }')
console.log(jsonValue);
```