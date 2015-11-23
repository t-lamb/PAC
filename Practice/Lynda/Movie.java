/* Code from Lynda.com exercise */

public class Movie {
	private String movieTitle;
	private String rating;
	private int year;
	private int runTime;
	public Movie(String title, String rating, int year, int time){
		this.movieTitle = title;
		this.rating = rating;
		this.year = year;
		this.runTime = time;
	}
	public String getMovieTitle(){
		return movieTitle;
	}
	public void setMovieTitle(String value){
		movieTitle = value;
	}
	public String getRating(){
		return rating;
	}
	public void setRating(String value){
		rating = value;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int value){
		year = value;
	}
	public String toString(){
		return "Movie Title: " + movieTitle + 
				"\nRating: " + rating +
				"\nYear: " + year +
				"\nRun Time: " + runTime;
	}
}