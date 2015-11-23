import java.util.Scanner;

public class MovieList {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String movie;
		String rating;
		int year;
		int runTime;
		Movie favoriteMovie;
		System.out.println("What is your favorite movie?");
		movie = in.next();
		System.out.println("What rating did that have?");
		rating = in.next();
		System.out.println("What year was it made?");
		year = in.nextInt();
		System.out.println("How long is the movie?");
		runTime = in.nextInt();
		favoriteMovie = new Movie(movie, rating, year, runTime);
		System.out.println(favoriteMovie.toString());
	}
}