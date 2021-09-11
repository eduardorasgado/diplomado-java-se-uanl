package clase4.practica4_6;

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
		File ruta = new File(System.getProperty("user.dir") + separator + "src" + separator + "clase4" + separator
				+ "practica4_6" + separator + "Archivos");

		try {
			File file = new File(ruta + separator + "Persona.dat");

			System.out.println(file.getCanonicalPath());

			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			Persona person = new Persona();

			do {
				person = (Persona) ois.readObject();

				System.out.println(person.toString());
			} while (true);
		}

		catch (FileNotFoundException ex) {
			System.out.println("El archivo no existe");
			ex.printStackTrace();
		}

		catch (EOFException ex) {
			ois.close();
			System.out.println("Fin del archivo");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("La clase es inválida o no existe");
			ex.printStackTrace();
		}
	}
}
