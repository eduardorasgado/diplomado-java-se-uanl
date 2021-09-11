package clase3.tareas3;

import java.io.File;
import java.util.Scanner;

public class Archivo02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String separator = System.getProperty("file.separator");
		
		File ruta = new File(
				System.getProperty("user.dir") 
				+ separator 
				+ "src" 
				+ separator 
				+ "clase3" 
				+ separator 
				+ "tareas3"
				+ separator
				+ "Archivos"
				+ separator);
		String nombre;
		System.out.println("Introduce el nombre del archivo a eliminar: ");
		nombre = scanner.nextLine();
		System.out.println(ruta);
		File file = new File(ruta, nombre);
		System.out.println("file.getAbsolutePath()" + ruta.getAbsolutePath());
		System.out.println("file.getParent()" + ruta.getParent());
		System.out.println("file.getAbsolutePath()" + file.getAbsolutePath());
		System.out.println("file.getParent()" + file.getParent());
		if(!file.exists()) {
			System.out.println("Archivo " + file.getName() + " no existe.");
		} else {
			System.out.println("Archivo " + file.getName() + " existe.");
			System.out.println("Archivo " + file.length() + " bytes");
			if(!file.delete()) {
				System.out.println("El archivo no se ha podido eliminar");
			} else {
				System.out.println("Archivo eliminado");
			}
		}
	}

}
