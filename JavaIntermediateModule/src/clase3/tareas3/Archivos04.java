package clase3.tareas3;

import java.io.File;
import java.io.IOException;

public class Archivos04 {

	public static void main(String[] args) throws IOException {
		String separator = System.getProperty("file.separator");
		File file = new File(".." + separator + ".." + separator + "Archivos");
		String dirActual = System.getProperty("user.dir");
		System.out.println("Directorio Actual:   " + dirActual);
		System.out.println("getPath(): 			 " + file.getPath());
		System.out.println("getAbsolutePath():   " + file.getAbsolutePath());
		System.out.println("getCannonicaPath():  " + file.getCanonicalPath());
	}

}
