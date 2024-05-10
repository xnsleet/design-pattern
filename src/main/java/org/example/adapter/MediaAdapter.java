package org.example.adapter;

import org.example.adapter.advancedMediaPlayer.AdvancedMediaPlayer;
import org.example.adapter.advancedMediaPlayer.Mp4Player;
import org.example.adapter.advancedMediaPlayer.VLCPlayer;
import org.example.adapter.mediaPlayer.MediaPlayer;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class MediaAdapter
        implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VLCPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("vlc")){
            advancedMediaPlayer.playVLC(fileName);
        }else if (audioType.equals("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
