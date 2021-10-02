package clase2.generics;

public class Generics2 <T, V>{ // Generics2<Integer, String> genTipos = new Generics2<>(10, "Hola2);
	private T dato1;
	private V dato2;
	/**
	 * @param dato1
	 * @param dato2
	 */
	public Generics2(T dato1, V dato2) {
		this.dato1 = dato1;
		this.dato2 = dato2;
	}
	/**
	 * @return the dato1
	 */
	public T getDato1() {
		return dato1;
	}
	/**
	 * @param dato1 the dato1 to set
	 */
	public void setDato1(T dato1) {
		this.dato1 = dato1;
	}
	/**
	 * @return the dato2
	 */
	public V getDato2() {
		return dato2;
	}
	/**
	 * @param dato2 the dato2 to set
	 */
	public void setDato2(V dato2) {
		this.dato2 = dato2;
	}
	@Override
	public String toString() {
		return "Generics2 [dato1=" + dato1 + ", dato2=" + dato2 + "]";
	}
	
	public void mostrarTipos() {
		System.out.println("Tipo de T: " + dato1.getClass().getName());
		System.out.println("Tipo de V: " + dato2.getClass().getName());
	}
}
