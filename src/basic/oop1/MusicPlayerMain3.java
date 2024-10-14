package basic.oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();

        mp.on();
        mp.volumeUp();
        mp.volumeUp();
        mp.volumedown();
        mp.showStatus();
        mp.off();
    }
}
