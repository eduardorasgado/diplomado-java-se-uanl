package clase1.herencia;

public abstract class Auto {
	private String tipo;
	
	public Auto(String tipo) {
		super();
		this.tipo = tipo;
	}

	public void describe() {
		System.out.println("Modelo genérico de auto");
	}
	
	public abstract void tipo();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Auto [tipo=" + tipo + "]";
	}
}
