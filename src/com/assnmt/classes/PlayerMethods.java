package com.assnmt.classes;

import com.assnmt.interfaces.PlayerInterface;

import jaco.mp3.player.MP3Player;

/**
 * Class which implements the PlayerInterface methods
 * 
 * @author Jasmi Shaheer
 * @version 1.0
 * 
 */

public class PlayerMethods implements PlayerInterface {

	/**
	 * Attribute MP3Player
	 * 
	 */

	private MP3Player player;

	/**
	 * Getters and setters for the attribute MP3Player
	 * 
	 */

	public MP3Player getPlayer() {
		return player;
	}

	public void setPlayer(MP3Player player) {
		this.player = player;
	}

	/**
	 * Plays music
	 * 
	 * @param none
	 * @return none
	 */

	@Override
	public void play1() {

		player.play();
		

	}

	/**
	 * Pauses the music
	 * 
	 * @param none
	 * @return none
	 */

	@Override
	public void pause() {
		player.pause();
		

	}

	/**
	 * It stops the music
	 * 
	 * @param none
	 * @return none
	 * 
	 */
	@Override
	public void stop() {
		player.stop();
		

	}

}
