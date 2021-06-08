
public class Test_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student myStudent1 = new Student();
		myStudent1.firstName = "Sasuke";
		myStudent1.lastName = "Uchiha";
		myStudent1.major = "Ninja";
		myStudent1.gpa = 4.0F;
		myStudent1.age = 24;
		myStudent1.onProbation = false;
		
		System.out.println(myStudent1.firstName);
		
		Student myStudent2 = new Student();
		myStudent2.firstName = "Naruto";
		myStudent2.lastName = "Uzumaki";
		myStudent2.major = "Hokage";
		myStudent2.gpa = 2.4F;
		myStudent2.age = 23;
		myStudent2.onProbation = true;
		
		System.out.println(myStudent1.lastName);
		/*
		 * Too exhausting to type out all the object's attributes
		 * Initiate a constructor in the class file
		 */
		
		
        Book book1 = new Book("Harry Potter", "JK Rowling", 300);
        System.out.println(book1.title);

        Book book2 = new Book("Lord of the Rings", "JRR Tolkien", 400);
        System.out.println(book2.title);
        
        book2.readBook();
        System.out.println(book2.title);

		
	}
}
