import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {

	public Mortgage_Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Project: Mortgage Payment
	 * Mortgage (M)
	 * Principle (P)
	 * Period (Years) (n)
	 * Monthly Interest Rate (r)
	 * M = P * (r*(1 + r)^n) / ((1 + r)^n - 1)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		int principle = 0;
		float annualInterest = 0;
		float monthlyInterest = 0;
		byte periodYear = 0;
		int periodMonth = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Principle Mortgage Calculator $1K to $1M ");
		
		while(true) {
			System.out.println("Enter your Principle Mortgage Amount: ");
			principle = scanner.nextInt();
			if (principle >= 1000 && principle <= 1000000)
				break;
			System.out.println("Enter your Principle Mortgage Amount between $1K to $1M");
		}
		
		while(true) {
			System.out.println("Enter your Annual Interest Rate: ");
			annualInterest = scanner.nextFloat();
			if (annualInterest >= 1 && annualInterest <= 30) {
				monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
				break;
			}
			System.out.println("Enter your Annual Interest Rate between 1 to 30 (Percent)");	
		}
		
		while(true) {
			System.out.println("Enter your Mortgate Period (Years): ");
			periodYear = scanner.nextByte();
			if (periodYear >= 1 && periodYear <= 30) {
				periodMonth = periodYear*MONTHS_IN_YEAR;
				break;
			}
			System.out.println("Enter your Mortgate Period between 1 to 30 (Years)");
		}
		
		double interestFactor = Math.pow((1 + monthlyInterest), periodMonth);
		double mortgage = principle*(monthlyInterest*interestFactor/(interestFactor - 1));
		
		System.out.println("Your Mortgage Monthly Payment is: " + NumberFormat.getCurrencyInstance().format(mortgage));
	}

}
