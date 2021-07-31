package clase2;

import java.util.Scanner;

public class EjemploMedotos {

  public static void main(String[] args) {
    /**
     * 1. Crear 2 variables de string 2. Pedir al usuario los valores de esas variables y guardarlos
     * respectivamente 3. Aplicar 1 metodos de la clase String a cada una y mostrar el resultado en
     * consola
     */
    String str1, str2;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserte string 1: ");
    str1 = scanner.nextLine();

    System.out.println("Inserte string 2: ");
    str2 = scanner.nextLine();
    scanner.close();

    System.out.println("La concatenación es: " + str1.concat(" ").concat(str2));
    System.out.println("Las cadena2 en mayusculas: " + str2.toUpperCase());
  }
}
