package graphicalBox;

import javax.swing.JFrame;

public class GraphicalBox {
	public static void main(String[] args) {
		JFrame window = new JFrame("Box");
		window.add(new BoxPanel());
		window.setSize(400, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
