
public class Book {
	 public String title;
	 public String author;
	 public int numPages;
	 
	 public Book(){
          this.title = "no title";
          this.author = "no author";
     }
	 
	 /*
	  * Create a constructor
	  */
	 public Book(String title, String author, int numPages){
         this.title = title;
         this.author = author;
         this.numPages = numPages;
	 }
	 
	 public void readBook(){
         System.out.println("Reading " + this.title + " by " + this.author);
     }
}
