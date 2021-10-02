package clase2.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class EjemploIterator {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		// Utilizamos iterador para mostrar contenido
		System.out.println("Contenido original de al: ");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String elemento = itr.next();
			System.out.print(elemento + " ");
		}
		System.out.println();
		
		// Modificamos valores del ArrayList
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			String elemento = litr.next();
			litr.set(elemento + "+");
		}
		
		System.out.println("\nContenido modificado de al: ");
		itr = al.iterator();
		while(itr.hasNext()) {
			String elemento = itr.next();
			System.out.print(elemento + " ");
		}
		System.out.println();
		
		// Mostrar los valores en reversa
		System.out.println("\nLista modificada en reversa:");
		while(litr.hasPrevious()) {
			String elemento = litr.previous();
			System.out.print(elemento + " ");
		}
		System.out.println();
	}
}
