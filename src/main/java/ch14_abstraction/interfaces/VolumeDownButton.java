package ch14_abstraction.interfaces;

public class VolumeDownButton extends Button{

    @Override
    public void onPressed() {
        System.out.println("볼륨을 한단계 낮춥니다.");
    }

    public void onDown() {
        System.out.println("볼룸을 계속 낮춥니다.");
    }
}
