package clase2;

/**
 * Peliculas de un servicio de streaming on demand
 *
 * @author cheetos
 */
public class Movie2 {
  private int durationInSeconds;
  private String title, genre, directorName, synopsis;
  private short year;
  /**
   * @param durationInSeconds
   * @param title
   * @param genre
   * @param directorName
   * @param synopsis
   * @param year
   */
  public Movie2(
      int durationInSeconds,
      String title,
      String genre,
      String directorName,
      String synopsis,
      short year) {
    this.durationInSeconds = durationInSeconds;
    this.title = title;
    this.genre = genre;
    this.directorName = directorName;
    this.synopsis = synopsis;
    this.year = year;
  }
  /**
   * @param title
   * @param genre
   */
  public Movie2(String title, String genre) {
    this.title = title;
    this.genre = genre;
  }
  /** */
  public Movie2() {}
  /** @return the durationInSeconds */
  public int getDurationInSeconds() {
    return durationInSeconds;
  }
  /** @param durationInSeconds the durationInSeconds to set */
  public void setDurationInSeconds(int durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
  }
  /** @return the title */
  public String getTitle() {
    return title;
  }
  /** @param title the title to set */
  public void setTitle(String title) {
    this.title = title;
  }
  /** @return the genre */
  public String getGenre() {
    return genre;
  }
  /** @param genre the genre to set */
  public void setGenre(String genre) {
    this.genre = genre;
  }
  /** @return the directorName */
  public String getDirectorName() {
    return directorName;
  }
  /** @param directorName the directorName to set */
  public void setDirectorName(String directorName) {
    this.directorName = directorName;
  }
  /** @return the synopsis */
  public String getSynopsis() {
    return synopsis;
  }
  /** @param synopsis the synopsis to set */
  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }
  /** @return the year */
  public short getYear() {
    return year;
  }
  /** @param year the year to set */
  public void setYear(short year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "Movie2 [durationInSeconds="
        + durationInSeconds
        + ", title="
        + title
        + ", genre="
        + genre
        + ", directorName="
        + directorName
        + ", synopsis="
        + synopsis
        + ", year="
        + year
        + "]";
  }
}
