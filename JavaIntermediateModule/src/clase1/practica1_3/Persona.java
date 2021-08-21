package clase1.practica1_3;

public class Persona {
	private String nombre;
	private String direccion;
	private short edad;
	private String curp;

	/**
	 * 
	 */
	public Persona() {
	}

	/**
	 * @param nombre
	 * @param direccion
	 * @param edad
	 * @param curp
	 */
	public Persona(String nombre, String direccion, short edad, String curp) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.curp = curp;
	}

	public void comer() {
		System.out.println("Comiendo...");
	}

	public void dormir() {
		System.out.println("Durmiendo...");
	}

	/**
	 * @return the nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	protected String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the edad
	 */
	protected short getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	protected void setEdad(short edad) {
		this.edad = edad;
	}

	/**
	 * @return the curp
	 */
	protected String getCurp() {
		return curp;
	}

	/**
	 * @param curp the curp to set
	 */
	protected void setCurp(String curp) {
		this.curp = curp;
	}

}
