package main.adapter1.advancedMediaPlayer;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public String playMP4(String file) {
        return null;
    }

    @Override
    public String playVLC(String file) {
        return "VLC";
    }
}
