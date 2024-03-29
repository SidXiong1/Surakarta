package com.suchess;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FirstDialog extends JFrame implements ActionListener{

	public JButton startButton;
	public JRadioButton computer_first;
	public JRadioButton player_first;
	public JRadioButton palyer_player;

	public JRadioButton computer_computer;
	public ButtonGroup radiobuttons;

	public FirstDialog() {
		setSize(440, 340);
    	this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.CYAN);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("黑体", Font.PLAIN, 30));
		lblNewLabel.setText("苏拉卡尔塔");

		startButton = new JButton("New button");
		startButton.setText("开始");
		startButton.addActionListener(this);

		computer_first = new JRadioButton("电脑先手");
		computer_first.setFont(new Font("宋体", Font.PLAIN, 12));

		player_first = new JRadioButton("玩家先手");
		player_first.setFont(new Font("宋体", Font.PLAIN, 12));

		palyer_player = new JRadioButton("人人对弈");
		palyer_player.setFont(new Font("宋体", Font.PLAIN, 12));

		computer_computer = new JRadioButton("机器对弈");
		computer_computer.setFont(new Font("宋体", Font.PLAIN, 12));

		radiobuttons = new ButtonGroup();
		radiobuttons.add(computer_first);
		radiobuttons.add(player_first);
		radiobuttons.add(palyer_player);
		radiobuttons.add(computer_computer);

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
								.addGap(141)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(133))
						.addGroup(groupLayout.createSequentialGroup()
								.addGap(188)
								.addComponent(startButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(179))
						.addGroup(groupLayout.createSequentialGroup()
								.addGap(180)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(player_first, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
										.addComponent(computer_first, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(palyer_player, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(computer_computer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(171))
		);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addGap(16)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(computer_first)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(player_first, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(2)
								.addComponent(palyer_player, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(2)
								.addComponent(computer_computer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(10)
								.addComponent(startButton, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addGap(37))
		);
		getContentPane().setLayout(groupLayout);


	}

	//开始按钮点击监听
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startButton) {
			if(computer_first.isSelected() == true) {
				MainDialog mainDialog = new MainDialog(0);//电脑先手
				mainDialog.setVisible(true);
			}
			else if(player_first.isSelected() == true){
				MainDialog mainDialog = new MainDialog(1);//人先手
				mainDialog.setVisible(true);
			}
			else if(palyer_player.isSelected() == true){
				MainDialog mainDialog = new MainDialog(2);//人人对弈
				mainDialog.setVisible(true);
			}else if(computer_computer.isSelected() == true){
				MainDialog mainDialog = new MainDialog(3);//机器对弈
				mainDialog.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(null, "请选择模式！");
				return;
			}
			this.dispose();

		}

	}
}
