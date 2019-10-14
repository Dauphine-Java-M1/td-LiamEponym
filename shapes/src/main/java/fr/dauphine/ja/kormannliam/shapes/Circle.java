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
		return ("centre : " + this.centre.toString() + " rayon : " + this.getRayon()) + "surface :" + this.surface();
	}
	
	public void translate(int dx, int dy) {
		this.centre = centre.translate(dx, dy);
	}
	
	public float surface() {
		return (float) (Math.PI * (this.rayon)*(this.rayon)); 
	}
	
	public boolean contains(Point p) {
		double norme = Math.sqrt((Math.pow(p.getX()-this.centre.getX(), 2)) + Math.pow(p.getY()-this.centre.getY(), 2));
		if (norme > this.rayon) {
			return false;
		}else return true;
	}
	
	public static boolean contains(Point p, Circle...circles) {
		boolean contained = false;
		for (Circle c : circles) {
			if (c.contains(p)){
				contained = true;
			}
		}
		return contained;
	}
}
