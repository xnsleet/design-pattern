package org.example.adapter.advancedMediaPlayer;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class Mp4Player
        implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playMp4:" + fileName);
    }
}
