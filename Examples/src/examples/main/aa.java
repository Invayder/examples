package examples.main;

import javax.swing.*;

public class aa {
	public static void main(String[] args) {
		// Creating Objects \\
		JFrame frame = new JFrame();
		// Frame Settings \\
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(200, 60);
		frame.setTitle("Example JFrame!");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
