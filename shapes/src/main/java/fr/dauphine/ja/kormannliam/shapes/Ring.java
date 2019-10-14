package fr.dauphine.ja.kormannliam.shapes;

public class Ring {
	private Point centre;
	private int rayon;
	private int rayonInterieur;
	
	public Ring(Point centre, int r, int ri) throws RayonInterieurSuperieurException {
		if (ri>r) {
			throw new RayonInterieurSuperieurException();
		}else {
			this.centre = centre;
			this.rayon = r;
			this.rayonInterieur = ri;
		}		
	}
	
	public boolean equals(Ring anneau) {
		
		if (this.getCentre().isSameAs(anneau.getCentre()) && this.getRayon() == anneau.getRayon() && this.getRayonInterieur() == anneau.getRayonInterieur()) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return ("centre :" + this.getCentre().toString() + "rayon : " + this.getRayon() + "rayon intérieur : " + this.getRayonInterieur());
	}

	public Point getCentre() {
		return centre;
	}

	public int getRayon() {
		return rayon;
	}

	public int getRayonInterieur() {
		return rayonInterieur;
	}

	
	
}
