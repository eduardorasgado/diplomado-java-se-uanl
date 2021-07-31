package clase1;

public class MovieDemo {

  public static void main(String[] args) {
    Movie voidMovie = new Movie();

    Movie jumanjiMovie =
        new Movie(
            "1",
            "Jumanji",
            "Adventure",
            56340,
            (short) 1995,
            "Joe",
            "Johnston",
            "Jumanji, one of the most unique--and dangerous--board games ever, "
                + "falls into the hands of the curious teen, Alan Parrish, in 1969. "
                + "Mysterious and magical, the game strands the unsuspecting boy in the lush, "
                + "savage forests of a mythical realm.",
            "USA");
    System.out.println("\nMovie 1: ");
    System.out.println("Title: " + voidMovie.title);
    System.out.println("Genre: " + voidMovie.genre);
    voidMovie.getSimpleDescription();
    voidMovie.getFullDescription();

    System.out.println("\nMovie 2: ");
    System.out.println("Title: " + jumanjiMovie.title);
    System.out.println("Genre: " + jumanjiMovie.genre);
    jumanjiMovie.getSimpleDescription();
    jumanjiMovie.getFullDescription();
  }
}
