/** */
package clase2;

import java.util.Scanner;

/** @author cheetos */
public class DemoMovie {

  /** @param args */
  public static void main(String[] args) {
    String title1, genre1, directorName1, synopsis1;
    int durationInSeconds1;
    short year1;

    Scanner scanner = new Scanner(System.in);

    System.out.println("PELICULA 1: ");
    System.out.println("Inserte titulo: ");
    title1 = scanner.nextLine();
    System.out.println("Inserte genero: ");
    genre1 = scanner.nextLine();
    System.out.println("Inserte nombre del director: ");
    directorName1 = scanner.nextLine();
    System.out.println("Inserte sinopsis: ");
    synopsis1 = scanner.nextLine();
    System.out.println("Inserte duracion en segundos: ");
    durationInSeconds1 = scanner.nextInt();
    System.out.println("Inserte año: ");
    year1 = scanner.nextShort();

    Movie2 movie1 = new Movie2(durationInSeconds1, title1, genre1, directorName1, synopsis1, year1);
    System.out.println(movie1.toString());

    scanner.close();
  }
}
