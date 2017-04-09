# Thymeleaf

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

