package adapter.advancetomedia;

public class Mp4Player implements AdvanceMediaPlayer{

    @Override
    public void playVLC() {
        System.out.println("MP4 Player playing VLC audio files.");
        
    }

    @Override
    public void playMp4() {
        System.out.println("MP4 Player playing MP4 audio files.");
        
    }

}
