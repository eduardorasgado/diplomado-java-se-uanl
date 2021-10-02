package clase2.util;

import java.util.ArrayList;

/**
 * ArrayList es parte del Framework de Collections
 * @author fermf
 *
 */
public class EjemploArrayList {
	public static void main(String[] args) {
		ArrayList aList1 = new ArrayList();	// Acepta cualquier tipo de dato
		ArrayList<String> aList2 = new ArrayList<>(); // Solo acepta String
		
		// Mostramos capacidad inicial
		System.out.println("Capacidad inicial: " + aList1.size());
		
		// Insertamos datos al ArrayList
		aList1.add("Java");
		aList1.add(54);
		aList1.add("Collections");
		aList1.add(new Persona("Claudia", 31));
		aList1.add(245.5);
		aList1.add(2, false);
		
		// Mostrar capacidad actual
		System.out.println("Capacidad actual: " + aList1.size());
		System.out.println("Contenido de ArrayList 1: ");
		for (Object a : aList1) {
			System.out.println(a);
		}
	}
}