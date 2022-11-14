package adapter.advancetomedia;

public class VLCPlayer implements AdvanceMediaPlayer{

    @Override
    public void playVLC() {
        System.out.println("VLC Player playing VLC audio files.");
        
    }

    @Override
    public void playMp4() {
        System.out.println("VLC Player playing MP4 audio files.");
        
    }

}
