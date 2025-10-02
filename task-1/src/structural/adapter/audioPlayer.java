package structural.adapter;

public class audioPlayer implements mediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer adapter = new mediaAdapter(audioType);
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media type: " + audioType + ". Cannot play this file.");
        }
    }
}
