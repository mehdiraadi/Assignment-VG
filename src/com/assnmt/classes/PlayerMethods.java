package com.assnmt.classes;

import com.assnmt.interfaces.PlayerInterface;

import jaco.mp3.player.MP3Player;

public class PlayerMethods implements PlayerInterface{
	
	private MP3Player player=new MP3Player();

	public MP3Player getPlayer() {
		return player;
	}

	public void setPlayer(MP3Player player) {
		this.player = player;
	}

	@Override
	public void open() {
		
		
		
	}

	@Override
	public void play() {
		
		player.play();
		
		
	}

	@Override
	public void pause() {
		player.pause();
		
		
	}

	@Override
	public void stop() {
		player.stop();
		
		
	}
	

}
