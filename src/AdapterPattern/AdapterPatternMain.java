package AdapterPattern;

public class AdapterPatternMain {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song1.mp3");
        audioPlayer.play("mp4", "video1.mp4");
        audioPlayer.play("vlc", "video2.vlc");
        audioPlayer.play("avi", "video3.mov");
    }

}
