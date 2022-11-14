package adapter.normal;


public interface AdvanceMediaPlayer {
    default void playVLC() {
        System.out.println("Playing VLC");
    }
    default void playMp4() {
        System.out.println("Playing mp4");
    }

}
