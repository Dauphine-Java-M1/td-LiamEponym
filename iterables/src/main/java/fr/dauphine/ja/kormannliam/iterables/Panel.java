package fr.dauphine.ja.kormannliam.iterables;

import java.util.AbstractList;
import java.util.Iterator;

public class Panel extends AbstractList<Integer>{
	private int lowerBound,upperBound;
	
	public Panel(int lb, int up) {
		this.lowerBound = lb;
		this.upperBound = up;
	}
	public static Iterator<Integer> panel1(final int lb, final int ub) {
		return new Iterator<Integer>() {
			private int position = lb;
			
			public boolean hasNext() {
				return(position<=ub);
			}

			public Integer next() {
				if (this.hasNext()) {
					return position++;
				};
				return null;
			}
		};
	}
	

	
//	public static Iterable panel2(final int lb, final int ub) {
//		return new <? extends AbstractList>{
//			
//		};
//				
//	}
	
	 public static void main( String[] args )
	    {
		 	System.out.println("Output 1");
	    	Iterator<Integer> it=panel1(1,5);
	    	for(;it.hasNext();System.out.println(it.next())); // affiche 1 2 3 4 5
	    	System.out.println("Output 2");
//	    	for(int i:panel2(1,5)) {
//	    		System.out.println(i); // affiche 1 2 3 4 5
//	    	}
	    }



	@Override
	public Integer get(int arg) {
		return this.lowerBound + arg;
	}



	@Override
	public int size() {
		return this.upperBound - this.lowerBound+1;
	}






	

	

}
