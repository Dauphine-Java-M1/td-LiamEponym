package model;

import java.util.ArrayList;

public class World {
	private ArrayList<Shape> formes;
	
	public World() {
		this.formes = new ArrayList<Shape>();
	}
	
	public void addForme(Shape s) {
		this.formes.add(s);
	}
}
