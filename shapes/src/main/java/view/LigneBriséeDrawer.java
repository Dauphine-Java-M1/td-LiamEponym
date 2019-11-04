package view;

import java.awt.Graphics;

import model.LigneBrisée;
import model.Point;
import model.Shape;

public class LigneBriséeDrawer implements IDrawer {
	private LigneBrisée ligne;
	
		
	public void draw() {
		Graphics g = null;
		for (int i = 1; i<this.ligne.getListePoints().size(); i++) {
			g.drawLine(this.ligne.getListePoints().get(i-1).getX(), this.ligne.getListePoints().get(i-1).getY(), this.ligne.getListePoints().get(i).getX(), this.ligne.getListePoints().get(i).getY());
		}
	}

	public void setShape(Shape s) {
		this.ligne = (LigneBrisée)s;
		
	}

}
