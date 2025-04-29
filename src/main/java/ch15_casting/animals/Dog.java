package ch15_casting.animals;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("멍멍");
    }

    // Dog 클래스의 고유 메서드
    public void fetch(){
        System.out.println("강아지가 공을 물어옵니다.");
    }
}
