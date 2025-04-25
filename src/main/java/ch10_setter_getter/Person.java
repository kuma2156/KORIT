package ch10_setter_getter;

public class Person {
    // 필드선언
    private String name;
    private int age;
    // 기본생성자 , 매게변수 하나인 생성자 두 개, 매게변수 2개인 생성자 하나 작성
    Person(){
        System.out.println("기본 생성자를 통해 Person 클래스의 인스턴스가 생성되었습니다");
    }
    Person(String name, int age){
        System.out.println("AllArgsConstructor");
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // isEmpty() 는 문자열이 안에 없을 경우 true 있을 경우 false 를 반환
    public void setName(String name) {
        if(name.length() == 0 || name == null){
            System.out.println("불가능한 이름 입력입니다.");
            return;
        }
        System.out.println("이름이 입력되었습니다 : "+ name);
        this.name = name;
    }

    // 스트링값.length() 하면 데이터의 길이가 int 값으로 반환됩니다
    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 200){
            System.out.println("불가능한 나이 입력입니다 .");
            return;
        }else {
            System.out.println("나이가 입력되었습니다 ");
            System.out.println("변경 전 나이 : " +this.age);
            this.age = age;
            System.out.println("변경 후 나이 : " +this.age);
        }

    }
    /*
        이제 setAge를 자동완성한 것을 기본으로 두고 편집,
        나이가 0 미만이거나 200 초과인 age가 매게변수로 들어오게 된다면
        객체의 속성에 들어갈 수 없게 끔 할 예정
        md 파일을 참조해서 PersonMain 에서 person1 기본생성자 하고
        입력 >>
            person1.setName("김일")
            person1.setAge(243)

        실행 예 :
           기본 생성자를 통해 Person 클래스의 인스턴스가 생성되었습니다ㅣ
           이름이 입력되었습니다 : 김일
           불가능한 나이입니다 . 현재 나이 : 0
           나이가 입력되었습니다.
           변경 전 나이 : 0
           변경 후 나이 : 25

    * */

    void showInfo(){
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
    }
}
