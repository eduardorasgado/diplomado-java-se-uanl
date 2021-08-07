package clase3;

/**
 * DO WHILE Garantiza que el c�digo se ejecute una vez y despu�s verifica la condici�n
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
