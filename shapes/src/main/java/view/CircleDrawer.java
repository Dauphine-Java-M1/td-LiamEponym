package view;

import java.awt.Graphics;
import java.awt.image.AreaAveragingScaleFilter;

import model.Circle;
import model.Shape;

public class CircleDrawer implements IDrawer{
	private Circle cercle;
	
	public CircleDrawer(Circle c) {
		this.cercle = c;

	}

	public void draw() {
		Graphics g = null;
		int diametre = this.cercle.getRayon()*2;
		g.fillOval(this.cercle.getCentre().getX() - this.cercle.getRayon(), this.cercle.getCentre().getY() - this.cercle.getRayon(), diametre, diametre);
	}
	
	

	

}
