package clase3;

public class EjemploArreglo3 {
  public static void main(String[] args) {
    int[][] matriz = new int[6][4];
    // int[][][] matriz = new int[6][4][8];
    // int[][][][] matriz = new int[6][4][9][10];
    int cont = 0;
    System.out.println("Filas: " + matriz.length);
    System.out.println("Filas: " + matriz[0].length);

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        matriz[i][j] = cont++;
      }
    }

    for (int i = 0; i < matriz.length; i++) {
      System.out.print("[ ");
      for (int j = 0; j < matriz[0].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println("]");
    }
  }
}
