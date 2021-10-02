package clase1.figuras;

public interface Geometria {
	String operacion = "OPERACIONES GEOMÉTRICAS";
	
	// metodos no implementados
	public double perimetro();
	public double area();
	public void reformar(double value);
	
	// metodos default
	public default double volumen() {
		System.out.println("Volumen pendiente de implementar");
		return 0;
	}
	
	public default void colorear(String color) {
		System.out.println("Figura coloreada de " + color);
	}
}