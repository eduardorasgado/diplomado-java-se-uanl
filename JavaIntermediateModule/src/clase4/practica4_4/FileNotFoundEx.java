package clase4.practica4_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundEx {

	public static void main(String[] args) {
		File file = new File("E://file.txt");
		FileReader fr;
		try {
			fr = new FileReader(file);
			fr.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Exception thrown: " + ex);
		} catch(IOException ex) {
			System.out.println("Error tratando de cerrar el file reader");
		}
	}

}
