package model;

import java.util.ArrayList;
import java.util.LinkedList;

import view.LigneBriséeDrawer;

public class LigneBrisée extends Shape {
	private int nbPointsMax;
	private LinkedList<Point> listePoints;
	//private LigneBriséeDrawer drawer;
	
	public LigneBrisée(int nbMax){		
		this.nbPointsMax = nbMax;
		this.listePoints = new LinkedList<Point>();	
		this.drawer = new LigneBriséeDrawer();
		this.drawer.setShape(this);
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

	public int getNbPointsMax() {
		return nbPointsMax;
	}

	public LinkedList<Point> getListePoints() {
		return listePoints;
	}

	
}
