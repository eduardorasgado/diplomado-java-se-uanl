package clase2.generics;

public class Generics1<T> {
	private T dato; // T es como si fuera un tipo de dato
	
	public Generics1(T dato) {
		this.dato = dato;
	}

	/**
	 * @return the dato
	 */
	public T getDato() {
		return dato;
	}

	/**
	 * @param dato the dato to set
	 */
	public void setDato(T dato) {
		this.dato = dato;
	}

	@Override
	public String toString() {
		return "EjemploGenerics1 [dato=" + dato + "]";
	}
	
}