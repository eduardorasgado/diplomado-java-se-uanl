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
	
	public Empleado(String n, String p, int num, double s) {
		nombre = n;
		puesto = p;
		numEmpleado = num;
		salario = s;
	}
}
