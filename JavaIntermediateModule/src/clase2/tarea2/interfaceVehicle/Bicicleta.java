package clase2.tarea2.interfaceVehicle;

public class Bicicleta implements IVehicle {
	private int ruedas;
	private String tipo;

	public Bicicleta(int ruedas, String tipo) {
		this.ruedas = ruedas;
		this.tipo = tipo;
	}

	@Override
	public void acelerar() {
		System.out.println("La bicicleta acelara con " + ruedas + " ruedas...");
	}

	@Override
	public void girar() {
		System.out.println("La bicicleta tipo " + tipo + " gira...");
	}
	
	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
