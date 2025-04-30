package ch18_static.builders;

import java.util.Locale;

public class Person {
    private String name;
    private int age;
    private String address;

    // 빌더 패턴
    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;

    }
    public static class Builder{
        private String name;
        private int age;
        private String address;

        // 이하의 코드에 주목해야한다. >  method정의 할 예정
        // method는 대부분 행위를 나타내기 때문에 동사로 작성하지만
        // Builder 패턴에서는 대입될 필드의 이름과 동일한 메서드명을 씁니다
        // 예를 들어 builder.name("이름")
        public Builder name (String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }

        // 이상까지의 코드는 Person 클래스의 필드와 관련 있는 메서드
        // 이제는 객체 생성을 완료하는 메서드를 정의 해야한다 기본적으로 build()
        public Person build(){
            return new Person(this);
        }
    }
}
