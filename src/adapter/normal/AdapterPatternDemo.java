package adapter.normal;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AdvanceMediaPlayer mp4Player = new Mp4Player();
        AdvanceMediaPlayer vlcPlayer = new VLCPlayer();
        
        MediaPlayer audioPlayer = new AudioPlayer();
        
        mp4Player.playMp4();
        mp4Player.playVLC();
        
        
        vlcPlayer.playMp4();
        vlcPlayer.playVLC();
        
        System.out.println("Audio files of Audio player class before implementing the adapter");
        audioPlayer.play();
        
        MediaPlayerAdapter mediaAdapter = new MediaPlayerAdapter(vlcPlayer);
        
        mediaAdapter.play();
    }

}
