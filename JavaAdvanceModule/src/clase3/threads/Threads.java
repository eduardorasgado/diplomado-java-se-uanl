package clase3.threads;

public class Threads implements Runnable{
	String nombre;
	long velocidad;
	Thread t;
	
	public Threads(String nombre, long velocidad) {
		this.nombre = nombre;
		this.velocidad = velocidad;
		t = new Thread(this, nombre);
		System.out.println("Nuevo thread: " + t);
	}

	@Override
	public void run() {
		try {
			for(int i = 6; i > 0; i--) {
				System.out.println(nombre + ": " + i);
				Thread.sleep(velocidad);
			}
		} catch(InterruptedException ex) {
			System.out.println("Thread interrumpido");
		}
		
		System.out.println("Saliendo del thread: " + nombre);
	}
	
	
}
