# Inversion of Control

What is IOC(Inversion of Control)?

IoC 的抽象概念是「依賴關係的轉移」

先從 Dependency Inversion 開始瞭解，也就是依賴關係的反轉。

Dependency Inversion 的意思即是程式不依賴於實作，而是程式與實作都要依賴於抽象。

[改寫前](spring_practice001/src/main/java/org/colin/withoutSpring/withoutInterface)

如果A(PC)依賴於B(HDD)，則是說B擁有A的控制權，A對B產生了依賴關係；想要轉移這種關係，所以依賴關係的反轉就是控制關係的反轉，藉由控制關係的反轉，可獲得元件(PC)的重用性。

[改寫後](spring_practice001/src/main/java/org/colin/withoutSpring/withInterface)

改寫之後整個控制權從實際的HDD轉移到抽象的DISK介面，使得PC、HDD、SSD依賴於抽象的DISK介面。



