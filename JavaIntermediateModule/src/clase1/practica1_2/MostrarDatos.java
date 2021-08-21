package clase1.practica1_2;

public class MostrarDatos {
	public static void main(String[] args) {
		Tigre t1 = new Tigre();
		Tigre t2 = new Tigre();

		t1.tamano = "Grande";
		t1.color = "Amarillo con rayas";
		t1.tipo = "Tigre de Bengala";

		t2.tamano = "Muy grande";
		t2.color = "Amarillo con rayas y blanco con rayas";
		t2.tipo = "Tigre de sumatra";

		System.out.println("Informacion para tigre 1: ");
		t1.mostrarTipo();
		System.out.println("El tamaño es: " + t1.tamano + " el color es: " + t1.color);
		System.out.println();
		System.out.println("Informacion para tigre 2: ");
		t2.mostrarTipo();
		System.out.println("El tamaño es: " + t2.tamano + " el color es: " + t2.color);
		System.out.println();
	}
}
