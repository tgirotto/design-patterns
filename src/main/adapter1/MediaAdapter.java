package main.adapter1;

import main.adapter1.advancedMediaPlayer.AdvancedMediaPlayer;
import main.adapter1.advancedMediaPlayer.MP4Player;
import main.adapter1.advancedMediaPlayer.VLCPlayer;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("MP4"))
            this.advancedMediaPlayer = new MP4Player();
        else if(audioType.equalsIgnoreCase("VLC"))
            this.advancedMediaPlayer = new VLCPlayer();
    }

    @Override
    public String play(String type, String fileName) {
        if(type.equalsIgnoreCase("VLC"))
            advancedMediaPlayer.playVLC(fileName);
        else if(type.equalsIgnoreCase("MP4"))
            advancedMediaPlayer.playMP4(fileName);

        return null;
    }
}
