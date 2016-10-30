package com.assnmnt.GUI;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.assnmt.classes.PlayerMethods;

import jaco.mp3.player.MP3Player;

/**
 * This is the class where the implementation of user interface.
 * @author jasmi
 * 
 * 
 */
public class ViewClass implements ActionListener{
/**
 * 
 * 
 * */
	public JFrame frmMpplayer;
	public JTextField textField;
	public MP3Player player1 = new MP3Player();

	PlayerMethods pm = new PlayerMethods();
	JButton btnOpen=new JButton("");
	JButton btnPlay = new JButton("");
	JButton btnPaus = new JButton("");
	JButton btnStop = new JButton("");

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ViewClass() {
		Initialize();
		addComponentsToFrame();
		addActionListeners();
	}

	private void addActionListeners() {
		btnOpen.addActionListener(this);
		btnPlay.addActionListener(this);
		btnPaus.addActionListener(this);
		btnStop.addActionListener(this);
				
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void Initialize() {
		frmMpplayer = new JFrame();
		frmMpplayer.setTitle("MP3Player");
		frmMpplayer.setBounds(100, 100, 657, 300);
		frmMpplayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMpplayer.getContentPane().setLayout(null);
		frmMpplayer.getContentPane().setBackground(Color.BLUE);
		pm.setPlayer(player1);
		
		btnOpen.setIcon(new ImageIcon("Icons\\openp.jpg"));
		
		
		
		

		

		btnOpen.setBounds(15, 114, 115, 29);
		

		btnPlay.setIcon(new ImageIcon("Icons\\playp.jpg"));
		btnPlay.setEnabled(false);
		
		btnPlay.setBounds(128, 114, 115, 29);
		

		btnPaus.setIcon(new ImageIcon("Icons\\pausep.jpg"));
		btnPaus.setEnabled(false);
		
		btnPaus.setBounds(242, 114, 115, 29);
		

		btnStop.setIcon(new ImageIcon("Icons\\stopp.jpg"));
		btnStop.setEnabled(false);
		
		
		btnStop.setBounds(358, 114, 115, 29);
		
		JLabel lblMusic = new JLabel("Music:");
		lblMusic.setBounds(15, 48, 69, 20);
		frmMpplayer.getContentPane().add(lblMusic);

		textField = new JTextField();
		textField.setBounds(128, 45, 146, 26);
		frmMpplayer.getContentPane().add(textField);
		textField.setColumns(10);
		frmMpplayer.setVisible(true);
		

	}
	public void addComponentsToFrame(){
		frmMpplayer.getContentPane().add(btnOpen);
		frmMpplayer.getContentPane().add(btnPlay);
		frmMpplayer.getContentPane().add(btnPaus);
		frmMpplayer.getContentPane().add(btnStop);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOpen){
			pm.stop();
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(btnOpen);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				btnPlay.setEnabled(true);
				btnPaus.setEnabled(true);
				btnStop.setEnabled(true);

				File file = fc.getSelectedFile();
				String song = file.getName();
				textField.setText(song);

				player1 = new MP3Player(file);
				pm.setPlayer(player1);
				pm.play1();

			}
			}
			
			if (e.getSource() == btnPlay){
				pm.setPlayer(player1);
				pm.play1();
			}
			
			if (e.getSource() == btnPaus){
				pm.setPlayer(player1);

				pm.pause();
			}
			
			if (e.getSource() == btnStop){
				pm.setPlayer(player1);
				pm.stop();
			}
		
	}

	
	
}
