package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        // Person 클래스의 인스턴스 person1을 만든다고 가정
        // Person person1 = new Person("김명규" , 27, "부산" )
        // 라고 작성했었다 > 근데 만약에 AllArgsConstructor가 없다면
        // Person person1 = new Person();
        // person1.setName("김명규")
        // person1.setAddress("부산")
        // person1.setAge(27)
        // 이런식으로 작성해야만 한다.

        // 하지만 빌더 패턴을 사용한다면 이런 식으로 원하는 인자값도 넣을 수 있고 생성자를 수고롭게 넣을 필요가 없어진다.
        // 가독성이 높아진다.
        Person person1 = new Person.Builder()
                .name("김명규")
                .age(27)
                .address("부산")
                .build();
        Person person2 = new Person.Builder().age(22).name("조은별").build();
        Person person3 = new Person.Builder().build();

    }
}
