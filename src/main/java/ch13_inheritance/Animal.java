package ch13_inheritance;

public class Animal {
    // 필드 생성
    String animalName;
    int animalAge;

    // 기본 생성자 및 매게변수 생성자
    public Animal(){

    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    // getter / setter
    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void move(){
//        System.out.println("움직이기 시작합니다.");
    }

}
