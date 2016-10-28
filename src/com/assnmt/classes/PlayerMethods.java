package com.assnmt.classes;

import java.awt.TextField;

import java.io.File;

import javax.swing.JFileChooser;

import com.assnmnt.GUI.ViewClass;
import com.assnmt.interfaces.PlayerInterface;

import jaco.mp3.player.MP3Player;

/**
 * @author Jasmi
 * @version 1.0 This is the class which implements the PlayerInterface methods.
 * 
 */

public class PlayerMethods implements PlayerInterface {

	/**
	 * Attribute MP3Player
	 * 
	 */

	private MP3Player player;

	/**
	 * These are the getters and setters for the attribute MP3Player
	 * 
	 */

	public MP3Player getPlayer() {
		return player;
	}

	public void setPlayer(MP3Player player) {
		this.player = player;
	}

	/**
	 * Play method to play music
	 * 
	 * @param
	 * @return none
	 */

	@Override
	public void play1() {

		player.play();
		return;

	}

	/**
	 * Pause method to pause the music
	 * 
	 * @param
	 * @return none
	 */

	@Override
	public void pause() {
		player.pause();
		return;

	}

	/**
	 * Stop method to stop the music
	 * 
	 * @param
	 * @return none
	 * 
	 */
	@Override
	public void stop() {
		player.stop();
		return;

	}

}
