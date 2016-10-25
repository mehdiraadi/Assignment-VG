package com.assnmnt.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class ViewClass {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewClass window = new ViewClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.setBounds(15, 114, 115, 29);
		frame.getContentPane().add(btnOpen);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setBounds(128, 114, 115, 29);
		frame.getContentPane().add(btnPlay);
		
		JButton btnPaus = new JButton("Paus");
		btnPaus.setBounds(242, 114, 115, 29);
		frame.getContentPane().add(btnPaus);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBounds(329, 114, 115, 29);
		frame.getContentPane().add(btnStop);
	}

}
