package ch14_abstraction.interfaces;

public class VolumeUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("볼륨을 한단계 높입니다.");
    }

    public String onUp(){
        return "볼륨을 계속 " + super.onUp();
    }
}
