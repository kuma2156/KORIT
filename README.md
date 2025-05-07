
# 📘 코리아IT Java 수업

코리아IT Java 수업에 대한 내용정리를 하였습니다.

<div align="left">
    <h1>💻 학습자</h1>
    <table>
        <tr>
            <td align="center"><img src="https://github.com/user-attachments/assets/61049fd5-5e06-4b17-bb51-d925ea3e68dc" width="250"></td>
        </tr>
        <tr>
            <td align="center"><b>김명규</b></td>
        </tr>
        <tr>
            <td align="center"><b>https://github.com/kuma2156</b></td>
        </tr>
    </table>
</div>

---

## ☕️ 언어 (Language)
<table style="background:white; padding:10px; border-radius:8px;">
    <tr>
        <td align="center">
            <img src="https://github.com/user-attachments/assets/e345f034-71e7-4fd8-b002-5034674a2fe8" width="64" height="64">
        </td>
    </tr>
    <tr>
        <td align="center"><b>Java</b></td>
    </tr>
</table>

## 📌 주요 Java 개념 정리

---

### 🧬 제네릭 (Generics)

- 컴파일 시 타입을 체크할 수 있도록 해주는 기능
- 다양한 타입을 하나의 코드로 처리할 수 있게 해줌

```java
public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

// 사용 예
Box<String> stringBox = new Box<>();
stringBox.set("Hello");
String val = stringBox.get();  // 타입 안정성 보장
```

---

### 🏗️ 빌더 패턴 (Builder Pattern)

- 복잡한 객체를 단계적으로 구성하고 생성할 수 있는 디자인 패턴
- 가독성이 좋고, 선택적인 매개변수를 설정할 때 유리함

```java
public class User {
    private String name;
    private int age;
    private String email;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static class Builder {
        private String name;
        private int age;
        private String email;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

// 사용 예
User user = new User.Builder()
    .name("홍길동")
    .age(30)
    .email("hong@example.com")
    .build();
```

---

### 🧩 싱글톤 패턴 (Singleton Pattern)

- 애플리케이션에서 **단 하나의 인스턴스만 생성되도록** 보장하는 패턴
- 주로 설정 클래스, 공통 유틸, DB 커넥션 등에 사용

```java
public class Singleton {
    private static final Singleton instance = new Singleton();

    // 외부에서 생성자 호출 못하게 막음
    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
```

---

### 🔧 Lombok

- 반복되는 코드 (Getter, Setter, Constructor 등)를 자동으로 생성해주는 라이브러리
- 코드 가독성 향상 및 생산성 증가

```java
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String name;
    private int age;
    private String email;
}

// 사용 예
User user = User.builder()
    .name("홍길동")
    .age(25)
    .email("hong@example.com")
    .build();
```

---



## 🗓️ 학습 일지 요약
| 날짜         | 범위             | 내용                                         |
|--------------|------------------|----------------------------------------------|
| 4월 22일     | ch1 ~ ch3        | Java의 정의, 데이터의 형태, 연산자           |
| 4월 23일     | ch4 ~ ch7        | 캐스팅, 스캐너, 조건식, 반복문               |
| 4월 24일     | ch8 ~ ch9        | 메서드, 클래스                              |
| 4월 25일     | ch9 ~ ch11        | 클래스의 생성자, Getter Setter, 접근 지정자             |
| 4월 28일     | ch12, ch13, ch15          |  배열, Overloading, 상속자, super         |
| 4월 29일     | ch13, ch14, ch15              |   Inheritance, Abstract Class, Interface, Casting_UpCasting                            |
| 4월 30일     | ch15 ~ ch19             |  Casting_DownCasting, toString(), .equals(), 디자인패턴(싱글톤,빌더), 제네릭                       |
| 5월 07일     | ch19              |   제네릭의 와일드카드                                         |
