# ✏️ servlet-contex, root-contex

xml파일은 ➪ 객체(Bean)



## servlet-contex.xml

> Servlet과 Web에 관련된 객체 정의
>
> controller, HandlerMapping, ViewResolver

* Interceptor 설정

  ```
  	<beans:bean id="myInterceptor"
  		class="com.ssafy.board.controller.LoginInterceptor" />
  
  	<interceptors>
  		<interceptor>
  			<!-- 작성 순서 중요!! -->
  			<mapping path="/board*" />
  			<exclude-mapping path="/board" /> <!-- 제외 시킬 경로!!! -->
  			<beans:ref bean="myInterceptor" />
  		</interceptor>
  	</interceptors>
  ```

  



##  root-contex.xml

> view와 관련되거나 web에 관련되지 않은 객체 정의
>
> service, DAO, Mapper 등 DB

* 위치 설정

``` <context:component-scan/>```  

* 커넥션 풀 객체 

```
<bean id="dddd" class="org.apache.commons.dbcp.BasicDataSource">
		<property name="driverClassName" value="com.mysql.cj.jdbc.Driver"/>
		<property name="url" value="DB주소"/>
		<property name="username" value="DB아이디"/>
		<property name="password" value="DB비밀번"/>
</bean>
```

* MyBatis 설정 객체

  ```
  <bean id="ffff" class="org.mybatis.spring.SqlSessionFactoryBean">
  		<property name="dataSource" ref="dddd"/>
  		<property name="typeAliasesPackage" value="com.ssafy.board.model.dto"/> <!-- mapper.xml에서 짧게 쓸 수 있음 -->
  		<property name="mapperLocations" value="classpath:/**/mapper/*.xml" /> <!-- mapper 라는 폴더밑에있는 xml 파일을 다 읽음! -->
  	</bean>
  	
  
  	<!-- dataSource, mybatis 객체가 전부 담겨있음 -->
  	<!-- Service가 가져가서 dataSource, mybatis 사용한다. -->
  	<bean id="tttt" class="org.mybatis.spring.SqlSessionTemplate">
  		<constructor-arg ref="ffff"></constructor-arg>
  	</bean>
  ```