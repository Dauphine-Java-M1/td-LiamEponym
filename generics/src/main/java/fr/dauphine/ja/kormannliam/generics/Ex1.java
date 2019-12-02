package fr.dauphine.ja.kormannliam.generics;

import java.util.List;

public class Ex1 {
	
//Version 1.4
//	private static int myMax(int i0,int... args) {
//		int max = i0; //Permet d'obliger un argument
//		for (int i : args) {
//			if (i>max) {
//				max = i;
//			}
//			
//		
//		}
//		return max;		
//	}
//	
	//1.5
	public static <T extends Comparable<T>>T myMax(T o, T... objects){
		T max = o;
		for (T ob : objects) {
			if(max.compareTo(ob)<0) {
				max = ob;
			}
		}
		return max;
	}
	
	
	public static void main( String[] args )
    {
    	System.out.println(myMax(42,1664)); //1664
    	System.out.println(myMax(2014,86,13)); //2014
    	System.out.println(myMax(8.6,16.64)); //16.64
    	System.out.println(myMax("baa", "aba")); //aba
    	//System.out.println(myMax(8.6, "aba")); // ko !
    }

	
}
