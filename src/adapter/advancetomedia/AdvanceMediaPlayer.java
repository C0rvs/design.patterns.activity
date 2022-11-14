package adapter.advancetomedia;

public interface AdvanceMediaPlayer {
    default void playVLC() {
        System.out.println("Playing VLC player");
    }
    default void playMp4() {
        System.out.println("Playing mp4 player");
    }

}
