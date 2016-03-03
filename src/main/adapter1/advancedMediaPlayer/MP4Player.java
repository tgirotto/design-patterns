package main.adapter1.advancedMediaPlayer;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public String playMP4(String file) {
        return "MP4";
    }

    @Override
    public String playVLC(String file) {
        return null;
    }
}
