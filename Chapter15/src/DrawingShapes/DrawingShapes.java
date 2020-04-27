package DrawingShapes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class ShapePanel extends JPanel {
	
	public ShapePanel() {
		setBackground(Color.WHITE);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		g.drawLine(10, 10, 225, 125);
		g.setColor(Color.RED);
		g.drawLine(10, 10, 100, 10);
		
		g.setColor(Color.GREEN);
		g.fillOval(200, 100, 50, 50);
	}
}

public class DrawingShapes {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame window = new JFrame("Shapes");
			window.setSize(300, 150);
			window.add(new ShapePanel());
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
		});
	}
}
