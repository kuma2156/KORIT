package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        // 별개의 PowerButton 객체 호출이 될까?
        PowerButton powerButton = new PowerButton();

        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(),new ChannelUpButton(), new VolumeDownButton(), new VolumeUpButton());

        tvRemoteController.onPressedPowerButton();

        // 가능하다
        powerButton.onPressed();        // 결과 값 : 전원을 킵니다
        powerButton.onPressed();        // 결과 값 : 전원을 킵니다  
                                        // 별개로 된다 new로 객체 생성때 새로 넣어줬기에

        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();

        tvRemoteController.onUpChannelButton();

        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();

        tvRemoteController.onDonwVolumeButton();
        tvRemoteController.onUpVolumeButton();

    }
}
