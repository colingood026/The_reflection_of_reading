# Dependency Injection

實現IOC的兩種方式：

1. Dependency Injection
2. Service Locator

Spring採用的是依賴注入(Dependency Injection)，依賴注入的意義是：「保留抽象介面，讓組件依賴於抽象介面，當組件要與其它實際的物件發生依賴關係時，藉過抽象介面來注入依賴的實際物件。」 

### Type 1 IoC(Interface injection)

使用Type 1 IoC時會要求實作介面，這個介面是為容器所用的，容器知道介面上所規定的方法，它可以呼叫實作介面的物件來完成依賴關係的注入。

Type 1 IoC具有強的侵入性，使用它來實現依賴注入會使得組件相依於容器（框架），降低組件的重用性。

[spring沒有實作 interface injection](http://stackoverflow.com/questions/10248000/spring-interface-injection-example)

### Type 2 IoC(Setter injection)

[type2實作](spring_practice001/src/main/java/org/colin/withSpring/IOC_type2)

spring鼓勵使用這個

Setter可以有明確的名稱可以瞭解注入的物件會是什麼，會比記憶Constructor上某個參數位置代表某個物件來得好。 

由於setter方法是公開的，所以如果您想要讓一些資料成員或資源變為唯讀或是私有，使用Constructor injection會是個簡單的選擇。 

### Type 3 IoC(Constructor injection)

[type3實作](spring_practice001/src/main/java/org/colin/withSpring/IOC_type3)

使用 Constructor的好處之一是，您可以在建構物件的同時一併完成依賴關係的建立，

然而如果要建立的物件關係很多，則會在建構式上留下一長串的參數。