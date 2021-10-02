package clase2.util;

import java.util.StringTokenizer;

public class EjemploStringTokenizer {
	public static  String registro = "";
	
	public static void main(String[] args) {
		String frase = "En el curso de Java Avanzado se revisan los temas de Colecciones, Threads, Swing y JDBC";
		int cont = 1;
		
		StringTokenizer st = new StringTokenizer(frase);
		
		while(st.hasMoreTokens()) {
			String palabra = st.nextToken();
			System.out.println("Palabra " + cont++ + " = " + palabra);
		}
		
		String registro = "title=Java Complete Reference;" +
				"author=Schildt;" + "publisher=Oracle Press;" + "copyright=2019";
		
		System.out.println();
		st = new StringTokenizer(registro, "=;");
		while(st.hasMoreTokens()) {
		String key = st.nextToken();
		String val = st.nextToken();
		System.out.println(key + ": " + val);
		}
	}
}
