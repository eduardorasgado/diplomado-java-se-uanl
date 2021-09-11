package clase3.practica3_2;

import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		double radio;
		int n;

		System.out.println("Introduzca su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Hola " + nombre + "!");

		System.out.println("Introduzaca el radio de la circunferencia: ");
		radio = sc.nextDouble();
		System.out.println("Longitud de la circunferencia: " + 2 * Math.PI * radio);

		System.out.println("Introduzca un número entero: ");
		n = sc.nextInt();
		System.out.println("El cuadrado es: " + Math.pow(n, 2));
	}
}
