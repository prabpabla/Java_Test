
public class Movie {

		private String title;
		private String director;
		private String rating;
		
		public Movie(String title, String director, String rating) {
			this.setTitle(title);
			this.setDirector(director);
			this.setRating(rating);
			/*
			 * Using setters allows to adjust the object being created
			 * If the object being created (movie2) has rating "Weird", it will set to NR
			 * this.title = title;
			 * this.director = director;
			 * this.rating = rating;
			*/
		}
		
		//Set and Get Rating
		public void setRating(String rating) {
			if(rating.equals("G") || rating.equals("PG") || rating.equals("PG-13") || rating.equals("R") || rating.equals("NR"))
				this.rating = rating;
			else
				this.rating = "NR";	
		}
		
		public String getRating() {
			return this.rating;
	    }
		
		//Set and Get Title
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getTitle(String title) {
			return this.title;
		}
		
		//Set and get Director
		public void setDirector(String director) {
			this.director = director;
		}
		
		public String getDirector(String director) {
			return this.director;
		}
		
}
