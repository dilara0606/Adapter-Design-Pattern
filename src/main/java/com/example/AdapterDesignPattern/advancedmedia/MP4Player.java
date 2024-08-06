package com.example.AdapterDesignPattern.advancedmedia;

public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

    @Override
    public void playVLC(String fileName) {
        // MP4Player only supports mp4 format
    }
}
