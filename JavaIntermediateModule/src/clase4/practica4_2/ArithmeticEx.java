package clase4.practica4_2;

public class ArithmeticEx {

	public static void main(String[] args) {
		int valor1 = 10;
		int valor2 = 0;
		double resultado;
		try {
			resultado = valor1 / valor2;
			System.out.println("El resultado de la división es: " + resultado);
		} catch(ArithmeticException ex) {
			System.out.println("No se puede dividir por cero: " + ex.getMessage());
		}
		System.out.println("Continúa la ejecución del programa");
	}
}
