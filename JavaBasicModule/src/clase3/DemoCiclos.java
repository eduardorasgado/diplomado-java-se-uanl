package clase3;

import java.util.Scanner;

public class DemoCiclos {

  public static void main(String[] args) {

    int base;
    int numPosiciones;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresar el valor de la tabla: ");
    base = scanner.nextInt();
    System.out.println("Ingrese el número de posiciones: ");
    numPosiciones = scanner.nextInt();
    scanner.close();
    
    System.out.println("TABLA DE MULTIPLICACIÓN BASE " + base + "\n");
    for (int i = 0; i <= numPosiciones; i++) {
      System.out.println(base + " x " + i + " = " + (base * i));
    }
  }
}
