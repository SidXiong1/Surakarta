package com.suchess;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Start {

	public static void main(String[] args) {
		EventQueue.invokeLater(() ->
		{
			FirstDialog frame = new FirstDialog();

			frame.setLocationRelativeTo(null);            //居中
			frame.setTitle("开始ʼ");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);

		});
	}

}
