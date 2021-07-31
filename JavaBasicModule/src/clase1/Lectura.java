package clase1;

import java.util.Scanner;

public class Lectura {
  public static void main(String[] args) {
    String nombre, apellido;
    Scanner lector = new Scanner(System.in); // Instanciando un objeto
    // Pedimos valores
    System.out.println("Ingrese su nombre: ");
    nombre = lector.nextLine();
    System.out.println("Ingrese su apellido");
    apellido = lector.nextLine();
    // Mensaje de bienvenida
    System.out.println("Bienvenido a Java, " + nombre + " " + apellido + "!");
    lector.close();
  }
}
