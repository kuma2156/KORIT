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
}
