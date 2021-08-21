package clase1.tarea1;

import java.util.Scanner;

public class LoginValidator {
	private int currentAttempts;
	private int maxAttempts;
	private Scanner scanner;
	private String validUser;
	private String validPassword;
	private boolean loginValidated;

	/**
	 * @param currentAttempts
	 * @param maxAttempts
	 * @param scanner
	 * @param validUser
	 * @param validPassword
	 */
	public LoginValidator(int currentAttempts, int maxAttempts, Scanner scanner, String validUser,
			String validPassword) {
		this.currentAttempts = currentAttempts;
		this.maxAttempts = maxAttempts;
		this.scanner = scanner;
		this.validUser = validUser;
		this.validPassword = validPassword;
	}

	public boolean validateCredentials() {
		currentAttempts++;
		System.out.println("Inserte usuario: ");
		String currUser = scanner.next();
		System.out.println("Inserte contrasena: ");
		String currPass = scanner.next();
		boolean validated = currUser.equals(validUser) && currPass.equals(validPassword);
		if (validated)
			loginValidated = validated;
		
		return validated;
	}

	public boolean isValidationPermitted() {
		return currentAttempts < maxAttempts;
	}

	public boolean isValidated() {
		return loginValidated;
	}

	/**
	 * @return the currentAttempts
	 */
	protected int getCurrentAttempts() {
		return currentAttempts;
	}

	/**
	 * @return the maxAttempts
	 */
	protected int getMaxAttempts() {
		return maxAttempts;
	}

}
