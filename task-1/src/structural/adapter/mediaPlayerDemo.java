package structural.adapter;

public class mediaPlayerDemo {
    public static void main(String[] args) {
        audioPlayer player = new audioPlayer();

        player.play("mp3", "song.mp3");
        player.play("mp4", "video.mp4");
        player.play("vlc", "movie.vlc");
        player.play("xyz", "audio.xyz");
    }
}
