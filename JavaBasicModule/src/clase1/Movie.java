package clase1;

public class Movie {
	int durationInSeconds;
	String id, title, genre, directorName, directorLastName, synopsis, countryOrigin;
	short year;
	
	public Movie() {
		durationInSeconds = year = 0;
		title = genre = directorName = directorLastName = id = synopsis = countryOrigin = "";
	}
	
	public Movie(String id, String title, String genre, int durationInSeconds, 
			short year, String directorName, String directorLastName, 
			String synopsis, String countryOrigin) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.durationInSeconds = durationInSeconds;
		this.year = year;
		this.directorName = directorName;
		this.directorLastName = directorLastName;
		this.synopsis = synopsis;
		this.countryOrigin = countryOrigin;
	}
	
	public void getDirectorFullName() {
		System.out.println(directorName + " " + directorLastName);
	}
	
	public void getSimpleDescription() {
		System.out.println(
				"Movie: " + title + ", genre: " + genre + ", sysnopsis: " + synopsis);
	}
	
	public void getFullDescription() {
		getSimpleDescription();
		System.out.println(
				"Year: " + year + 
				", country: " + countryOrigin + 
				"duration: " + durationInSeconds + " secs.");
	}
	
	public void getMetadataOnly() {
		System.out.println(
				"{year: " + year + 
				", country: " + countryOrigin + 
				", durationInSecs:" + durationInSeconds + 
				"}");
	}
}
