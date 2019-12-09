package fr.dauphine.ja.kormannliam.threads;

public class ThreadTest {
	private static int nbIterations;
	private static final Object monitor = new Object();
	public static Runnable run10000(final int id) {
		return new Runnable() {
			
			public void run() {
				
				while(nbIterations<10000) {
					synchronized(monitor) {
						++nbIterations;
						if(nbIterations<=10000) {
							System.out.println("Je suis le thread " + id + " et j'effectue l'itération " + nbIterations);
						}
					}
				}
				
			}
		};
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(run10000(1));
		Thread t2 = new Thread(run10000(2));
		t1.start();
		t2.start();
	}
}
