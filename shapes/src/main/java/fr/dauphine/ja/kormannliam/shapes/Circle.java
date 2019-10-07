package fr.dauphine.ja.kormannliam.shapes;

public class Circle {
	private Point centre;
	private int rayon;
	
	public Circle(Point centre, int rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public Point getCentre() {
		return centre;
	}

	public int getRayon() {
		return rayon;
	}
	
	public String toString() {
		return ("centre : " + this.centre.toString() + " rayon : " + this.getRayon());
	}
}
