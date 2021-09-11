package clase4.practica4_6;

import java.io.Serializable;

public class Persona implements Serializable {
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String direccion;

	public Persona() {
		super();
	}

	public Persona(String nombre, String apPaterno, String apMaterno, String direccion) {
		super();
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", direccion="
				+ direccion + "]";
	}
}
