package org.example.adapter;

import org.example.adapter.mediaPlayer.AudioPlayer;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class AdapterDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc","hello.vlc");
        audioPlayer.play("mp4","hello.mp4");
    }
}
