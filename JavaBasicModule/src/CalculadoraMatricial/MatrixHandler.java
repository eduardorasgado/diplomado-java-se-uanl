package CalculadoraMatricial;

import java.util.InputMismatchException;
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
  private final String SUCCESS_OPERATION_MSG = "Operación realizada con éxito";
  private final String FAILED_EQUAL_OPERATION =
      "Las filas y columnas de las matrices son diferentes entre matrices. "
          + "No es posible de realiza la operación";

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

  /**
   * Solicita y captura los datos de la matriz del objeto que invoca el metodo
   *
   * @throws InputMismatchException Puede darse un error de escaneo, ingresar letra en vez de numero
   */
  public void getMatrixData() throws InputMismatchException {

    System.out.println("Insertar número de filas:");
    rows = scanner.nextInt();
    System.out.println("Insertar número de columnas: ");
    columns = scanner.nextInt();

    matrix = new int[rows][columns];

    for (int i = 0; i < matrix.length; i++) {
      //
      System.out.println("---- Insertar elementos de fila " + (i + 1) + ": ");
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.println("---- > columna " + (j + 1) + ": ");
        matrix[i][j] = scanner.nextInt();
      }
    }
    System.out.println();
  }

  /**
   * Realiza la operacion de suma entre una matriz A del objeto actual y una matriz B
   *
   * @param otherMatrix matriz B
   * @return matriz resultante o nulo
   */
  public int[][] add(MatrixHandler otherMatrix) {
    if (validateOperation(ColumnRowPattern.EQUAL, otherMatrix)) {
      int[][] resultMatrix = new int[otherMatrix.getRows()][otherMatrix.getColumns()];
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
          resultMatrix[i][j] = matrix[i][j] + otherMatrix.getMatrix()[i][j];
        }
      }
      System.out.println(SUCCESS_OPERATION_MSG);
      return resultMatrix;
    } else {
      System.out.println(FAILED_EQUAL_OPERATION);
      return null;
    }
  }

  /**
   * Realiza la operacion de resta entre la matriz A del objeto actual y una matriz B
   *
   * @param otherMatrix matriz B
   * @return matriz resultado o nulo
   */
  public int[][] substract(MatrixHandler otherMatrix) {
    if (validateOperation(ColumnRowPattern.EQUAL, otherMatrix)) {
      int[][] resultMatrix = new int[otherMatrix.getRows()][otherMatrix.getColumns()];
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
          resultMatrix[i][j] = matrix[i][j] - otherMatrix.getMatrix()[i][j];
        }
      }
      System.out.println(SUCCESS_OPERATION_MSG);
      return resultMatrix;
    } else {
      System.out.println(FAILED_EQUAL_OPERATION);
      return null;
    }
  }

  /**
   * realiza la operacion de multiplicacion entre la matriz del objeto actual A y una matriz B.
   *
   * @param otherMatrix matriz B
   * @return matriz resultado o nulo
   */
  public int[][] product(MatrixHandler otherMatrix) {
    if (validateOperation(ColumnRowPattern.DIFFERENT, otherMatrix)) {
      int[][] resultMatrix = new int[rows][otherMatrix.getColumns()];

      for (int i = 0; i < resultMatrix.length; i++) {
        for (int j = 0; j < resultMatrix[0].length; j++) {
          for (int k = 0; k < columns; k++) {
            resultMatrix[i][j] += matrix[i][k] * otherMatrix.getMatrix()[k][j];
          }
        }
      }

      System.out.println(SUCCESS_OPERATION_MSG);
      return resultMatrix;
    } else {
      System.out.println("No es posible obtener el producto entre estas matrices");
      return null;
    }
  }

  /**
   * Valida que dado un tipo de patron de columnas y filas entre dos matrices, estas puedan realizar
   * la operacion necesaria. Para suma y resta es necesario que las matrices tengan mismo numero de
   * columnas y filas y para producto de matrices es necesario que el numero de columnas de la
   * matriz A(1) sea igual al numero de filas de la matriz B(2)
   *
   * @param pattern define como se validaran las matrices 1 y 2
   * @param otherMatrixHandler Matriz B
   * @return
   */
  private boolean validateOperation(ColumnRowPattern pattern, MatrixHandler otherMatrixHandler) {
    if (pattern.equals(ColumnRowPattern.EQUAL)) {
      return rows == otherMatrixHandler.getRows() && columns == otherMatrixHandler.getColumns();

    } else if (pattern.equals(ColumnRowPattern.DIFFERENT)) {
      return columns == otherMatrixHandler.getRows();
    }
    return false;
  }

  /** @return the columns */
  protected int getColumns() {
    return columns;
  }

  /** @param columns the columns to set */
  protected void setColumns(int columns) {
    this.columns = columns;
  }

  /** @return the rows */
  protected int getRows() {
    return rows;
  }

  /** @param rows the rows to set */
  protected void setRows(int rows) {
    this.rows = rows;
  }

  /** @return the matrix */
  protected int[][] getMatrix() {
    return matrix;
  }

  /** @param matrix the matrix to set */
  protected void setMatrix(int[][] matrix) {
    this.matrix = matrix;
  }
}
