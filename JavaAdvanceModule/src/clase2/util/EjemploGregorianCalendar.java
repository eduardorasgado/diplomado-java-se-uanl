package clase2.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EjemploGregorianCalendar {
	public static void main(String[] args) {
		String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Octubre", "Nov", "Dic"};
		int year;
		
		GregorianCalendar gc = new GregorianCalendar();
		// Fecha
		System.out.print("Fecha: ");
		System.out.print(meses[gc.get(Calendar.MONTH)]);
		System.out.print(" " + gc.get(Calendar.DATE) + " ");
		System.out.print(year = gc.get(Calendar.YEAR));
		
		// Tiempo
		System.out.print("\nTiempo: ");
		System.out.print(gc.get(Calendar.HOUR) + ":");
		System.out.print(gc.get(Calendar.MINUTE) + ":");
		System.out.print(gc.get(Calendar.SECOND));
		
		// Año bisiesto
		if(gc.isLeapYear(year)) {
			System.out.println("\nEl año actual es bisiesto");
		} else {
			System.out.println("\nEl año actual no es bisiesto");
		}
		
		GregorianCalendar gc2 = new GregorianCalendar(1986, 9, 24);
		System.out.print("\n" + meses[gc2.get(Calendar.MONTH)]);
		System.out.print(" " + gc2.get(Calendar.DATE) + " ");
		System.out.print(year = gc2.get(Calendar.YEAR));
		
		long interval = gc.getTimeInMillis() - gc2.getTimeInMillis();
		Date diferencia = new Date(interval);
		System.out.println("\n Fecha diferencia = " + diferencia);
	}
}
