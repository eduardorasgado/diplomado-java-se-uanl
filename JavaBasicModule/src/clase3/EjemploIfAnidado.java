package clase3;

public class EjemploIfAnidado {

  public static void main(String[] args) {
    int a = 6, b = 8;
    boolean estado = true;

    System.out.println("Antes del IF");
    if (b != 5) {
      System.out.println("Dentro del IF TRUE 1");
      if (a < b) {
        System.out.println("Dentro del IF TRUE 2");
      } else {
        System.out.println("Dentro del IF FALSE 2");
        if ((a * b) > 30) {
          System.out.println("Dentro del IF TRUE 3");
        }
      }
    } else {
      if (b == a) {
        System.out.println("Dentro de IF FALSE 1");
      }
    }

    System.out.println("Despues del If");
  }
}
