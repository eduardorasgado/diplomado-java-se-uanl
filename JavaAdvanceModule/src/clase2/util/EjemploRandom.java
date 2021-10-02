package clase2.util;

import java.util.Random;

public class EjemploRandom {
	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random(50);
		
		System.out.println("Grupo aleatorio 1:");
		for (int i = 0; i < 5; i++) {
			// System.out.println("Valor: " + r1.nextInt()); // Genera un número aleatorio dentro de la capacidad completa de int
			System.out.println("Valor: " + r1.nextInt(20)); 
		}
		
		System.out.println("\nGrupo aleatorio 2:");
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor: " + r2.nextInt(20)); 
		}
		
		System.out.println("\nGrupo aleatorio 3: ");
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor: " + Math.random()); 
		}
	}
}