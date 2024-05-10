package org.example.adapter.mediaPlayer;

import org.example.adapter.MediaAdapter;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class AudioPlayer
        implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
    }
}
