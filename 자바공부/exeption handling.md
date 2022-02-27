# exeption handling

## 에러와 예외

→ 어떤 원인에 의해 오동작 하거나 비장상적으러 종료되는 경우

- Error
  - 메모리 부족, 스택 오버플로우와 같이 일단 발생하면 복구할 수 없는 상황
  - 프로그람의 비 정상적 종로 말을 수 없음→ 디버깅 필요
- Exeption
  - 읽으려는 파일이 없더나 네트워크 온결이 안되는 등 수습 될 수 일는 비교적 상태가 약한것듯

![스크린샷 2022-02-06 오후 11.18.50.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8a84e8b1-cd9f-438e-9ae6-e388f72295ac/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-02-06_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_11.18.50.png)

## Exeption handlig

예외 발생 시 프로그램의 비 정상 종료를 막고 전상적인 실행 상태를 유지하는 것

### Exeption 객체의 정보 활용

- Throwable의 주요 메서드
  - public String getMessage() : 발생된 예외에 대한 구체적인 메시지 반환
  - public Throwable getCause() : 예외의 원인이 되는 객체 또는 null을 반환
  - public void printStackTrace(): 예외가 발생된 메서드가 호출되기까지의 메서드 호출 스택을 출력, 디버깅의 수단으로 주로 사용

### try ~ catch 문

```jsx
try {
	//예외가 발생할 수 있는 코드
}catch(XXXEception e){
	//예외가 발생했을 때 처리할 코드
}
```

### try ~ caatch ~ finally문

finally는 예외 발생 여부와 상관 없이 언제나 실행

대부분 try블록에서 사용한 리소스를 반납!

```jsx
try {
	//예외가 발생할 수 있는 코드
}catch(XXXEception e){
	//예외가 발생했을 때 처리할 코드
}finally{
}
```

### try ~ catch - resources문

- 선언된 객체들에 대해 자동 close 호출

```jsx
try(리소스 타입1 ;리소스타입2) {
	//예외가 발생할 수 있는 코드
}catch(XXXEception e){
	//예외가 발생했을 때 처리할 코드
}
```

### throws 키워드를 통한 처리

- method에서 처리해야 할 하나 이상의 예외를 호출한 곳으로 전달!
- 예외는 없어지는것이 아니라 그냥 전달 됨!
- 예외를 전달 받은 메서드는 다시 예외처리를 해결 해야함
- 처리하려는 예외의 조상타입으로 throws 처리 가능
- runtime exception은  throws 하지 않아도 전달됨
- 메서드 재정의 시 조상 클래스 메서드가 던지는 예외보다 부모 예외를 던질 수 없다.
  - 부모가 치지 않은 사고를 자식이 칠 수 없다.