package clase2;

public class DemoEmpleado {

  public static void main(String[] args) {
    Empleado e1 = new Empleado();
    Empleado e2 = new Empleado("Eduardo", "Developer", 1230484, 17000);
    Empleado e3 = new Empleado("Maricela");
    
    EmpleadoModificado em1 = new EmpleadoModificado();
    
    System.out.println("\nEmpleado 1" + e1.toString());
    
    System.out.println("\nEmpleado 2" + e2.toString());
    
    System.out.println("\nEmpleado 3" + e3.toString());
    
    e3.setPuesto("QA Tester");
    e3.setNumEmpleado(150031);
    e3.setSalario(0);
    
    System.out.println("\nEmpleado 3" + e3.toString());
    e3.pedirVacaciones();
    
    System.out.println("\nEmpleado source 1: " + em1.toString());
  }
}
