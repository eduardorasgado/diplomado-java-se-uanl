package CalculadoraMatricial;

import java.util.Scanner;

public class DemoCalculadora {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CalculadoraMatricial calculadoraMatricial = new CalculadoraMatricial(scanner);
    
    calculadoraMatricial.runMain();
  }
}
