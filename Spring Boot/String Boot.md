# ✏️ String Boot

> Project에 따라 자주 사용되는 library들이 미리 조합되어 있다.
>
> 복잡한 설정을 자동으로 처리
>
> 내장 서버를 포함해서 tomcat과 같은 was를 추가로 설치 하지 않아도 개발 가능
>
> was에 배포하지 않고도 실행 할 수 있는 JAR파일로 Web Application을 개발 할 수 있다.



Swagger

프로젝트 개발 시 일반적으로 FrontEnd 개발자와 분리

간단한 설정으로 프로젝트의 API 목록을 웹에서 확인 및 테스트 할 수 있게 해주는 library

swagger를 사용하면 controller에 정의되어 있는 모든 URL을 바로 확인 할 수 있다.

API목록 뿐만 아니라 테스트도 가능!

스웨거

```
<!-- Swagger Setting -->
		<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger2 -->
		<dependency>
		    <groupId>io.springfox</groupId>
		    <artifactId>springfox-swagger2</artifactId>
		    <version>2.9.2</version>
		</dependency>		
		<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
		<dependency>
		    <groupId>io.springfox</groupId>
		    <artifactId>springfox-swagger-ui</artifactId>
		    <version>2.9.2</version>
		</dependency>
```





