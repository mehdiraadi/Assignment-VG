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
 * 
 * @author Jasmi Shaheer
 * @version 1.0
 * 
 * 
 */
public class ViewClass implements ActionListener {
	/**
	 * Initialising JFrame component frmMpplayer and JTextField texField
	 * 
	 */
	public JFrame frmMpplayer;
	public JTextField textField;
	/**
	 * Declaring a new MP3Player player1.
	 */
	public MP3Player player1 = new MP3Player();
	/**
	 * Creating an object of the class PlayerMethods.
	 * 
	 */

	PlayerMethods pm = new PlayerMethods();

	/**
	 * Declaring new buttons and labels in to the frame.
	 * 
	 */
	private JButton btnOpen = new JButton("");
	private JButton btnPlay = new JButton("");
	private JButton btnPaus = new JButton("");
	private JButton btnStop = new JButton("");
	private JLabel lblMusic = new JLabel("Music:");



	/**
	 * View class Constructor
	 */
	public ViewClass() {
		Initialize();
		addComponentsToFrame();
		addActionListeners();
	}

	/**
	 * Action Listeners for the buttons open,play,pause and stop.
	 * 
	 */

	private void addActionListeners() {
		btnOpen.addActionListener(this);
		btnPlay.addActionListener(this);
		btnPaus.addActionListener(this);
		btnStop.addActionListener(this);

	}

	/**
	 * Initialises the contents of the frame.
	 * getters and setters for the components of the frame
	 * 
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

		lblMusic.setBounds(15, 48, 69, 20);

		textField = new JTextField();
		textField.setBounds(128, 45, 146, 26);
		frmMpplayer.getContentPane().add(textField);
		textField.setColumns(10);
		frmMpplayer.setVisible(true);

	}

	/**
	 * Add components(btnOpen,btnPlay,btnPaus,btnStop and lblMusic) to the frame.
	 * 
	 */
	public void addComponentsToFrame() {
		frmMpplayer.getContentPane().add(btnOpen);
		frmMpplayer.getContentPane().add(btnPlay);
		frmMpplayer.getContentPane().add(btnPaus);
		frmMpplayer.getContentPane().add(btnStop);
		frmMpplayer.getContentPane().add(lblMusic);

	}

	/**
	 * 
	 * It does the actions when different buttons(open,play,pause and stop )are pressed
	 * 
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOpen) {
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

		if (e.getSource() == btnPlay) {
			pm.setPlayer(player1);
			pm.play1();
		}

		if (e.getSource() == btnPaus) {
			pm.setPlayer(player1);

			pm.pause();
		}

		if (e.getSource() == btnStop) {
			pm.setPlayer(player1);
			pm.stop();
		}

	}

}
