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
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Principle Mortgage Amount: ");
		int principle = scanner.nextInt();
		
		System.out.println("Enter your Annual Interest Rate: ");
		float annualInterest = scanner.nextFloat();
		float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
		
		System.out.println("Enter your Mortgate Period (years): ");
		byte periodYear = scanner.nextByte();
		int periodMonth = periodYear*MONTHS_IN_YEAR;
		
		double interestFactor = Math.pow((1 + monthlyInterest), periodMonth);
		double mortgage = principle*(monthlyInterest*interestFactor/(interestFactor - 1));
		
		System.out.println("Your Mortgage Monthly Payment is: " + NumberFormat.getCurrencyInstance().format(mortgage));
	}

}
