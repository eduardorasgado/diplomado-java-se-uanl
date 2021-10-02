package clase2.util;

import java.util.Formatter;

public class EjemploFormato {
	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		
		fmt.format("Formatear %s es sencillo %d %f", "con Java", 10, 98.6);
		System.out.println(fmt);
		fmt.close();
	}
}
