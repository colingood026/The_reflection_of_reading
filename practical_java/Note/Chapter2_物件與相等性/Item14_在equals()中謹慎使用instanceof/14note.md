# 在equals()中謹慎使用instanceof

getClass() -> 只有隸屬同一個class的物件才有機會視為相等。

那如果想要子類別與其父類別也可被視為相等，該如何做？

「父類別物件與其子類別物件」之間的比較，有其複雜度。

> 如果一個子類別實做了equals()，當其物件與父類別物件進行比較時，不得回傳true。

實作equals()時使用instanceof與getClass()的差別。

getClass()：

- 「絕對是」的語意。
- 父類與子類永遠無法視為相等。

instanceof：

- 「是一種」的語意，而非「絕對是」的語意。
- 父類.equals(子類) -> 有機會相等；子類.equals(父類) -> 不可能相等。

------

在子類別的equals()採用「instanceof作法」的情形

1. 父類別實作了equals()，而子類別沒有

   ​

2. 父類別與子類別都實作了equals()

3. 父類別沒有equals()，而子類別實作了equals()

------

補充：

<a href='http://docs.oracle.com/javase/6/docs/api/java/lang/Object.html#equals%28java.lang.Object%29'>實作equals()時要遵守的約定(同一類別的情況，而不是父類與子類)</a>

1. 反身性（Reflexive）：x.equals(x)的結果要是true。
2. 對稱性（Symmetric）：x.equals(y)與y.equals(x)的結果必須相同。
3. 傳遞性（Transitive）：x.equals(y)、y.equals(z)的結果都是true，則x.equals(z)的結果也必須是true。
4. 一致性（Consistent）：同一個執行期間，對x.equals(y)的多次呼叫，結果必須相同。
5. 對任何非null的x，x.equals(null)必須傳回false。