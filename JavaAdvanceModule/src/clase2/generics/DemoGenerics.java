package clase2.generics;

import java.util.ArrayList;
import java.util.List;

public class DemoGenerics {
	public static void main(String[] args) {
		Generics1<Integer> gInt = new Generics1<>(5);
		Generics1<String> gString = new Generics1<>("Hola");

		List<Generics1> genericList = new ArrayList<>();
		genericList.add(gInt);
		genericList.add(gString);

		genericList.forEach(g -> {
			System.out.println(g.toString());
		});

		Generics2<Integer, String> genTipos = new Generics2<>(10, "Java");
		System.out.println("\nValor = " + genTipos.getDato1());
		System.out.println("Valor = " + genTipos.getDato2());
		genTipos.mostrarTipos();
	}
}
