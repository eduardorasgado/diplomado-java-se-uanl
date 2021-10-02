package clase2.util;

import java.util.Calendar;
import java.util.Formatter;

public class EjemploFormatoFecha {
	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
		
		// Hora en formato de 12 horas
		fmt.format("%tr", cal);
		System.out.println("Tiempo en formato de 12 horas: " + fmt);
		fmt.close();
		
		// Información completa de fecha y hora
		fmt = new Formatter();
		fmt.format("%tc", cal);
		System.out.println("Fecha en formato completo: " + fmt);
		fmt.close();
	}
}
