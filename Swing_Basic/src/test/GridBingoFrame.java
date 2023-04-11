package test;

import java.awt.*;
import javax.swing.*;

public class GridBingoFrame extends JFrame {
	
	public GridBingoFrame() {
		super("GridBingoLayout"); // setTitle
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new GridLayout(5, 5, 20, 20));
		
		for(int i = 1; i <= 25; i++) {
			String text = Integer.toString(i);
			JButton bt = new JButton(text);
			bt.setBackground(Color.CYAN);
			contentPane.add(bt);
		}
		
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridBingoFrame();
	}

}