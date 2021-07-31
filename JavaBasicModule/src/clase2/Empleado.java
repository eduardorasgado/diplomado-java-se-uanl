package clase2;

public class Empleado {
  // variables de instancia o de clase
  private String nombre, puesto;
  private int numEmpleado;
  private double salario;

  public Empleado() {
    nombre = puesto = "";
    numEmpleado = 0;
    salario = 0.0;
  }

  public Empleado(String nombre, String puesto, int numEmpleado, double salario) {
    this.nombre = nombre;
    this.puesto = puesto;
    this.numEmpleado = numEmpleado;
    this.salario = salario;
  }

  public Empleado(String nombre) {
    this.nombre = nombre;
    puesto = "Nuevo Empleado";
    numEmpleado = 0;
    salario = 0.0;
  }
  
  // METODOS ESPECIFICOS
  
  public void pedirVacaciones() {
	  // logica para pedir vacaciones
	  System.out.println("Método para pedir vacaciones. Pendiente de implementar");
  }
  
  public void registrarAsistencia() {
	  // logica para registrar asistencia
	  System.out.println("Método para registrar asistencia. Pendiente de implementar");
  }
  
  public double cobrarSalario() {
	  System.out.println("Método para cobrar salario. Pendiente de implementar");
	  return 0.0;
  }

  // GETTERS

  public String getNombre() {
    return nombre;
  }

  public String getPuesto() {
    return puesto;
  }

  public int getNumEmpleado() {
    return numEmpleado;
  }

  // SETTERS

  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public void setNumEmpleado(int numEmpleado) {
    this.numEmpleado = numEmpleado;
  }

  public String toString() {
    return "Nombre: "
        + nombre
        + "\nPuesto: "
        + puesto
        + "\nNum. Empleado: "
        + numEmpleado;
  }
}
