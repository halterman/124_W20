package Doodle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

class DoodlePanel extends JPanel {
	private ArrayList<MouseEvent> points;
	
	public DoodlePanel() {
		points = new ArrayList<MouseEvent>();
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent ev) {
				points.add(ev);
				repaint();
			}
		});
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (points.size() > 1) {
			for (int i = 1; i < points.size(); i++) {
				g.drawLine(points.get(i).getX(), points.get(i).getY(),
				           points.get(i - 1).getX(), points.get(i - 1).getY());
			}
		}
	}

}


public class Doodle {
	public static void main(String[] args) {
		JFrame window = new JFrame("Doodle");
		window.add(new DoodlePanel());
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
