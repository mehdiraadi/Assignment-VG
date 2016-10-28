package com.assnmt.classes;
import java.awt.TextField;
import java.io.File;

import javax.swing.JFileChooser;

import com.assnmnt.GUI.ViewClass;
import com.assnmt.interfaces.PlayerInterface;

import jaco.mp3.player.MP3Player;

public class PlayerMethods implements PlayerInterface{
	
	
	
	private MP3Player player;

	public MP3Player getPlayer() {
		return player;
	}

	public void setPlayer(MP3Player player) {
		this.player = player;
	}

	

	@Override
	public void play1() {
		
		player.play();
		return;
		
		
	}

	@Override
	public void pause() {
		player.pause();
		return;
		
		
	}

	@Override
	public void stop() {
		player.stop();
		return;
		
		
	}
	

}
