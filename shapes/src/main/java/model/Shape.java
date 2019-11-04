package model;

import view.IDrawer;

public abstract class Shape {
	protected IDrawer drawer;
	
//	public Shape(IDrawer drawer) {
//		this.drawer = drawer;
//	}
//	
	public void draw() {
		this.drawer.draw();
	}
}
