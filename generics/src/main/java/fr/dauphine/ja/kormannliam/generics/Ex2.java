package fr.dauphine.ja.kormannliam.generics;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
	private static void print(List<?> list) {
		for(Object o:list)System.out.println(o);
	}
	
	public static void printLongueur(List<? extends CharSequence> list) {
		for (CharSequence obj : list) {
			System.out.println(obj.length());
		}
	}
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("foo", "toto");
		List<Integer> l2 = Arrays.asList(1,5);
		print(l2);
		printLongueur(list);
	}
	
}
