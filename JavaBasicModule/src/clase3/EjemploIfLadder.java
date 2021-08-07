package clase3;

public class EjemploIfLadder {

  public static void main(String[] args) {
    int a = 2;

    System.out.println("Antes del IF");

    if (a == 1) {
      System.out.println("Nivel 1");
    } else if (a == 2) {
      System.out.println("Nivel 2");
    } else if (a == 2) {
      System.out.println("Nivel 3");
    } else if (a == 2) {
      System.out.println("Nivel 4");
    } else if (a == 2) {
      System.out.println("Nivel 5");
    } else {
      System.out.println("Nivel no existe");
    }

    System.out.println("Después del IF");
  }
}
