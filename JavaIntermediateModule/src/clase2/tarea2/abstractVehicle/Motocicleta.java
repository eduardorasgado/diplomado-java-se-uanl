package clase2.tarea2.abstractVehicle;

public class Motocicleta extends Vehiculo{
	private int ruedas;
	private String tipo;
	
	public Motocicleta(int ruedas, String tipo) {
		this.ruedas = ruedas;
		this.tipo = tipo;
	}

	@Override
	public void acelera() {
		System.out.println("La motocicleta acelara con " + ruedas + " ruedas...");
	}

	@Override
	public void gira() {
		System.out.println("La motocicleta tipo " + tipo + " gira...");
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
