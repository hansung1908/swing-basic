package test;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		
		setTitle("첫번째 프레임"); // 화면 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); // 배치관리자, flowlayout : 자동으로 컴포넌트를 배치 
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("cancel"));
		contentPane.add(new JButton("ignore"));
		
		setSize(300, 300); // 화면 크기
		setVisible(true); // 화면 표시 유무
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
