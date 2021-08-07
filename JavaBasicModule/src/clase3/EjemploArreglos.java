package clase3;

public class EjemploArreglos {

  public static void main(String[] args) {
    int n1 = 4, n2 = 8, n3 = 14;

    System.out.println("\nValor de n1 = " + n1);
    System.out.println("\nValor de n2 = " + n2);
    System.out.println("\nValor de n3 = " + n3);

    int[] numeros = new int[4];
    // asignacion de valores al arreglo
    numeros[0] = n1;
    numeros[1] = 20;
    numeros[2] = 30;
    numeros[3] = 40;

    System.out.println("\nElemento 1: " + numeros[0]);
    n1 = 100;
    System.out.println("\nElemento 1: " + numeros[0]);
    System.out.println("\nElemento 2: " + numeros[1]);
    System.out.println("\nElemento 3: " + numeros[2]);
    System.out.println("\nElemento 4: " + numeros[3]);
    
    // Se crea un arreglo de manera dinamica
    String[] dias = {"lun", "mar", "mie", "jue", "vie"};
    System.out.println("\n Día 1: " + dias[0]);
    System.out.println("\n Día 2: " + dias[1]);
    System.out.println("\n Día 3: " + dias[2]);
    System.out.println("\n Día 4: " + dias[3]);
    System.out.println("\n Día 5: " + dias[4]);
  }
}
