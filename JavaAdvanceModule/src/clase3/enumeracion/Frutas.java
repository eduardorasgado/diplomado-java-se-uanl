package clase3.enumeracion;

/**
 * Funciones Adicionales que pueden tener las enumeraciones
 * @author cheetos
 *
 */
public enum Frutas {
	Manzana(30),
	Platano(25),
	Melon(36),
	Sandia(40),
	Tomate(38);
	
	private int precio;
	
	private Frutas(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
}
