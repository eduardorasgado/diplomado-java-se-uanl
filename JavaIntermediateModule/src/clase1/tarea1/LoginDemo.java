package clase1.tarea1;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		/**
		 * Pedir usuario y contrasena y en base a ese user y pass y validar valores que
		 * teclea el usuario, si es un usuario y pass indicada entonces entrar al menu,
		 * pero si no es, entonces validar intentos y si no, sacar al usuario se va a
		 * decir si esta en contabilidad o en finanzas y en escolar 4. salir
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		LoginDemo login = new LoginDemo();
		login.runLogin("eduardoRasgado", "p4ssw0rd", scanner);
	}

	private void runLogin(String validUser, String validPassword, Scanner scanner) {
		LoginValidator loginValidator = new LoginValidator(0, 4, scanner, validUser, validPassword);
		do {
			if (loginValidator.validateCredentials()) {
				System.out.println("Bienvenido al sistema. ");
				showMenu(scanner);
			} else {
				System.out.println("Sus credenciales son incorrectas");
				System.out.println(
						"Intentos: " + loginValidator.getCurrentAttempts() + " de " + loginValidator.getMaxAttempts());
			}
		} while (loginValidator.isValidationPermitted() && !loginValidator.isValidated());
		System.out.println("Saliendo del sistema...");
	}

	private void showMenu(Scanner scanner) {
		boolean exit = false;
		while(!exit) {
			System.out.println("Seleccione una opción: ");
			
			System.out.println("1. Contabilidad");
			System.out.println("2. Finanzas");
			System.out.println("3. Escolar");
			System.out.println("4. Salir");
			int selection = scanner.nextInt();
			switch (selection) {
			case 1:
				System.out.println("Seleccionó contabilidad");
				System.out.println();
				break;
			case 2:
				System.out.println("Seleccionó Finanzas");
				System.out.println();
				break;
			case 3:
				System.out.println("Seleccionó Escolar");
				System.out.println();
				break;
			case 4:
				System.out.println("Seleccionó salir");
				System.out.println("Hasta luego!");
				System.out.println();
				exit = true;
				break;
			default:
				System.out.println("Seleccion inválida");
				break;
			}
		}
	}
}
