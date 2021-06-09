
public class Book_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Book book1 = new Book("Harry Potter", "JK Rowling", 300);
	     System.out.println(book1.title);

	     Book book2 = new Book("Lord of the Rings", "JRR Tolkien", 400);
	     System.out.println(book2.title);
	        
	     book2.readBook();
	}

}
