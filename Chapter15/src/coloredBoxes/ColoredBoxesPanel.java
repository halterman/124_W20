package coloredBoxes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class ColoredBoxesPanel extends JPanel {
	private static Color[] colors = {
		Color.RED, Color.BLUE, Color.GREEN, Color.BLACK, Color.YELLOW
	};
	
	private static Random rand = new Random();
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int max = 5000;
		while (max > 0) {
			int x = rand.nextInt(800);
			int y = rand.nextInt(600);
			Color color = colors[rand.nextInt(colors.length)];
			g.setColor(color);
			g.fillRect(x,  y,  20, 20);

			max--;
		}
	}

}
