/** */
package CalculadoraMatricial;

import java.util.Scanner;

import static java.util.Objects.nonNull;

/**
 * Clase para realizar operaciones básicas de algebra lineal
 *
 * @author Eduardo Rasgado Ruiz
 */
public class MatrixCalculator {
  private MatrixHandler matrix1, matrix2;
  private int[][] resultMatrix;
  private Scanner scanner;
  private int operation;
  private boolean calculatorState;
  /** @param scanner */
  public MatrixCalculator(Scanner scanner) {
    this.scanner = scanner;
    calculatorState = true;
  }

  /** Imprime las operaciones que se tienen disponibles en la calculadora matricial */
  private void printOperationMenu() {
    System.out.println("Las operaciones disponibles son las siguientes");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
  }

  /** Menu inicial y bucle donde el usuario ingresa la operacion a realizar */
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

  /**
   * Logica principal para pedir los datos de matrices, realizar las operaciones e imprimirlas en
   * pantalla, luego de que ya se tenga la operacion a realizar
   */
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
          getMatrices(opBaseMessage.concat("SUMA"));
          resultMatrix = matrix1.add(matrix2);
          if (nonNull(resultMatrix)) showResults();
          validOperation = true;
          break;
        case 2:
          getMatrices(opBaseMessage.concat("RESTA"));
          resultMatrix = matrix1.substract(matrix2);
          if (nonNull(resultMatrix)) showResults();
          validOperation = true;
          break;
        case 3:
          getMatrices(opBaseMessage.concat("MULTIPLICACIÓN"));
          resultMatrix = matrix1.product(matrix2);
          if (nonNull(resultMatrix)) showResults();
          validOperation = true;
          break;
        default:
          System.out.println("Parece que no existe esta operación, intente de nuevo.");
      }
    }
  }

  /**
   * Pide al usuario los datos de la matriz 1 y 2
   *
   * @param header texto para imprimir
   */
  private void getMatrices(String header) {
    System.out.println(header);
    try {
      System.out.println("Datos de Matriz 1: ");
      matrix1.getMatrixData();
      System.out.println("Datos de Matriz 2: ");
      matrix2.getMatrixData();
    } catch (Exception e) {
      System.out.println(
          "Error al insertar datos de matriz. "
              + "Vuelva a iniciar la calculadora de nuevo para poder continuar.");
    }
  }

  /**
   * Muestra la matriz que se le pasa por parametro, formateandola con llaves
   *
   * @param matrix matriz a mostrar
   */
  private void showMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      System.out.print("[ ");
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println("]");
    }
  }

  /** Muestra en texto la matriz 1 y 2 y expone el resultado */
  private void showResults() {
    System.out.println("Matriz 1: ");
    showMatrix(matrix1.getMatrix());
    System.out.println("Matriz 2: ");
    showMatrix(matrix2.getMatrix());
    System.out.println("La matriz resultado es: ");
    showMatrix(resultMatrix);
  }
}
