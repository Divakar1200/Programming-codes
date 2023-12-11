package org.jsp.HelperClass;

import java.util.Scanner;

/* A class consist of set of code in the form of methods which are commonly used in the program...
 *  - methods for input like int, boolean, string, double
 *  - methods for counting, reverse, factor, etc  */


public class Helper {

	// method to take INTEGER input from user and return the value
	public static int input() {
		System.err.println("Enter the number(int) : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return x;
	}

	// method to take LONG input from user and return the value
	public static long input1() {
		System.err.println("Enter the number(long) : ");
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		return x;
	}

	// method to take STRING input from user and return the value
	public static String input2() {
		System.err.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		return x;
	}

	// method to take DOUBLE input from user and return the value
	public static double input3() {
		System.err.println("Enter the Decimal value : ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		return x;
	}

	// method to take BOOLEAN input from user and return the value
	public static boolean input4() {
		System.err.println("Enter the Boolean value : ");
		Scanner sc = new Scanner(System.in);
		boolean x = sc.nextBoolean();
		return x;
	}

	// method to take STRING input from user and return the reverse STRING value
	public static String reverse(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

	// method to take INT input from user and return the reverse INT value
	public static int reverse(int x) {
		String s = Integer.toString(x);
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		int num = Integer.parseInt(rev);
		return num;
	}

	// method to take INT number as input from user and return numbers of digits in the number
	public static int countDigit(int x) {
		String number = Integer.toString(x);
		int length = number.length();
		return length;
	}

	// method to take find factor of a number
	public static String factor(int x) {
		String result = "";
		for (int i = 1; i < x; i++) {
			if (x % i == 0)
				result += i;
		}
		return result;
	}

}
