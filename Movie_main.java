
public class Movie_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie movie1 = new Movie("The Avengers", "Joss Whedon", "PG-13");
		Movie movie2 = new Movie("Step Brothers", "Adam McKay", "Weird");
		
		//movie1.rating = "Something";
		//Ratings can only be: G, PG, PG-13, R, NR
		//Use Getters and Setters to get and set correct ratings
		//Make rating attribute private, so it cannot be changed
		
		System.out.println(movie2.getRating());
		
		movie1.setRating("Something");
		System.out.println(movie1.getRating());
		
		movie1.setRating("PG-13");
		System.out.println(movie1.getRating());
	}

}
