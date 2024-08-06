package com.example.AdapterDesignPattern.advancedmedia;

public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playMP4(String fileName) {
        // VLCPlayer only supports vlc format
    }

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}
