package fr.dauphine.ja.kormannliam.shapes;

public class Ring {
	private Circle cercleExterieur;
	private int rayonInterieur;
	
	public Circle getCercleExterieur() {
		return cercleExterieur;
	}

	public int getRayonInterieur() {
		return rayonInterieur;
	}

	public Ring(Point p, int rayonExt, int rayonInt) {
		this.cercleExterieur = new Circle(p, rayonExt);
		this.rayonInterieur = rayonInt;
	}
	
	
	
	public boolean equals(Ring anneau) {
		if (this.cercleExterieur.equals(anneau.getCercleExterieur()) && this.getRayonInterieur()==anneau.getRayonInterieur()) {
			return true;			
		}else return false;
	}
	
	public String toString() {
		return this.cercleExterieur.toString() + "rayon interne : " + this.getRayonInterieur();
	}
	
	public boolean contains(Point p) {
		//Circle cercleInt = new Circle(this.getCercleExterieur().getCentre(), this.getRayonInterieur());
		if (this.getCercleExterieur().contains(p) && (Math.sqrt((Math.pow(p.getX()-this.getCercleExterieur().getCentre().getX(), 2)) + Math.pow(p.getY()-this.getCercleExterieur().getCentre().getY(), 2)))>this.getRayonInterieur()) {
			return true;
		}else return false;
	}
	
	public boolean contains(Point p, Ring...rings) {
		boolean contained = false;
		for (Ring r : rings) {
			if (r.contains(p)) {
				contained =true;
			}
		}
		return contained;
	}
	
}
