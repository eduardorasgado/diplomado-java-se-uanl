package proyectoModIntermediate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * Proyecto final de módulo 2: nivel intermedio Hacer el ejemplo de la persona
 * con un auto propiedades: marca, color y modelo
 * 
 * @author Eduardo Rasgado Ruiz
 *
 */
public class EscribirArchivo {
	private Scanner scanner;
	private Vehiculo vehicle;

	public EscribirArchivo(Scanner scanner) {
		this.scanner = scanner;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EscribirArchivo program = new EscribirArchivo(scanner);
		program.run();
	}

	private void run() {
		FileOutputStream fos = null;

		String separator = System.getProperty("file.separator");
		StringBuilder ruta = new StringBuilder();
		buildFilePath(ruta, separator);

		captureVehicleData();

		System.out.println();
		System.out.println("Datos ingresados: ");
		System.out.println(vehicle.toString());

		scanner.close();

		try {
			ruta.append(separator);
			ruta.append("Vehiculo.dat");

			System.out.println("\nFichero de destino: ");
			System.out.println(ruta.toString());

			File file = new File(ruta.toString());
			fos = new FileOutputStream(file);
			ObjectOutput objectOutput = new ObjectOutputStream(fos);
			objectOutput.writeObject(vehicle);

			System.out.println("\n----Registro agregado----");

			objectOutput.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Archivo no encontrado");
		} catch (IOException ex) {
			System.out.println("Error de escritura de archivo: ");
			ex.printStackTrace();
		}
	}

	private void buildFilePath(StringBuilder ruta, String separator) {
		ruta.append(System.getProperty("user.dir"));
		ruta.append(separator);
		ruta.append("src");
		ruta.append(separator);
		ruta.append("proyectoModIntermediate");
		ruta.append(separator);
		ruta.append("Archivos");
	}

	private void captureVehicleData() {
		String marca = "";
		String color = "";
		String modelo = "";

		System.out.println("Datos del vehículo");
		System.out.println();
		System.out.println("Marca: ");
		marca = scanner.nextLine();
		System.out.println("Color: ");
		color = scanner.nextLine();
		System.out.println("Modelo: ");
		modelo = scanner.nextLine();

		vehicle = new Vehiculo(marca, color, modelo);
	}
}
