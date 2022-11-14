package adapter.advancetomedia;

public interface MediaPlayer {

    default void play() {
        System.out.println("Playing MP3");
    }
}