package main.adapter1;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public String play(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("MP3")) {
            System.out.println("Inbuilt implementation");
            return "MP3";
        } else if(fileName.equalsIgnoreCase("MP4") || fileName.equalsIgnoreCase("VLC"))
            new MediaAdapter(fileType).play(fileType, fileName);

        return null;
    }
}
