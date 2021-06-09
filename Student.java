

public class Student {
	
		String firstName;
		String lastName;
		float gpa;
		String major;
		byte age;
		boolean onProbation;

		public Student() {
			
		}
		
		public Student(String firstName, String lastName, float gpa) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.gpa = gpa;
		}
		
		public boolean isOnHonourRoll() {
			if(this.gpa >= 3.6)
				return true;
			return false;
		}
}
