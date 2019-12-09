package fr.dauphine.ja.kormannliam.threads;

import java.util.ArrayList;

public class MySafeList extends ArrayList<Double>{
	
	
	@Override
	public boolean add(Double e) {
		// TODO Auto-generated method stub
		return super.add(e);
	}
	
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}
	
	@Override
	public Double get(int index) {
		// TODO Auto-generated method stub
		return super.get(index);
	}
	
	public static void stressTest(int n, int m) {
		MySafeList list = new MySafeList();
		for (int i =0; i<n; i++) {
			Thread t = new Thread();
			
		}
	}
}
