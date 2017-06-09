# 混和配置

自動裝配時，spring並不在意要裝配的Bean來自哪裡，也就是說自動裝配的時候是取得spring容器中所有的Bean。

### 在JavaConfig中引用XML配置

```java
@Configuration
public class CdConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
```

使用@Import註解將兩個config類組合在一起

```java
@Configuration
@Import(CdConfig.class)
public class CdPlayerConfig {

    @Bean
    public CdPlayer cdPlayer(List<String> books){
        return new CdPlayer(books);
    }
}
```

或者乾脆不在CdPlayerConfig中使用@Import，而是宣告另一個類去將他們組合在一起

```java
@Configuration
@Import({CdConfig.class, CdPlayerConfig.class})
public class SoundSystemConfig {
    
}
```

現在有個list宣告在XML，該如何同時加載XML與其他JavaConfig類呢？

```xml
<util:list id="books">
    <value>1St Book</value>
    <value>2St Book</value>
</util:list>
```

使用@ImportResource註解

```java
@Configuration
@Import({CdConfig.class, CdPlayerConfig.class})
@ImportResource("classpath:applicationContext-basic.xml")
public class SoundSystemConfig {

}
```

### 在XML中引用JavaConfig

在XM中可以使用\<import\>元素來引用其他XML，但是沒有XML元素可以引用其他JavaConfig類。

所以必須使用\<bean\>元素將JavaConfig類導入到XML配置中。

```xml
<bean class="org.soundSystem.CdConfig"/>
```