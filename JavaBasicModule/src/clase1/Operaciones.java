package clase1;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		int a, b;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el valor de A = ");
		a = lector.nextInt(); // Usamos nextInt porque se captura un tipo entero
		System.out.println("Ingresa el valor de B = ");
		b = lector.nextInt();
		System.out.println("\nSuma de " + a + " + " + b + " = " + (a + b));
		System.out.println("\nResta de " + a + " - " + b + " = " + (a - b));
		System.out.println("\nMultiplicaci�n de " + a + " * " + b + " = " + (a * b));
		System.out.println("\nDivis�n de " + a + " / " + b + " = " + (a / b));
		System.out.println("\nM�dulo de " + a + " % " + b + " = " + (a % b));
		
		lector.close();
	}

}
