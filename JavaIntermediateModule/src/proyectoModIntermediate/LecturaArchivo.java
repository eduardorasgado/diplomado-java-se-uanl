package proyectoModIntermediate;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaArchivo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		String separator = System.getProperty("file.separator");
		File ruta = getFilePath(separator);

		try {
			File file = new File(ruta + separator + "Vehiculo.dat");

			System.out.println(file.getCanonicalPath());

			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			Vehiculo vehicle = new Vehiculo();

			do {
				vehicle = (Vehiculo) ois.readObject();

				System.out.println(vehicle.toString());
			} while (true);
		} catch (FileNotFoundException ex) {
			System.out.println("El archivo no existe");
			ex.printStackTrace();
		} catch (EOFException ex) {
			ois.close();
			System.out.println("Fin del archivo");
		} catch (ClassNotFoundException ex) {
			System.out.println("La clase es inválida o no existe");
			ex.printStackTrace();
		}
	}

	private static File getFilePath(String separator) {
		return new File(System.getProperty("user.dir") + separator + "src" + separator + "proyectoModIntermediate"
				+ separator + "Archivos");
	}
}
