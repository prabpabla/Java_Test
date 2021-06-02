import java.util.Arrays;
import java.util.Scanner;
import java.lang.StringBuilder;

public class FizzBuzz {

	public FizzBuzz() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Generate output for a range of number, 0 to n
	 * If the number is divisible by 5, print Fizz
	 * If the number is divisible by 3, print Buzz
	 * If the number is divisible by both 5 and 3, print FizzBuzz
	 * If the number is not divisible by either 3 or 5, print the number
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range: ");
		byte range = scanner.nextByte();
		String output = "";
		
		
		for (int i = 1; i <= range; i++) {
			if (i%3 == 0 && i%5 == 0) {
				output += ("FizzBuzz");
				output += i != range ? ", " : "";
			}
			else if (i%3 == 0) {
				output += "Buzz";
				output += i != range ? ", " : "";
			}
			else if (i%5 == 0) {
				output += "Fizz";
				output += i != range ? ", " : "";
			}
		}
		System.out.println(output);
		
		
		/*
		String[] outputArray = new String[range];
		for (int i = 1; i <= range; i++) {
			if (i%3 == 0 && i%5 == 0)
				outputArray[i-1] = "FizzBuzz";
			else if (i%3 == 0)
				outputArray[i-1] = "Buzz";
			else if (i%5 == 0)
				outputArray[i-1] = "Fizz";
		}
		//System.out.println(Arrays.toString(outputArray));
		String[] outputNoNull = Arrays.stream(outputArray)
				.filter(value -> value != null && value.length() > 0)
	                .toArray(size -> new String[size]);
		System.out.println(Arrays.toString(outputNoNull));
		*/
		
	}

}
