package view;

import java.awt.Graphics;

import model.LigneBrisée;
import model.Point;

public class LigneBriséeDrawer implements IDrawer {
	private LigneBrisée ligne;
	
	public void draw() {
		Graphics g = null;
		for (Point p : this.ligne.getListePoints()) {
			
		}
	}

}
