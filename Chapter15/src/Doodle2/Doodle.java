package Doodle2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

class DoodlePanel extends JPanel {
	private ArrayList<MouseEvent> points;
	
	public DoodlePanel() {
		points = new ArrayList<MouseEvent>();
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent ev) {
				points.add(ev);
				repaint();
			}
			@Override
			public void mouseReleased(MouseEvent ev) {
				points.add(null);
				repaint();
			}
		});
		
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent ev) {
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
				if (points.get(i) != null && points.get(i - 1) != null) {
					g.drawLine(points.get(i).getX(), points.get(i).getY(), points.get(i - 1).getX(),
							points.get(i - 1).getY());
				}
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
