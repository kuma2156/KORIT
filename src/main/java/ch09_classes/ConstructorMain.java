package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        // 기본생성자를 통한 객체 생성
        Constructor constructor1 = new Constructor();
        // int 매게변수 생성자를 통한 객체생성
        Constructor constructor2 = new Constructor(21);
        System.out.println(constructor2.num);
        // String 매게변수 생성자를 통한 객체생성
        Constructor constructor3 = new Constructor("김명규");
        // 이상의 경우 만들때 속성값을 바로 초기화
        constructor3.num = 23;
        // 위의 경우는 default로 0으로 초기화되어있어
        // 23을 재대입 했다고 해석할 수 있다.

        // AllArgsConstructor를 기준으로 두개의 객체를 생성
        Constructor constructor4 = new Constructor("조은별",21);

        constructor1.displayInfo();
        constructor2.displayInfo();
        constructor3.displayInfo();
        constructor4.displayInfo();
    }
}
