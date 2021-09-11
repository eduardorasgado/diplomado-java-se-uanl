package clase3.tareas3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Archivos05 {

	public static void main(String[] args) {
		try {
			File inputFile = new File("archivos.txt");
			File outputFile = new File("salida.txt");
			
			System.out.println(inputFile.getAbsolutePath());
			
			FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile);
			
			int c;
			while((c = fis.read()) != -1) {
				fos.write(c);
			}
			fis.close();
			fos.close();
		} catch(FileNotFoundException ex) {
			System.err.println("FileStreamsTest" + ex);
		} catch(IOException ex) {
			System.err.println("FileStreamsText" + ex);
		}
	}

}
