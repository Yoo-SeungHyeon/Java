package basic.oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 시작
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륩 : " + data.volume);
        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륩 : " + data.volume);
        // 볼륨 김서
        data.volume--;
        System.out.println("음악 플레이어 볼륩 : " + data.volume);

        System.out.println(("음악 플레이어 상태 확인"));
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
