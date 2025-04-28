package ch13_inheritance;
/*
    1. Animal 클래스를 상속
    2. 기본 생성자를 이용하여 main에서 human1 객체를 생성
       Human 클래스의 인스턴스가 생성되었습니다 출력
    3. setter 를 활용 animalName에 이름 / animalAge 에 나이 작성
    4. getter 를 재정의 하여 getAnimalName 했을 때.
        안녕하세요. 제 이름은 ___ 입니다. 출력
    5. getter 를 재정의 하여 getAnimalAge 했을 때.
        올해 제 나이는 n살 입니다. 내년에는 n+1살이 됩니다 출력

    6. move() 메서드를 재정의
        사람이 두 발로 걷습니다 출력
    7. Human 클래스의 고유 메서드인 read() 메서드를 call2(0 방식으로 정의
        human1.read("자바의 기초")
        ___은 자바의 기초를 읽는 중입니다 출력

    실행 예
    기본 생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다.
    사람이 두 발로 걷습니다.
    안녕하세요. 제 이름은 ___ 입니다.
    올해 제 나이는 n살 입니다. 내년에는 n+1살이 됩니다
     ___은 자바의 기초를 읽는 중입니다

* */
public class Human extends Animal {
    private String animalName;
    private int animalAge;

    @Override
    public String getAnimalName() {
        System.out.println("안녕하세요. 제 이름은 " + super.animalName + "입니다.");
        return animalName;
    }


    @Override
    public int getAnimalAge() {
        System.out.println("올해 제 나이는 " + super.animalAge + "살 입니다. 내년에는 " + (super.animalAge + 1) + "살이 됩니다.");
        return super.getAnimalAge();
    }


    public Human() {
        System.out.println("기본 생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다.");
    }

    public void read(String book) {
        System.out.println(super.animalName +"은 " + book+"을 읽는 중입니다.");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("사람이 두 발로 걷습니다.");
    }
}
