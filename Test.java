import java.awt.Point;
import java.awt.print.Printable;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;



/**
 * @author prab_
 * 
 * Classes have PascalNamingConvention
 * Class is a container for related functions
 * Every Java program should have the main function
 */
public class Test {
	
	/**
	 * @return 
	 * Methods are functions defined in a class
	 * Methods follow a camelNamingConvention 
	 * Classes and methods should have access modifiers, eg. public, private
	 */
	public void test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * 
	 * Primitive Types are used for storing values
	 * byte (1 byte), short (2 bytes), int (4 bytes), long (8 bytes)
	 * float (4 bytes), double (8 bytes), char (2 bytes), boolean (1 byte)
	 * References Types are used for storing complex objects
	 * Date class in the package util, or in sql package, etc.
	 * Packages create name spaces for our classes
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
				
		byte age = 30;
		//Use byte, it anges from [-127, 128]
		int viewCount = 123_345_789;
		//Use _ to make it easier to read numbers
		long viewCountLarge = 3123456789L;
		//Use L to represent a long value; default integer type is int in java
		float price = 10.99F;
		//Use F to represent float; default floating type is double in java
		char letter = 'A';
		//Use single quotes for characters, and double quotes for strings
		
		/*
		 * 'now' is variable of type Date
		 * Use the 'new' operator to allocate memory for Date variable
		 * The variable 'now' is an instance of the date class
		 * An object is an instance of a class
		 * Members for the class can be accessed using the 'dot' operator
		 * Don't have to allocate memory for Primitive types
		 * This is automatically done by Java Runtime Environment
		 */
		boolean isTrue = false;
		Date now = new Date();
		now.getTime();
		System.out.println(now);
		//Type 'sysout' for System.out.println()
		
		/*
		 * Memory is allocated to store the Point(1, 1) object (eg. at address 100)
		 * Memory is allocated to attach the point1 label (address of Point(1, 1) object; 100)
		 * Ergo point1 and point2 are referencing the same object
		 * Updating point1 also updates point2
		 * Reference types are copied by their references
		 * Primitive types are copied by their values, and they are independent of each other
		 */
		byte x = 1;
		byte y = x;
		x = 2;
		System.out.println("x=" + x + ", y=" + y);
		
		Point point1 = new Point(1, 1);
		Point point2 = point1;
		point1.x = 2;
		System.out.println(point2);
		
		/*
		 * String is a reference type
		 * It can be written with the shorthand, without use of 'new' operator
		 * String is a class, automatically imported by java, part of java.lang package
		 * Use the dot operator to access various methods in String class
		 * Strings are immutable, cannot ergo cannot be modified
		 * Any methods that modify a String, returns a new String object
		 */
		String message = "  Hello World" + " Again!!  ";
		System.out.println(message);
		System.out.println(message.endsWith("Again"));
		System.out.println(message.startsWith("Again"));
		System.out.println(message.length());
		System.out.println(message.indexOf("ello"));
		System.out.println(message.indexOf("sky"));
		
		System.out.println(message.replace('!', '*'));
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
		//Prints out a new String object
		System.out.println(message);
		//String message remains unchanged
		
		/*
		 * Escape sequences can be executed by using '\'
		 * Common entries include \", \\, \n, \t
		 */
		System.out.println("Escape sequences: \"quotations\", \\backslash\\, \ttab \nreturn");
		
		/*
		 * Array is a reference type
		 * Use the 'new' operator to create an object of integer array; int[size]
		 * Array is a class, part of java.util package
		 * Arrays have a fixed length, cannot add or remove elements
		 * Declare multi-dimensional array using multiple []
		 * Use toString, deeptoString for one-dimensional, multi-dimentional arrray respectively  
		 */
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		//numbers[100] = 100 this will throw an exception
		System.out.println(numbers);
		//Prints the String of the address of the object in memory
		System.out.println(Arrays.toString(numbers));
		//Prints the String representation of the Integer Array
		int[] items = {2,3,9,3,9,7,9};
		//Declare arrays using {} syntax
		System.out.println(items.length);
		Arrays.sort(items);
		System.out.println(Arrays.toString(items));
		
		int[][] multiNum = new int[3][3];
		multiNum[0][0] =1;
		System.out.println(Arrays.deepToString(multiNum));
		//Prints the String representation of the Integer Array
		int[][] multiItems = {{1,1,1},{2,2,2},{3,4,9},{4,4,4}};
		//Declare arrays using {} syntax
		System.out.println(multiItems.length);
		System.out.println(Arrays.deepToString(multiItems));
		
		final float PI = 3.14F;
		//Variable type final is constant, have a fixed value and cannot be changed
		//By convention, use CAPITAL_LETTERS to name constants
		
		int result = 10 / 3;
		System.out.println(result);
		//Prints an integer value
		double result1 = (double)10 / (double)3;
		//Prefix the number with (double), ergo casting/ converting the number to double
		//Arithmetic Expression
		System.out.println(result1);
		
		int a = 1;
		int b = ++a;
		System.out.println("a=" + a + ", b=" + b);
		//a is incremented first (prefix), then b is equated to the result
		b = a++;
		System.out.println("a=" + a + ", b=" + b);
		//b is first equated to the a (postfix), then a is incremented
		a += 2;
		//Augmented or compound assignment operators; equal to a = a+2
		
		/*
		 * Implicit casting happens automatically when storing value in larger or more precise data type
		 * byte > short > int > long > float > double
		 * Explicit casting is done manually
		 * Cannot cast a String to a number, and must use wrapper classes
		 * In the java package java.lang, use the Short, Integer, Float class, and its parse method
		 * This converts the String to an integer or other primitive type
		 * Integer is the wrapper class for the int primitive type
		 */
		double c = 1.1;
		double d = c + 2;
		System.out.println(d);
		//Implicit casting
		int e = (int)c + 2;
		System.out.println(e);
		//Explicit casting
		String f = "1";
		int g = Integer.parseInt(f) + 2;
		System.out.println(g);
		
		System.out.println(Math.round(1.1F));
		System.out.println((int)Math.ceil(1.2F));
		System.out.println((int)Math.floor(1.2F));
		System.out.println(Math.max(7,3));
		System.out.println(Math.min(7,3));
		System.out.println(Math.random());
		//Generates a number of type Double between 0 and 1
		System.out.println(Math.round(Math.random()*100));
		//Double > Long > String
		System.out.println((int)(Math.random()*100));
		//Double > Int > String
		
		/*
		 * NumberFormat class is defined in the java.text package
		 * It is an abstract class and cannot be instantiated using the 'new' operator
		 * Use the available methods in the NumberFormat class to get the instance
		 */
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result4 = currency.format(123456);
		System.out.println(result4);
		System.out.println(NumberFormat.getPercentInstance().format(0.04));
		//Use method chaining to avoid creating the 'percent' object to reference
		//If 'percent' object was referenced more than once, then its viable to be instantiated
		
		
		/*
		 * Reading input from the user
		 * Scanner class is part of the java.util package
		 * Create a scanner object using the 'new' operator
		 * Inside the new Scanner'()' specify the input location; terminal, file, etc.
		 * scanner class has methods; nextByte(), nextDouble(), nextLine()
		 * next() just accesses the first token, use nextLine() for the entire line input
		 */
		/*
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Enter your Salary: ");
		double doubleNumber = scanner.nextDouble();
		System.out.println("Your Salary: " + NumberFormat.getCurrencyInstance().format(doubleNumber));
		
		System.out.println("Enter your Age: ");
		byte byteNumber = scanner.nextByte();
		System.out.println("Your Age: " + byteNumber);

		System.out.println("Enter your Name: ");
		scanner.nextLine();
		String line = scanner.nextLine().trim();
		System.out.println("Your Name: " + line);
		*/
		
		/*
		 * Comparison Operators are used to compare primitive values
		 * x == y equality operator
		 * x != y in-equality operator
		 * x >= y greater than or equal to
		 * x <= y less than or equal to
		 */
		
		/*
		 * Logical Operators are used to combine multiple boolean values/expressions
		 * x && y 'AND' if both x and y are true, the result will be true
		 * x || y 'OR' if either x or y or both are true, the result will be true
		 * !x 'NOT' reverses a boolean value. True becomes false. 
		 */
		
		/*
		 * If Statements are decisions based on conditions
		 * if (condition1)
		 * 		statement1
		 * else if (condition2)
		 * 		statement2
		 * else
		 * 		statement3
		 * To execute multiple statements, wrap the statements in {}
		 */
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Temperature: ");
		byte temp = scanner.nextByte();
		if (temp > 30) {
			System.out.println("It's a hot day!");
			System.out.println("Drink water!");
		}
		else if (temp > 20) 
			System.out.println("It's a beautiful day!");
		else 
			System.out.println("It's a cold day!");
		*/
		
		/*
		 * Ternary Operators are sued as a shorthand for if statements
		 * Makes use of the ? and :
		 * Condition ? if_condition_True : if_condition_False;
		 */
		int income = 120000;
		boolean hasHighIncome = income > 100000;
		//Simplifying if statements

		String className;
		if (income > 100_000)
			className = "First Class";
		else
			className = "Economy Class";
		//This can be simplified using Ternerary Operator
		
		String classType = income > 100000 ? "First Class" : "Economy Class";

		/*
		 * Switch statements can execute different parts of code depending on value of variable
		 * switch (expression) {
		 * 		case 1:
		 * 			statement1
 		 *			break;
 		 *		case 2:
		 * 			statement2
 		 *			break;
 		 *		default:
 		 *			default_statement
 		 *	}
		 */
		/*		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for month");
		byte month = scanner.nextByte();
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("Number of days in this Month is 31!");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("Number of days in this Month is 30!");
				break;
			case 2:
				System.out.println("Number of days in this Month is 28, or 29 it's leap year!");
				break;
			default:
				System.out.println("Incorrect Month entry!");
		}
		*/
		
		/*
		 * For loops are useful when the number of repetitions of some code is known
		 * Declare a loop variable (or loop counter) 
		 * In each iteration, increment counter to reach the number of times to execute some code
		 * for (int i = 0; i < repetition_Number; i++)
		 * 		statement
		 */
		
		/*
		 * While loops are useful when number of repetitions for a code is not known 
		 * This may be dependent on the values at run-time (eg what the user enters).
		 * Use break statement to jump out of a loop.
		 * while (someCondition) {
		 * 		statement
		 * 		if (someCondition)
		 * 		break;
		 * }
		 */
		/*
		String input = "";
		Scanner scanner = new Scanner(System.in);
		while (!input.equals("quit")) {
		//The code is checking if input DOES NOT EQUAL "quit"
		//Do not use the while(input != "quit")
		//input is a String, which is a reference type, and != comparator, will compare the address
		//In this case, it will compare the address, and not their value
			System.out.println("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		}
		*/
		
		/*
		 * Do While loops are similar to While loops, but are executed at least once
		 * In contrast, a while loops may never get executed if the condition is initially false
		 * do {
		 * 	statement
		 * } while (someCondition);
		 */
		/*
		String input = "";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		} while (!input.equals("quit"));
		*/
		
		/*
		 * Making use of break and continue statements
		 * Use break statement to terminate the loop
		 * Use continue statement to move control to the beginning of the loop
		 */
		/*
		String input = "";
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Input: ");
			input = scanner.next().toLowerCase();
			if(input.equals("pass"))
				continue;
			if(input.equals("quit"))
				break;
			System.out.println(input);
		}
		*/
		
		/*
		 * For-each loops are useful for iterating over an array or a collection
		 * Limited to forward only iteration, and cannot iterate in reverse
		 * Do not have access to the index of the item
		 * int[] numbers = {1, 2, 3, 4};
		 * 		for (int number : numbers)
		 */
		String[] fruits = {"Apple", "Mango", "Orange"};
		for(String fruit : fruits)
			System.out.println(fruit);
		
		for (int i = fruits.length-1; i >= 0; i--)
			System.out.println(fruits[i]);
		//Declare a variable of the same type as that of the array
		//Iterates through each element in the array
		
	}
}



