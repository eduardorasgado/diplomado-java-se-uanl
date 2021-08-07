package clase3;

public class EjemploFor {

  public static void main(String[] args) {
    System.out.println("Antes del for");

    // variable; condicion; incremento
    for (int i = 0; i <= 10; i++) {
      System.out.println("Dentro del for: " + i);
    }
    
    for(int i = 20; i <= 100; i++) {
    	System.out.println("Dentro del sig for: " + i); 
    }
    
    System.out.println("Dentro del for");
  }
}
