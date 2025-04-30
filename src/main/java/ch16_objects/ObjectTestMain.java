package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        // 객체 생성
        ObjectTest objectTest1 = new ObjectTest();
        // 이름 , 주소 대입
        objectTest1.setName("김명규");
        objectTest1.setAddress("부산 남구 용호동");
        // displayInfo() 실행
        objectTest1.displayInfo();

        System.out.println(objectTest1);

        Teacher teacher1 = new Teacher("조은별", "고신대");
        System.out.println(teacher1.toString());
    }
}
