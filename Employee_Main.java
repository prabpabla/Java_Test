
public class Employee_Main {

	public static void main(String [] args) {
		
	      Salary s = new Salary("Bruce Wayne", "Gotham, NY", 3, 3600.00);
	      Employee e = new Salary("Clark Kent", "Smallville, TX", 2, 2400.00);
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	   }
	
}
