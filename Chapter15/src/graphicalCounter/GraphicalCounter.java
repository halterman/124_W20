package graphicalCounter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GraphicalCounter extends JPanel implements MouseListener {
	
	private int count;
	
	private JLabel label;
	private JButton button;
	
	
	public GraphicalCounter() {
		count = 0;
		label = new JLabel("0");
		label.setFont(new Font("Arial", Font.PLAIN, 64));
		button = new JButton("Increment");
		add(label);
		add(button);
		button.addMouseListener(this);
	}
	
	public void increment() {
		count++;
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		count++;
		label.setText(Integer.toString(count));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
