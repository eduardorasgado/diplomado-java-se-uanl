package clase3.tareas3;

import java.io.File;

public class Archivo03 {
	public static void main(String[] args) {
		File directorio = new File(".");
		String[] lista = directorio.list();
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
}
