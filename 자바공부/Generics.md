# Generics

- 다양한 타입의 객체를 다루는 메서드, 컬렉션 클래스에서 컴파일 시에 타입 체크
- 미리 사용할 타입을 명시해서 형 변환을 하지 않아도 되게 함

◾ 표현

- 클래스 또는 인터페이스 선언 시 <>에 타입 파라미터 표시
  - class_Name → Raw Type
  - class_Name<T> → Generics Type
- 특별한 의미의 알파벳 보다는 단순히 임의의 참조형 타입을 말함
  - T : reference Type
  - E : element Type
  - K : key
  - V : value
- 객체 생성 : 변수 쪽과 생성 쪽의 타입은 반드시 같아야 한다.

| Generic type<?>            | 타입에 제한이 없음                      |
| -------------------------- | --------------------------------------- |
| Generic type<? extends  T> | T 또는 T를 상속 받은 타입들만 사용 가능 |
| Generic type<? super T>    | T 또는 T의 조상 타입만 사용 가능        |