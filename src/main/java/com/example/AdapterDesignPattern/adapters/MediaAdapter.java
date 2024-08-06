package com.example.AdapterDesignPattern.adapters;

import com.example.AdapterDesignPattern.advancedmedia.AdvancedMediaPlayer;
import com.example.AdapterDesignPattern.advancedmedia.MP4Player;
import com.example.AdapterDesignPattern.advancedmedia.VLCPlayer;
import com.example.AdapterDesignPattern.media.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VLCPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVLC(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMP4(fileName);
        }
    }
}
