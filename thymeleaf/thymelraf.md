# Thymeleaf

相比其他模板引擎，Thymeleaf的特點：

1. 只專注於XML。
2. 基於XML標籤和屬性。
3. 本身是格式良好的HTML文件，可以直接被瀏覽器打開並正確顯示，不需要啟動整個WEB應用。

也就是說之前在JSP修改了一行css，必須要啟動SERVER才能看到效果，但是在Thymeleaf中可以直接用瀏覽器查看修改後的效果。

如果是希望為專案引用一款模板引擎，Thymeleaf是不二選擇；但如果還需要處理其他類型的模板，那Thymeleaf就不適合了。





<a href='http://www.thymeleaf.org/doc/articles/layouts.html'>參考來源1</a> -> 裡面的第四章節：「Thymeleaf Tiles Integration」

<a href='http://spring.io/blog/2012/10/30/spring-mvc-from-jsp-and-tiles-to-thymeleaf/'>參考來源2</a>

#### 以下為參考來源2的寫法

缺點：仍然需要在每個頁面include

註冊在spring-mvc-servlet.xml

```xml
<bean id="templateResolver" class="org.thymeleaf.templateresolver.ServletContextTemplateResolver">
	<property name="prefix" value="/WEB-INF/view/" />
	<property name="suffix" value=".html" />
	<property name="templateMode" value="HTML5" />
	<property name="cacheable" value="false" />
</bean>
<bean id="templateEngine" class="org.thymeleaf.spring3.SpringTemplateEngine">
	<property name="templateResolver" ref="templateResolver" />
</bean>
<bean class="org.thymeleaf.spring3.view.ThymeleafViewResolver">
	<property name="templateEngine" ref="templateEngine" />
	<property name="order" value="1" />
	<property name="viewNames" value="thymeleaf/*" />
</bean>
```

定義一個 layout.html(框架頁)

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
	<head th:fragment="headerFragment">
		..........
	</head>
	<body>
		<div class="container" style="padding-top: 50px;">
			<div th:fragment="menuFragment">
				.......
			</div>
		</div>		
	</body>
</html>
```

真正的內容頁 realContent.html

```html
<html xmlns:th="http://www.thymeleaf.org">
	<head th:include="thymeleaf/layout :: headerFragment">
	<!-- replaced with fragment content -->
	<!-- 'thymeleaf/layout' refers to /thymeleaf/layout.html on the filesystem -->
	</head>
	<body>
		<div th:include="thymeleaf/layout :: menuFragment"></div>
		<!-- TODO real content -->
	</body>
</html>

因為在spring-mvc-servlet.xml裡面的prefix跟suffix
<head th:include="thymeleaf/layout :: headerFragment">
th:include會變成上述layout.html -> thymeleaf/layout.html 裡面的 <head th:fragment="headerFragment">
<div th:include="thymeleaf/layout :: menuFragment">
th:include變成上述layout.html -> thymeleaf/layout.html 裡面的 <head th:fragment="menuFragment">
```

