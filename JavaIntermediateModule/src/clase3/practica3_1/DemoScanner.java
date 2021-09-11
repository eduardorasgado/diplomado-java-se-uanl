package clase3.practica3_1;

import java.util.Scanner;

public class DemoScanner {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Introduzca un número entero: ");
		n = sc.nextInt();
		System.out.println("El entero es: " + n);
		
		double x;
		System.out.println("Introduzca número de tipo double: ");
		x = sc.nextDouble();
		System.out.println("El num double: " + x);
		
		String s;
		System.out.println("Introduzca texto:");
		sc.next();
		s = sc.nextLine();
		System.out.println("El texto es: " + s);
		
		long ln;
		System.out.println("Introduzca un número: ");
		ln = sc.nextLong();
		System.out.println("El num long es: " + ln);
	}

}
