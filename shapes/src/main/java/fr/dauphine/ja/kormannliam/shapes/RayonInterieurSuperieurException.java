package fr.dauphine.ja.kormannliam.shapes;

public class RayonInterieurSuperieurException extends Exception {

	public RayonInterieurSuperieurException() {
		System.err.println("Le rayon interieur est superieur au rayon");
	}
}
