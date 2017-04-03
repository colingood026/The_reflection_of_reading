# 實踐equals()時需深思熟慮

1.class何時需要提供equals()

- 「class object相等與否」 > 「object reference之間的單純比較」
- 占用不同記憶體的兩個物件有可能被視為邏輯上的相等，那麼這個class就該提供equals()。

2.

- 要讓哪些class的物件進行比較？
- 只打算讓相同class的物件之間進行比較嗎？
- 是否允許衍伸類別與其基礎類別進行比較？