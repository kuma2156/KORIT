package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 이상의 field들을 이용한 메서드들의 정의
    public void onPressedPowerButton(){
        System.out.print("TV 의 ");
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton(){
        System.out.print("TV 의 ");
        channelDownButton.onPressed(); // 메서드 내에서 메서드를 호출
    }

    public void onPressedChannelUpButton(){
        System.out.print("TV 의 ");
        channelUpButton.onPressed();
    }

    public void onUpChannelButton(){
        System.out.print("TV 의 ");
        System.out.println(channelUpButton.onUp());;
    }

    public void onPressedVolumeDownButton(){
        System.out.print("TV 의 ");
        volumeDownButton.onPressed();
    }

    public void onPressedVolumeUpButton(){
        System.out.print("TV 의 ");
        volumeUpButton.onPressed();
    }

    public void onDonwVolumeButton(){
        System.out.print("TV 의 ");
        volumeDownButton.onDown();
    }
    public void onUpVolumeButton(){
        System.out.print("TV 의 ");
        System.out.println(volumeUpButton.onUp());;
    }
}
