# ✏️ Vue.js

<script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>



### 특징

> Approachable(접근성)
>
> Versatile(유연성)
>
> Peformant(고성능)



## MVVM Pattern

> Model  + View(html) + ViewModel(Vue)
>
> Model : 순수 자바스크립트 객체
>
> View : 웹페이지의 DOM
>
> ViewModel : Vue의 역활

기존에는 자바스크립트로 view에 해당하는 DOM에 접근하거나 수정하기 위해 jQuery와 같은 library 이용

Vue는 View와 Model을 연결하고 자동으로 바인딩하므로 양방향 통신을 가능하게 함



## Vue Instance

| 생성     |                      Vue Instance 생성                       |
| -------- | :----------------------------------------------------------: |
| el       |            HTML의 엘리먼트 아이디나 클래스를 지정            |
| data     |      Vue에서 사용되는 정보저장 . 객체  또는 함수의 형태      |
| template | 화면에 표시할 HTML,CSS등의 마크업 요소를 정의하는 속성. 뷰의 데이터 및 기타 속성들도 함께 화면에 그릴 수 있다. |
| method   | 화면 로직 제어와 관계된 method를 정의하는 속성. 마우스 클릭 이벤트 처리와 같이 화면의 전반적인 이벤트와 화면 동작과 관련된 로직 추가 |
| created  |         뷰 인스턴스가 생성되자 마자 실행할 로직 정의         |



### Vue Instance Life Cycle

| life cycle 속성 | 설명                                                      |
| --------------- | --------------------------------------------------------- |
| beforeCreate    | Vue Instance가 생성되고 각 정보의 설정 전에 호출!         |
| created         | Vue Instance가 생성된 후 데이터들의 설정이 완료된 후 호출 |
|                 |                                                           |
|                 |                                                           |
|                 |                                                           |
|                 |                                                           |
|                 |                                                           |
|                 |                                                           |



## 디렉티브

v-접두사가 있는 특수 속성

디렉티브 속성 값은 단일 JavaScript 표현식이 된다.

디렉티브의 역활은 표현식의 값이 변경될 때 사이드 이펙트를 반응적으로 DOM에 적용



{{}} ➪ 태그는 선택 

애들은 태그 필수 

v-text 

v-html 

➪model 데이터를 html화면에 출력

 



## HTTP 통신: axios

Vue에서 권고하는 HTTP통신 라이브러리

promise 기반의 HTTP 통신 라이브러리이며 상대적으로 다른 HTTP통신 라이브러리들에 비해 문서화가 잘되고 API가 다양





## Vue-router

​	라우팅 : 웹 페이지 간의 이동 방법

​	vue.js의 공식 라우터



```javascript
 <div id="app">
      <h1>SSAFY - Router</h1>
      <p>
        <router-link to="/">HOME</router-link>
        <router-link to="/board">게시판</router-link>
        <router-link to="/qna">QnA</router-link>
        <router-link to="/gallery">갤러리</router-link>
      </p>

      <!-- 현재 라우트에 맞는 컴포넌트가 렌더링 -->
      <router-view></router-view>
    </div>
    <script>
      // 라우트 컴포넌트
      const Main = {
        template: "<div>메인 페이지</div>",
      };
      const Board = {
        template: "<div>자유 게시판</div>",
      };
      const QnA = {
        template: "<div>질문 게시판</div>",
      };
      const Gallery = {
        template: "<div>갤러리 게시판</div>",
      };

      // 라우터 객체 생성
      const router = new VueRouter({
        routes: [
          {
            path: "/",
            component: Main,
          },
          {
            path: ".board",
            component: Board,
          },
          {
            path: "/qna",
            component: QnA,
          },
          {
            path: "gallery",
            component: Gallery,
          },
        ],
      });

      // Vue 인스턴트 라우터 주입
      const app = new Vue({
        el: "#app",
        router,
      });
    </script>
  
```

