package view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avance - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay();
		frame.add(d);
	}
	
	@Override	
	protected void paintComponent(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paintComponent(arg0);
	}
}
