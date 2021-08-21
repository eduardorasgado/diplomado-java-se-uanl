package clase1.practica1_1;

import java.util.Scanner;

public class Inicial {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Inicial inicial = new Inicial();
		inicial.showMenu();
	}

	private void showMenu() {
		Double firstValue;
		Double secondValue;
		Double result;
		String operation;

		boolean exit = false;
		int option;
		do {
			System.out.println("Calculadora Basica");
			System.out.println("");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Mutiplicacion");
			System.out.println("4. Division");
			System.out.println("5. Salir");
			System.out.println("");
			System.out.println("Selecciona la opcion deseada");
			operation = scanner.nextLine();
			option = Integer.parseInt(operation);
			Operaciones op = new Operaciones();
			if (option > 0 && option <= 5) {
				switch (option) {
				case 1:
					System.out.println("Dame el primer valor: ");
					firstValue = Double.parseDouble(scanner.nextLine());
					System.out.println("Dame el segundo valor: ");
					secondValue = Double.parseDouble(scanner.nextLine());
					result = op.add(firstValue, secondValue);
					System.out.println("El resultado de la suma es: " + result);
					System.out.println("");
					System.out.println("");
					System.out.println("");
					break;
				case 2:
					System.out.println("Dame el primer valor: ");
					firstValue = Double.parseDouble(scanner.nextLine());
					System.out.println("Dame el segundo valor: ");
					secondValue = Double.parseDouble(scanner.nextLine());
					op.substract(firstValue, secondValue);
					System.out.println();
					System.out.println();
					System.out.println();
					break;
				case 3:
					result = op.multiplicate();
					System.out.println("El resultado de la multiplicacion es: " + result);
					System.out.println();
					System.out.println();
					System.out.println();
					break;
				case 4:
					op.divide();
					System.out.println();
					System.out.println();
					System.out.println();
					break;
				case 5:
					scanner.close();
					System.out.println("Hasta luego, cerrando programa. ");
					exit = true;
					break;
				default:
					System.out.println("");

				}
			}
		} while (!exit);
	}

}
