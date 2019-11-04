package view;

import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

import model.Ring;
import model.Shape;

public class RingDrawer implements IDrawer{
	private Ring ring;
	
	
	public void draw() {
//		Graphics g = null;
//		int diametre = this.ring.getCercleExterieur().getRayon()*2;
//		g.fillOval(this.ring.getCercleExterieur().getCentre().getX() - this.ring.getCercleExterieur().getRayon(), this.ring.getCercleExterieur().getCentre().getY() - this.ring.getCercleExterieur().getRayon(), diametre, diametre);
//		Area cercleInterne = new Area()
		
		//Shape ext = new Ellipse2D.Double(t)
	}

	public void setShape(Shape s) {
		this.ring = (Ring)s;
		
	}
	
}
