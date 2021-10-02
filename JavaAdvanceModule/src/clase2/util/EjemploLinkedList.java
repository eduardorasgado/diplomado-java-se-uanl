package clase2.util;

import java.util.Collections;
import java.util.LinkedList;

public class EjemploLinkedList {

	public static void main(String[] args) {
		LinkedList<Double> lista = new LinkedList<>();
		lista.add(24.4);
		lista.add(28.56);
		lista.add(30.5);
		lista.addFirst(33.27);
		lista.addLast(26.44);
		
		for(Double n : lista) System.out.println(n);
		
		System.out.println("Primer elemento: " + lista.getFirst());
		System.out.println("Último elemento: " + lista.getLast());
		
		Collections.sort(lista);
		System.out.println("\nLista ordenada en ascendente: ");
		for(Double n : lista) System.out.println(n);
		
		Collections.reverse(lista);
		System.out.println("\nLista ordenada en descendente: ");
		for(Double n : lista) System.out.println(n);
		
		System.out.println("Valor máximo: " + Collections.max(lista));
		System.out.println("Valor mínimo: " + Collections.min(lista));
	}

}
