package test;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	
	public GridLayoutEx() {
		super("GridLayout 실습"); // setTitle
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new GridLayout(2, 5));
		
		for(int i = 1; i <= 10; i++) {
			String text = Integer.toString(i);
			contentPane.add(new JButton(text));
		}
		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
