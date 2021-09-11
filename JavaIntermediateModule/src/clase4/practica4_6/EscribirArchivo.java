package clase4.practica4_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EscribirArchivo {

	public static void main(String[] args) {
		String nombre = "";
		String apellidoPaterno = "";
		String apellidoMaterno = "";
		String direccion = "";
		Persona person;
		Scanner scanner = new Scanner(System.in);
		FileOutputStream fos = null;

		String separator = System.getProperty("file.separator");
		StringBuilder ruta = new StringBuilder();
		ruta.append(System.getProperty("user.dir"));
		ruta.append(separator);
		ruta.append("src");
		ruta.append(separator);
		ruta.append("clase4");
		ruta.append(separator);
		ruta.append("practica4_6");
		ruta.append(separator);
		ruta.append("Archivos");

		System.out.println("Datos de la persona");
		System.out.println();
		System.out.println("Nombre: ");
		nombre = scanner.nextLine();
		System.out.println("Apellido Paterno: ");
		apellidoPaterno = scanner.nextLine();
		System.out.println("Apellido Materno: ");
		apellidoMaterno = scanner.nextLine();
		System.out.println("Dirección: ");
		direccion = scanner.nextLine();

		person = new Persona(nombre, apellidoPaterno, apellidoMaterno, direccion);

		System.out.println();
		System.out.println("Datos ingresados: ");
		System.out.println(person.getNombre() + " " + person.getApPaterno() + " " + person.getApMaterno() + " "
				+ person.getDireccion());

		scanner.close();

		try {
			ruta.append(separator);
			ruta.append("Persona.dat");

			System.out.println("\nFichero de destino: ");
			System.out.println(ruta.toString());

			File file = new File(ruta.toString());
			fos = new FileOutputStream(file);
			ObjectOutput objectOutput = new ObjectOutputStream(fos);
			objectOutput.writeObject(person);

			System.out.println("\n----Registro agregado----");

			objectOutput.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Archivo no encontrado");
		} catch (IOException ex) {
			System.out.println("Error de escritura de archivo: ");
			ex.printStackTrace();
		}
	}
}
