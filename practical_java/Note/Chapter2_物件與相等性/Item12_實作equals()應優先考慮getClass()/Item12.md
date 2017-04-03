# 實作equals()應優先考慮getClass()

總結：

getClass()可確保只有相同class產生的物件才有機會視為相等。

應當查看參與比較的物件是否為同一個物件。

equals()不必對每一個屬性進行比較，只有那些攸關「相等性」的屬性才需要比較。

補充：<a href='https://openhome.cc/Gossip/JavaScript/TypeConversion.html'>強型別vs弱型別</a>