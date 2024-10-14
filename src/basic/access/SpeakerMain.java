package basic.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        System.out.println("volume 필드에 직접 접근");
//        speaker.volume = 200;
        speaker.showVolume();
        
        // 이런식으로도 가능한 듯. 해결 방법은 2가지 정도 있음. 생성자에 조건문을 걸거나 생성자에 매개변수를 안받고 기본값을 부여하거나.
        Speaker speaker2 = new Speaker(190);
        speaker2.showVolume();
    }
}
