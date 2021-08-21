package clase1.practica1_3;

public class Alumno extends Persona {
	private String matricula;
	private String horario;
	private String carrera;
	
	
	/**
	 * @param nombre
	 * @param direccion
	 * @param edad
	 * @param curp
	 */
	public Alumno(String nombre, String direccion, short edad, String curp) {
		super(nombre, direccion, edad, curp);
		
	}

	/**
	 * @param matricula
	 * @param horario
	 * @param carrera
	 */
	public Alumno(String matricula, String horario, String carrera) {
		super();
		this.matricula = matricula;
		this.horario = horario;
		this.carrera = carrera;
	}


	/**
	 * 
	 */
	public Alumno() {
		super();
	}
	
	public void presentar() {
		System.out.println("Presentando...");
	}
	
	public void tomarClase() {
		System.out.println("Tomando la clase...");
	}

	/**
	 * @return the matricula
	 */
	protected String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	protected void setMatricula(String matricula) {
		this.matricula = matricula;
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
	 * @return the carrera
	 */
	protected String getCarrera() {
		return carrera;
	}

	/**
	 * @param carrera the carrera to set
	 */
	protected void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
}
