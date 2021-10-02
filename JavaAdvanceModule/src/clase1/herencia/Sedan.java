package clase1.herencia;

public class Sedan extends Auto {
	private String modelo;
	
	public Sedan(String modelo) {
		super("Sedan");
		this.modelo = modelo;
	}
	
	@Override
	public void describe() {
		super.describe();
		System.out.println("Modelo tipo Sedan");
	}

	@Override
	public void tipo() {
		System.out.println("Tipo Sedan");		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return super.toString() + ", Sedan [modelo=" + modelo + "]";
	}
}
