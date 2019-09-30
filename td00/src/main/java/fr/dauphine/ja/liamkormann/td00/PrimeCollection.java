package fr.dauphine.ja.liamkormann.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection {
	private ArrayList<Integer> numbers;
	
    public static void main( String[] args )
    {
        PrimeCollection collection = new PrimeCollection();
        collection.initRandom(100, 2000);
        collection.printPrimes();
    }
  public PrimeCollection() {
	this.numbers = new ArrayList<Integer>();
  }
  
  public void initRandom(int n, int m) {
	  Random r = new Random();  
	  for (int i = 0 ; i < n; i++) {
		  int nombreAleatoire = r.nextInt(m+1);
		  this.numbers.add(nombreAleatoire);
	  }
  }
  
  private boolean isPrime(int p) {
	  boolean isPrime = true;
	for (int i = 2; i<Math.round(Math.sqrt(p)); i++) {
		if ((p%i)==0){
			//System.out.println(i + " est diviseur");
			//isPrime = false;
			return false;
		}
	}
	return isPrime;
  }
  
  public void printPrimes() {
	  for (int nombre : numbers) {		 
		  if (isPrime(nombre)) {
			  System.out.println(nombre);
		  }
	  }
  }
  
}
