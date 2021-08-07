package clase3;

public class EjemploArreglo2 {

  public static void main(String[] args) {
    int[] numeros = new int[100];

    System.out.println("Longitud de arreglo numeros = " + numeros.length);
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = (i + 1) * 2;
      }
    
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("elemento en la posicion " + i + ": " + numeros[i]);
    }
  }
}
