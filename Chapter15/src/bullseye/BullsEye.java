package bullseye;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class BullsEyePanel extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = getWidth()/2;
		int y = getHeight()/2;
		g.setColor(Color.BLUE);
		g.fillOval(x - 100, y - 100, 200, 200);
		g.setColor(Color.YELLOW);
		g.fillOval(x - 75, y - 75, 150, 150);
		g.setColor(Color.RED);
		g.fillOval(x - 50, y - 50, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(x - 25, y - 25, 50, 50);

	}
}

public class BullsEye {
	public static void main(String[] args) {
		JFrame window = new JFrame("Bullseye");
		window.setSize(300, 300);
		window.add(new BullsEyePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
