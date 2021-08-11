package CalculadoraMatricial;

import java.util.Scanner;

/**
 * Este proyecto consiste en el desarrollo de una calculadora que permite operaciones de tipo suma
 * resta y multiplicacion entre dos matrices. Inicia con un menu de operaciones y despues con la
 * insercion de los datos de las matrices una vez que se ha insertado la operacion deseada. La
 * calculadora valida las selecciones en menu y los datos que se estan procesando previo a realizar
 * la operacion.
 *
 * @author Eduardo Rasgado Ruiz
 */
public class CalculatorDemo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MatrixCalculator calculadoraMatricial = new MatrixCalculator(scanner);

    calculadoraMatricial.runMain();
  }
}
