package com.example.AdapterDesignPattern;

import com.example.AdapterDesignPattern.media.AudioPlayer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdapterDesignPatternApplicationTests {

	@Test
	public void testAudioPlayer() {
		AudioPlayer audioPlayer = new AudioPlayer();

		// Test MP3 playback
		audioPlayer.play("mp3", "beyond_the_horizon.mp3");

		// Test MP4 playback
		audioPlayer.play("mp4", "alone.mp4");

		// Test VLC playback
		audioPlayer.play("vlc", "far_far_away.vlc");

		// Test invalid format
		audioPlayer.play("avi", "mind_me.avi");
	}

}
