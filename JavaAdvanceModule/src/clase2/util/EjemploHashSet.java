package clase2.util;

import java.util.HashSet;

public class EjemploHashSet {

	/**
	 * HashSet es una estructura no sincronizada, puede ser utilizado por múltiples threads
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Beta");
		hs.add("Alpha");
		hs.add("Eta");
		hs.add("Gama");
		hs.add("Epsilon");
		hs.add("Omega");
		
		System.out.println(hs);
	}
}
