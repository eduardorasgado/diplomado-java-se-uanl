package clase3;

/**
 * DO WHILE Garantiza que el código se ejecute una vez y después verifica la condición
 *
 * @author cheetos
 */
public class EjemploDoWhile {

  public static void main(String[] args) {
    int a = 20;

    System.out.println("Antes dl while");

    do {
      System.out.println(" Dentro del do while " + a);
      a++;
    } while (a < 10);

    System.out.println("Despues del while");
  }
}
