package CalculadoraMatricial;

import java.util.Scanner;

/**
 * Clase que abstrae el contexto de matriz en la calculadora
 *
 * @author Eduardo Rasgado Ruiz
 */
public class MatrixHandler {
  private int[][] matrix;
  private int columns;
  private int rows;
  private Scanner scanner;

  public MatrixHandler() {}

  /** @param scanner */
  public MatrixHandler(Scanner scanner) {
    this.scanner = scanner;
  }

  /**
   * @param columns
   * @param rows
   * @param scanner
   */
  public MatrixHandler(int columns, int rows, Scanner scanner) {
    this.columns = columns;
    this.rows = rows;
    this.scanner = scanner;

    matrix = new int[columns][rows];
  }

  public void getMatrixData(ColumnRowPattern columnRowPatter) {
    if (columnRowPatter.equals(ColumnRowPattern.EQUAL)) {
      System.out.println("Insertar número de columnas/filas: ");
      columns = rows = scanner.nextInt();
    } else if (columnRowPatter.equals(ColumnRowPattern.DIFFERENT)) {
      System.out.println("Insertar número de filas:");
      rows = scanner.nextInt();
      System.out.println("Insertar número de columnas: ");
      columns = scanner.nextInt();
    } else {

    }
    // TODO: Realizar la operacion en otro metodo y llamarlo
    System.out.println("Insertar elementos de fila #: ");
  }

  public void add(MatrixHandler otherMatrix) {
    // TODO: Desarrollar metodo
    System.out.println("Operación realizada con éxito");
  }

  public void substract(MatrixHandler otherMatrix) {
    // TODO: Desarrollar metodo
    System.out.println("Operación realizada con éxito");
  }

  public void product(MatrixHandler otherMatrix) {
    // TODO: Desarrollar metodo
    System.out.println("Operación realizada con éxito");
  }
}
