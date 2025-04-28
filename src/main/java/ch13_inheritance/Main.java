package ch13_inheritance;


public class Main {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        animal1.setAnimalName("나비");
//        animal1.setAnimalAge(1);
//        animal1.move();
//
//        Tiger tiger1= new Tiger();
//        tiger1.setAnimalName("호돌이");
//        tiger1.setAnimalAge(5);
//        tiger1.move();
//        tiger1.hunt();
//
//        //animal1.hunt(); 오류발생 > 부모클래스는 자식클래드의 필드 및 메서드에 접근 X
//
//        tiger1.setStriped(true);
//        animal1.setStriped(false);  오류발생 > 부모클래스에서 자식 클래스의 메서드를 사용할 수 없다

        Human human1 = new Human();
        human1.setAnimalAge(27);
        human1.setAnimalName("김명규");
        
        human1.move();
        human1.getAnimalName();
        human1.getAnimalAge();
        human1.read("자바의 정석");

    }
}
