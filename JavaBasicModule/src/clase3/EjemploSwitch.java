package clase3;

import java.util.Scanner;

public class EjemploSwitch {

  /** @param args */
  public static void main(String[] args) {
    int a;
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingresa el caso a ejecutar");
    a = lector.nextInt();

    System.out.println("Antes del switch");

    switch (a) {
      case 1:
        System.out.println("Ejecutando caso 1");
        break;
      case 2:
        System.out.println("Ejecutando caso 2");
        break;
      case 3:
        System.out.println("Ejecutando caso 3");
        break;
      case 4:
        System.out.println("Ejecutando caso 4");
        break;
      case 5:
        System.out.println("Ejecutando caso 5");
        break;
      default:
        System.out.println("Caso no existe");
    }
  }
}
