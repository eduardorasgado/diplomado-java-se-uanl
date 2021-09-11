package proyectoModIntermediate;

import java.io.Serializable;

public class Vehiculo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String marca;
	private String color;
	private String modelo;

	public Vehiculo() {
		super();
	}

	public Vehiculo(String marca, String color, String modelo) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", color=" + color + ", modelo=" + modelo + "]";
	}
}
