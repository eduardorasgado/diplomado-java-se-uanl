package clase3;

/**
 * DO WHILE Garantiza que el código se ejecute una vez y después verifica la condición
 *
 * @author cheetos
 */
public class EjemploDoWhile {

  public static void main(String[] args) {
    int a = 0;
    boolean estado = true;

    System.out.println("Antes del while");

    do {
      System.out.println(" Dentro del do while " + a);
      a++;
      if(a == 20) estado = false;
    } while (estado);

    System.out.println("Despues del while");
  }
}
