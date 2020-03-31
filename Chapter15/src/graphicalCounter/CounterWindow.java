package graphicalCounter;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CounterWindow {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame window = new JFrame("Counter");
			window.add(new GraphicalCounter());
			window.pack();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
		});
	}
}
