package clase1.practica1_1;

import java.util.Scanner;

public class Operaciones {
	private Scanner sc = new Scanner(System.in);
	private double firstNumber = 0;
	private double secondNumber = 0;
	private double result = 0;

	public double add(double value1, double value2) {
		result = value1 + value2;
		return result;
	}

	public void substract(double value1, double value2) {
		result = value1 - value2;
		System.out.println("El resultado de la resta es: " + result);
	}

	public double multiplicate() {
		System.out.println("Dame el primer numero: ");
		firstNumber = Double.parseDouble(sc.nextLine());
		System.out.println("Dame el segundo numero: ");
		secondNumber = Double.parseDouble(sc.nextLine());
		result = firstNumber * secondNumber;
		return result;
	}

	public void divide() {
		System.out.println("Dame el primer numero: ");
		firstNumber = Double.parseDouble(sc.nextLine());
		System.out.println("Dame el segundo numero: ");
		secondNumber = Double.parseDouble(sc.nextLine());
		result = firstNumber / secondNumber;
		System.out.println("El resulado de la division es: " + result);
	}
}
