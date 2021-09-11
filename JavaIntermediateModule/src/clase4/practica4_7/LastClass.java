package clase4.practica4_7;

public class LastClass {

	public static void main(String[] args) {
		String str1 = new String("Clase Object");
		String str2 = "Clase Object";

		if (str1 == str2)
			System.out.println("Las referencias son al mismo objeto.");
		else
			System.out.println("Las referencias no son al mismo objeto.");

		if (str1.equals(str2))
			System.out.println("El contenido es el mismo");
		else
			System.out.println("El contenido no es el mismo");
	}
}
