package model;

import java.util.ArrayList;

public class Point {
	private final int x;
	private final int y;
	

	private static int COMPTEUR =0;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		++COMPTEUR;
	}
	
	public Point(Point point) {
		this.x = point.getX();
		this.y = point.getY();
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
//	public void setX(int x) {
//		this.x = x;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
	
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}
	
	public boolean isSameAs(Point point) {
		if (this.getX()==point.getX() && this.getY() == point.getY()) {
			return true;
		}else return false;
	}
	
	public boolean equals(Point p) {
		return this.isSameAs(p);
	}
	
	public Point translate(int dx, int dy) {
		return new Point(this.getX()*dx,this.getY()*dy);
		
	}
	
   public static void main( String[] args )
    {
       Point p1 = new Point(1,2);
       Point p2 = p1;
       Point p3 = new Point(1,2);
      
       ArrayList<Point> list = new ArrayList<Point>();
       list.add(p1);
       System.out.println(list.indexOf(p2));
       System.out.println(list.indexOf(p3));
    }
   
   
}
