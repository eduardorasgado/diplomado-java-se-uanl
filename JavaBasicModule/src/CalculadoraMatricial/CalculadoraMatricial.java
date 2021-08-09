/** */
package CalculadoraMatricial;

import java.util.Scanner;

/**
 * Clase para realizar operaciones básicas de algebra lineal
 *
 * @author Eduardo Rasgado Ruiz
 */
public class CalculadoraMatricial {
  private MatrixHandler matrix1, matrix2;
  private Scanner scanner;
  private int operation;
  private boolean calculatorState;
  /** @param scanner */
  public CalculadoraMatricial(Scanner scanner) {
    this.scanner = scanner;
    calculatorState = true;
  }

  public void printOperationMenu() {
    System.out.println("Las operaciones disponibles son las siguientes");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
  }

  public void runMain() {
    System.out.println("---Calculadora de matrices---");
    while (calculatorState) {
      runOperationContext();

      System.out.println("Desea realizar otra operación? 1. Si / 0. No");
      calculatorState = (scanner.nextInt() == 0) ? false : true;
    }
    scanner.close();
    System.out.println("---Calculadora cerrada---");
  }

  private void getOperation() {
    System.out.println("Inserte su operación: ");
    operation = scanner.nextInt();
  }

  private void runOperationContext() {
    String opBaseMessage = "Ha elegido la operación: ";
    boolean validOperation = false;
    matrix1 = new MatrixHandler(scanner);
    matrix2 = new MatrixHandler(scanner);

    while (validOperation == false) {
      printOperationMenu();
      getOperation();
      System.out.println();
      switch (operation) {
        case 1:
          System.out.println(opBaseMessage.concat("SUMA"));
          System.out.println("Datos de Matriz 1: ");
          matrix1.getMatrixData(ColumnRowPattern.EQUAL);
          System.out.println("Datos de Matriz 2: ");
          matrix2.getMatrixData(ColumnRowPattern.EQUAL);
          matrix1.add(matrix2);
          validOperation = true;
          break;
        case 2:
          System.out.println(opBaseMessage.concat("RESTA"));
          System.out.println("Datos de Matriz 1: ");
          matrix1.getMatrixData(ColumnRowPattern.EQUAL);
          System.out.println("Datos de Matriz 2: ");
          matrix2.getMatrixData(ColumnRowPattern.EQUAL);
          matrix1.substract(matrix2);
          validOperation = true;
          break;
        case 3:
          System.out.println(opBaseMessage.concat("MULTIPLICACIÓN"));
          System.out.println("Datos de Matriz 1: ");
          matrix1.getMatrixData(ColumnRowPattern.DIFFERENT);
          System.out.println("Datos de Matriz 2: ");
          matrix2.getMatrixData(ColumnRowPattern.DIFFERENT);
          matrix1.product(matrix2);
          validOperation = true;
          break;
        default:
          System.out.println("Parece que no existe esta operación, intente de nuevo.");
      }
    }
  }
}
