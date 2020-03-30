package guiHelloWorld;

import javax.swing.JFrame;

public class GUIHelloWord {
	public static void main(String[] args) {
		JFrame window = new JFrame("Hello");
		window.setSize(300, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
