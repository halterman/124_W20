package boxMover;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BoxMoverWindow {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame window = new JFrame("Box Mover");
			window.add(new BoxMover());
			window.setSize(400, 200);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
		});
	}
}
