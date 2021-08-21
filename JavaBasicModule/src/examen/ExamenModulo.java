package examen;

public class ExamenModulo {

  public static void main(String[] args) {
    String a1 = "escuela";
    String a2 = "escuela";
    String b1 = "escuela";
    String b2 = "universidad";
    String c1 = "escuela";
    String c2 = "Escuela";

    System.out.println(compareString(a1, a2));
    System.out.println(compareString(b1, b2));
    System.out.println(compareString(c1, c2));
  }

  public static String compareString(String first, String second) {
    return first.equals(second) ? "Iguales" : "Diferentes";
  }
}
