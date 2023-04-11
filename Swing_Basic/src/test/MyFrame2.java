package test;

import java.awt.*;
import javax.swing.*;

public class MyFrame2 extends JFrame {
	
	public MyFrame2() {
		setTitle("복습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("calculate"));
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame2();
	}

}
