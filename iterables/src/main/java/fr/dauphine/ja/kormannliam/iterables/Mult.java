package fr.dauphine.ja.kormannliam.iterables;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Mult {
	public static List mult(final int x, final List<Integer> liste){
		return new AbstractSequentialList() {
			private Iterator<Integer> it =liste.iterator();
			
			@Override
			public ListIterator listIterator(int arg0) {
				final ListIterator<Integer> myLit = liste.listIterator(arg0);
				return new ListIterator<Integer>() {

					public void add(Integer arg0) {
						myLit.add(arg0);
					}

					public boolean hasNext() {
						return myLit.hasNext();					}

					public boolean hasPrevious() {
						return myLit.hasPrevious();
					}

					public Integer next() {
						return myLit.next()*x;
					}

					public int nextIndex() {
						return myLit.nextIndex();
					}

					public Integer previous() {
						return myLit.previous();
					}

					public int previousIndex() {
						return myLit.previousIndex();
					}

					public void remove() {
						myLit.remove();
						
					}

					public void set(Integer arg0) {
						myLit.set(arg0);
					}
				}; 
			}

			@Override
			public int size() {
				return liste.size();
			}
		}; 
	}
	
	public static AbstractList<Integer> mult2(final int x, final ArrayList<Integer> liste){
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int arg0) {
				return liste.get(arg0)*x;
			}

			@Override
			public int size() {
				return liste.size();
			}
		};
	}
	
	public static AbstractList<Integer> mult3(final int x, final ArrayList<Integer> liste){
		if (liste instanceof RandomAccess) {
			return new AbstractList<Integer>() {

				@Override
				public Integer get(int arg0) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public int size() {
					// TODO Auto-generated method stub
					return 0;
				}
			};
		}else {
			return new AbstractSequentialList<Integer>() {

				@Override
				public ListIterator<Integer> listIterator(int arg0) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public int size() {
					// TODO Auto-generated method stub
					return 0;
				}
				
			};
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(6);
		l.add(16);
		List<Integer> res = mult2(2,l);
		for (int i : res) {
			System.out.println(i);
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}
		long t0 = System.nanoTime();
		List<Integer> ret = Mult.mult(2, al);
		long sum=0;
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}
		t0 = System.nanoTime();
		sum=0;ret = Mult.mult(2, ll);
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
	}
}
