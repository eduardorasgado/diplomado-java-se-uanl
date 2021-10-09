package clase3.enumeracion;

public class FrutasDemo {

	public static void main(String[] args) {
		System.out.println("La manzana cuesta: " + Frutas.Manzana.getPrecio() + " pesos");
		
		System.out.println("Frutas y sus precios: ");
		
		for(Frutas i : Frutas.values()) {
			System.out.println(i + " cuesta " + i.getPrecio() + " pesos");
		}
	}

}
