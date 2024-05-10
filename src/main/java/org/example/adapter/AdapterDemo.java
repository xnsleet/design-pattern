package org.example.adapter;

import org.example.adapter.mediaPlayer.AudioPlayer;

/**
 * 适配器模式：使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *
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
