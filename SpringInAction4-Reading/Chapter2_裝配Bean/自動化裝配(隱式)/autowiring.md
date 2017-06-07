## <a name='autowire'>隱式：自動裝配</a>

使用兩種方式實現自動化裝配：

> component scanning
>
> autowiring

### 建立可被發現的Bean：

```java
package org.soundSystem;

public interface CompactDisc {
    void play();
}
```

@Component註解表明該類為組件類，並告訴spring要為這個類創建一個Bean。

```javascript
package org.soundSystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

    private String title = "Lonely home";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("playing "+title+" by "+artist);
    }
}
```

組件掃描預設是不啟用的，還需要一些設定命令spring去尋找帶有@Component註解的類，下面的寫法是最簡潔的配置。

@Configuration註解啟用了組件掃描。

如果沒有其他設定的話，@Configuration預設會掃描與配置類(CdPlayerConfig)相同的package。

```java
package org.soundSystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CdPlayerConfig {
}
```

如果喜歡使用xml配置去啟動組件掃描的話，下列寫法有一樣的效果

```xml
<context:component-scan base-package="org.soundSystem" />
```

測試：

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CdPlayerConfig.class})
public class SpringTest {
    @Autowired
    private CompactDisc cd;
    @Test
    public void test() {
        System.out.println(cd == null ? true : false);
    }
}
```

### 為組件掃描的Bean命名

若沒有特別命名，spring會自動給予Bean一個ID，以上述的例子來說，就是class名稱第一個字母小寫 - sgtPeppers。

```java
@Component
public class SgtPeppers implements CompactDisc{
	...   
}
```

使用@Component註解加入自訂ID：

```java
@Component("lonelyHome")
public class SgtPeppers implements CompactDisc{
	...   
}
```

使用@Named註解加入自訂ID：

```java
@Named("lonelyHome")
public class SgtPeppers implements CompactDisc{
	...   
}
```

### 設置組件掃描的基礎包

若想要將配置類與組件類分開存放，那就得指定掃描的package。

```java
@Configuration
@ComponentScan("org.soundSystem")
public class CdPlayerConfig {
}
```

```java
@Configuration
@ComponentScan(basePackages = "org.soundSystem")
public class CdPlayerConfig {
}
```

可以接受多個package

```java
@Configuration
@ComponentScan(basePackages = {"org.soundSystem", "org.pc"})
public class CdPlayerConfig {
}
```

以上指定基礎包的方式是用String類型表示的，但這種方法式類型不安全的，一旦重構代碼之後所指定的基礎包可能就會出錯了。

所以也可以指定配置的class

```java
@Configuration
@ComponentScan(basePackageClasses = { CdPlayerConfig.class })
public class CdPlayerConfig {
}
```