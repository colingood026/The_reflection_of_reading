# 顯式：Java Config配置

### 創建配置類

```java
@Configuration
public class CdPlayerConfig {
}
```

### 聲明一個Bean

在配置類裡面增加

預設情況下，bean的ID與帶有Bean註解的方法名稱是一樣的，在這裡是sgtPeppers。

```java
@Bean
public CompactDisc sgtPeppers(){
	return new SgtPeppers();
}
```

也可以重新指定名字

```java
@Bean(name="lonelyHome")
public CompactDisc sgtPeppers(){
	return new SgtPeppers();
}
```

### 借助JavaConfig實現注入

上述所聲明的sgtPeppers是沒有依賴其他的東西，那如果有依賴的話呢?

(通過調用方法引用Bean)以下是個簡單的方法：

因為sgtPeppers()方法上添加了Bean註解，Spring將會攔截所有對它的調用，並確保直接回傳該方法所創建的Bean，而不是每次都創建一個新的實例。

```java
@Bean
public MediaPlayer cdPlayer(){
	return new CdPlayer(sgtPeppers());
}
```

(通過調用方法引用Bean)聲明多個：

```java
@Bean
public MediaPlayer cdPlayer(){
	return new CdPlayer(sgtPeppers());
}
@Bean
public MediaPlayer anotherCdPlayer(){
	return new CdPlayer(sgtPeppers());
}
```

預設情況下，Spring所創建的Bean都是單例的，所以上述兩次調用時都是取得同一個SgtPeppers。

(傳入參數調用Bean)也可以這樣寫：

```java
@Bean
public MediaPlayer cdplayer(CompactDisc disc){
	return new CdPlayer(disc);
}
```

通過調用方法引用Bean：有調用到的Bean必須寫在同一個JavaConfig裡面。

??傳入參數調用Bean：調用的Bean不用寫在同一個JavaConfig裡面，也可以寫在XML配置。