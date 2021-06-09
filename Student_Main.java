
public class Student_Main {

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
		
		Student myStudent3 = new Student("Kakashi", "Hatake", 3.9F);
		System.out.println(myStudent3.firstName + " " + myStudent3.lastName + ": on Honour Roll is : "+ myStudent3.isOnHonourRoll());
	}

}
