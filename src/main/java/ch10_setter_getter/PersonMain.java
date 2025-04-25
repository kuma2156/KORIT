package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();      // 기본 생성자로 객체 person1 생성
        person1.setName("김일") ;
        person1.setAge(243);

//        person1.showInfo();

        person1.setAge(25);
//        person1.showInfo();

        // 스트링값.length() 하면 데이터의 길이가 int 값으로 반환됩니다
//        System.out.println("안녕하세요".length());;
        person1.setName("");

        // isEmpty() 는 문자열이 안에 없을 경우 true 있을 경우 false 를 반환
        System.out.println("".isEmpty());

        Person person2 = new Person("이이",32);
        // 여기서 이이 라는 사람의 이름을 강이로 바꾸고 싶다면 두 가지 방법이 존재
        // # 1 객체명.속성명
//        person2.name = "강이";            // Person.java에 private를 적용하면 오류 발생
        // # 2 setName()을 이용하는 방법
        person2.setName("강이");

        // 마찬가지로 콘솔창에 person2의 name을 출력하는 방법도 두 가지 존재
        // # 1.
//        System.out.println(person2.name); // Person.java에 private를 적용하면 오류 발생
        // # 2. gatName() > call3()
        System.out.println(person2.getName());

        // call1() / call2() 유형의 경우 return 이 없는대신 콘솔창에 출력하기 위해
        // 메서드 내에 sout() 을 써야한다
        // 이상의 경우 main 단계에서 메서드 호출을 하기만 하면 콘솔창에 결과가 출력되는 장점이 있지만
        // `데이터 가공`이 어렵다.

        // 김일 님 / 최일 님 반갑습니다.
        // 님 같은 느낌으로 붙일때
        System.out.println(person1.getName()+ "님 반갑습니다.");
        System.out.println(person2.getName()+ "님 반갑습니다.");


    }
}
