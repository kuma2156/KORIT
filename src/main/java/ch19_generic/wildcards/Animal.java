package ch19_generic.wildcards;

public abstract class Animal {
    public abstract void move();
}
/*
    Human / Tiger 클래스는 Animal 클래스를 상속하여
    사람이 두 발로 걷습니다
    호랑이가 네 발로 걷습니다.
    move() 메서드를 구현

    Human 에는 고유 메서드 read()
    Tiger 에는 고유 메서드 hunt() 
    
    car 클래스는 상속받지 않고 
    차가 움직입니다 출력
    brake() 차가 멈춥니다 출력
* */