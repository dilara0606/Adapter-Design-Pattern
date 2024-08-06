package com.example.AdapterDesignPattern;

import com.example.AdapterDesignPattern.media.AudioPlayer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdapterDesignPatternApplication.class, args);

		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond_the_horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far_far_away.vlc");
		audioPlayer.play("avi", "mind_me.avi");
	}

}
