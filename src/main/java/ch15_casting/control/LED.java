package ch15_casting.control;

public class LED implements Power{
    @Override
    public void on() {
        System.out.println("LED를 킵니다");
    }

    @Override
    public void off() {
        System.out.println("LED를 끕니다");
    }

    public void changeColor(){
        System.out.println("조명의 색깔을 변경합니다");
    }


}
