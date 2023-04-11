package test;

import java.awt.*;
import javax.swing.*;

public class NullContainerEx extends JFrame{
	
	public NullContainerEx() {
		setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		JLabel la = new JLabel("Hello! Press Button!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		contentPane.add(la);
		
		for(int i = 1; i <= 9; i++) {
			JButton bt = new JButton(Integer.toString(i));
			bt.setLocation(i*15, i*15);
			bt.setSize(50, 20);
			contentPane.add(bt);
		}
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerEx();
	}

}
