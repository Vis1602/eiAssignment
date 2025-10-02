package structural.adapter;

import java.util.logging.Logger;

import log.util.LoggerUtil;

public class mediaAdapter implements mediaPlayer {
    private static final Logger logger = LoggerUtil.getLogger();

    private advancedMediaPlayer advancedPlayer;

    public mediaAdapter(String audioType) {
        logger.info("Initializing mediaAdapter with audioType: " + audioType);
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer = new vlcPlayer();
            logger.info("vlcPlayer initialized.");
        } else if(audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer = new mp4Player();
            logger.info("mp4Player initialized.");
        } else {
            logger.warning("Unsupported audio type: " + audioType);
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        logger.info("Playing file: " + fileName + " with audioType: " + audioType);
        try {
            if(audioType.equalsIgnoreCase("vlc")) {
                advancedPlayer.playVlc(fileName);
                logger.info("Played using vlcPlayer.");
            } else if(audioType.equalsIgnoreCase("mp4")) {
                advancedPlayer.playMp4(fileName);
                logger.info("Played using mp4Player.");
            } else {
                logger.warning("Unsupported audio type: " + audioType);
            }
        } catch (Exception e) {
            logger.severe("Error playing file: " + fileName + ". Error: " + e.getMessage());
        }
    }
}
