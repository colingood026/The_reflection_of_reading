# 自動插入分號

```javascript
function greeting(){
    return
    {
        name:'Colin'
    }
}
```

上面那樣寫等於下面這樣，因為語法解析器逐字讀完「return」以後，看到接下來是個斷行(enter)，它會自動判到這邊結束並且幫你加上分號。

```javascript
function greeting(){
    return;
    {
        name:'Colin'
    }
}
```

為了避免這種情形，不要斷行之後再輸入大括號

```javascript
function greeting(){
    return {
        name:'Colin'
    }
}
```