package fr.dauphine.ja.kormannliam.shapes;

import java.util.ArrayList;
import java.util.LinkedList;

public class LigneBrisée {
	private int nbPointsMax;
	private LinkedList<Point> listePoints;
	
	public LigneBrisée(int nbMax){
		this.nbPointsMax = nbMax;
		this.listePoints = new LinkedList<Point>();		
	}
	
	public void add(Point p) {
		this.listePoints.add(p);
	}
	
	public int pointCapacity() {
		return this.nbPointsMax;
	}
	
	public int nbPoints() {
		return this.listePoints.size();
	}
	
	public boolean contains(Point p) {
		for (Point point : this.listePoints) {
			if (p.isSameAs(point)){
				return true;
			}
		}
		return false;
	}
	
}
