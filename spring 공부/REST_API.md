# REST(Representational State Transfer) API



### OPEN API

프로그래밍에서 사용할 수 있는 개방되어 있는 상태의 Interface

OPEN API와 함께 거론되는 기술이 **REST**이며 대부분의 OPEN API는 REST방식 지원





## REST

하나의 URI는 하나의 고유한 리소스를 대표하도로고 설계된다는 개념에 전송방식을 결합해서 원하는 작업을 지정한다.

**URL+ GET/ POST/ PUT/ DELETE**

HTTP URL를 통해 제어할 자원(Resource)를 면시하고 HTTP Method(GET, POST, PUT, DELETE)을 해당 자원을 제어하는 명령을 내리는 방식의 아키텍처

* 기존의 전송방식과는 달리 서버는 요청으로 받은 리소스에 대한 순수한 데이터를 전송
* 기존의 GET/POST 외에 PUT,DELETE 방식을 사용하여 리소스에 대한 CRUD 처리 가능



### REST구성

자원 - URL     /    행위 - HTTP Method     /     표현 

**C**reate - POST   ➪ **POST**

**R**eade - GET  ➪  **GET**

**U**pdate - POST  ➪  **PUT**

**D**ELETE - GET  ➪ **DELETE**

 

