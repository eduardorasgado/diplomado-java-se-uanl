package clase3.practica3_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Scanner02 {

	private static String fileName;

	public static void main(String[] args) throws IOException {
		try {
			fileName = System.getProperty("user.dir").concat(System.getProperty("file.separator")).concat("src")
					.concat(System.getProperty("file.separator")).concat("clase3")
					.concat(System.getProperty("file.separator")).concat("practica3_3")
					.concat(System.getProperty("file.separator")).concat("Archivo.txt");

			System.out.println("Leyendo documento: " + fileName);
			System.out.println("Contenido del documento: \n");

			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String strCurrentLine;

			while ((strCurrentLine = br.readLine()) != null) {
				System.out.println(strCurrentLine);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("\nTermina el programa");
		}
	}
}
