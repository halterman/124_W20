package coloredBoxes;

import javax.swing.JFrame;

public class ColoredBoxes {
	public static void main(String[] args) {
		JFrame window = new JFrame("Box");
		window.add(new ColoredBoxesPanel());
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
