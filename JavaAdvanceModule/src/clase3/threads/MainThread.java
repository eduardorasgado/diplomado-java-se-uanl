package clase3.threads;

public class MainThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Thread actual es: " + t.getName());
		t.setName("runnable thread");
		System.out.println("Nuevo nombre del thread es: " + t.getName());
		
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("Ciclo " + i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException ex) {
			System.out.println("Thread interrumpido");
		}
		
		System.out.println("--------------------");
		
		Threads newThread = new Threads("[Eduardo]", 500);
		newThread.run();
	}

}
