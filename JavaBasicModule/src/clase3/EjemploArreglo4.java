package clase3;

import clase2.Empleado;

public class EjemploArreglo4 {

  public static void main(String[] args) {
    Empleado[] empleados = new Empleado[5];
    empleados[0] = new Empleado("Eduardo");
    empleados[1] = new Empleado("Margarita");
    empleados[2] = new Empleado("Pedro");
    empleados[3] = new Empleado("Juan");
    empleados[4] = new Empleado();

    for (int i = 0; i < empleados.length; i++) {
      System.out.println(empleados[i].toString());
    }

    // imprimiendo con foreach, solo con arreglo de objetos o objetos de collections
    System.out.println("\nimprimiendo con foreach: ");
    for (Empleado empleado : empleados) {
      System.out.println(empleado.toString());
    }

    System.out.println();
    String[] things = new String[4];
    for (String string : things) {
      System.out.println(string);
    }
  }
}
