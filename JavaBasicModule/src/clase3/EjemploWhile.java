package clase3;

public class EjemploWhile {

  public static void main(String[] args) {
    int a = 0;

    System.out.println("Antes dl while");

    while (a < 10 && a > 4 || a == 4) {
      System.out.println("Dentro de while: " + a);
      a += 1;
      if (a == 5) break;
    }

    System.out.println("Despues del while");
  }
}
