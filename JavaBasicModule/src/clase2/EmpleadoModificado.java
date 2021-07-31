package clase2;

/**
 * Esta clase sirve para crear un nuevo empleado
 * @author cheetos
 *
 */
public class EmpleadoModificado {
  private String nombre, puesto;
  private int numEmpleado;
  private double salario;

  /**
   * Este constructor sirve para que el empleado se personalice immediatamente
   * @param nombre El nombre completo del empleado
   * @param puesto El puesto del empleado
   * @param numEmpleado El numero del empleado pero sin formato
   * @param salario El salario en entero
   */
  public EmpleadoModificado(String nombre, String puesto, int numEmpleado, double salario) {
    this.nombre = nombre;
    this.puesto = puesto;
    this.numEmpleado = numEmpleado;
    this.salario = salario;
  }

  public EmpleadoModificado(String nombre) {
    this.nombre = nombre;
  }

  /** */
  public EmpleadoModificado() {}

  /** @return the nombre */
  public String getNombre() {
    return nombre;
  }

  /** @param nombre el nombre a modificar */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /** @return the puesto */
  public String getPuesto() {
    return puesto;
  }

  /** @param puesto the puesto to set */
  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }

  /** @return the numEmpleado */
  public int getNumEmpleado() {
    return numEmpleado;
  }

  /** @param numEmpleado the numEmpleado to set */
  public void setNumEmpleado(int numEmpleado) {
    this.numEmpleado = numEmpleado;
  }

  /** @return the salario */
  public double getSalario() {
    return salario;
  }

  /** @param salario the salario to set */
  public void setSalario(double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return "EmpleadoModificado [nombre="
        + nombre
        + ", puesto="
        + puesto
        + ", numEmpleado="
        + numEmpleado
        + ", salario="
        + salario
        + "]";
  }
}
