package org.example.adapter.advancedMediaPlayer;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class VLCPlayer
        implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        System.out.println("playVLC:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
