package clase1.practica1_3;

public class Instructor extends Persona {
	private String clave;
	private String horario;
	private String materia;	

	/**
	 * 
	 */
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param direccion
	 * @param edad
	 * @param curp
	 */
	public Instructor(String nombre, String direccion, short edad, String curp) {
		super(nombre, direccion, edad, curp);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param clave
	 * @param horario
	 * @param materia
	 */
	public Instructor(String clave, String horario, String materia) {
		super();
		this.clave = clave;
		this.horario = horario;
		this.materia = materia;
	}
	
	public void darClase() {
		System.out.println("Dando clase...");
	}
	
	public void ponerExamen() {
		System.out.println("Poniendo examen...");
	}

	/**
	 * @return the clave
	 */
	protected String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	protected void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @return the horario
	 */
	protected String getHorario() {
		return horario;
	}

	/**
	 * @param horario the horario to set
	 */
	protected void setHorario(String horario) {
		this.horario = horario;
	}

	/**
	 * @return the materia
	 */
	protected String getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	protected void setMateria(String materia) {
		this.materia = materia;
	}
	
		
}
