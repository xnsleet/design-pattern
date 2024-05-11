package org.example.adapter;

import org.example.adapter.mediaPlayer.AudioPlayer;

/**
 * 适配器模式：
 *      使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * 主要解决：
 *      主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
 * 使用场景：
 *      有动机地修改一个正常运行的系统的接口，这时应该考虑使用适配器模式。
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
