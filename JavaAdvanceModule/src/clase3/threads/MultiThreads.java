package clase3.threads;

public class MultiThreads {

	public static void main(String[] args) {
		System.out.println("Iniciando main thread: ");
		
		Threads t1 = new Threads("Uno", 500);   // x6 -> 3000
		Threads t2 = new Threads("Dos", 1000);  // x6 -> 6000
		Threads t3 = new Threads("Tres", 1500); // x6 -> 9000
		
		t1.t.start();
		t2.t.start();
		t3.t.start();
		
		try {
			Thread.sleep(10000);
		} catch(InterruptedException ex) {
			System.out.println("Main Thread interrumpido");
		}
		
		System.out.println("Saliendo de main thread...");
	}

}
