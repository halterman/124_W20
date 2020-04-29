package mouseTracker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class SquarePanel extends JPanel {
	
	public SquarePanel() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(500, 500));
		
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent ev) {
				System.out.println("(" + ev.getX() + ", " + ev.getY() + ")");
			}
		
		});
	}
	
}

public class MouseTracker {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame window = new JFrame("Shapes");
			window.add(new SquarePanel());
			window.pack();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
		});
	}
}
