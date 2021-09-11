package clase3.practica3_4;

import java.io.File;
import java.io.IOException;

public class Archivos01 {

	public static void main(String[] args) throws IOException {
		String separator = System.getProperty("file.separator");
		File ruta = new File(
				System.getProperty("user.dir") + separator + "src" + separator + "clase3" + separator + "practica3_4");

		File f = new File(ruta, "file.txt");

		System.out.println("ruta props: ");
		System.out.println("Absolute path: " + ruta.getAbsolutePath());
		System.out.println("Parent: " + ruta.getParent());

		System.out.println("new file props: ");
		System.out.println("Absolute path: " + f.getAbsolutePath());
		System.out.println("Parent: " + f.getParent());

		
		if (!f.exists()) {
			System.out.println("Archivo " + f.getName() + " no existe");
			if (!ruta.exists()) {
				System.out.println("El directorio " + ruta.getName() + " no existe");
				if (ruta.mkdir()) {
					System.out.println("Directorio creado");
					if (f.createNewFile()) {
						System.out.println("Archivo " + f.getName() + " creado");
					} else {
						System.out.println("No se ha podido crear " + f.getName());
					}
				} else {
					System.out.println("No se ha podido crear " + ruta.getName());
				}
			} else {
				if (f.createNewFile()) {
					System.out.println("Archivo " + f.getName() + " creado");
				} else {
					System.out.println("No se ha podido crear " + f.getName());
				}
			}
		} else {
			System.out.println("Archivo " + f.getName() + " existe");
			System.out.println("Tamaño: " + f.length() + " bytes");
		}
	}

}
