package org.jsp.SelfSolveProgram;

import org.jsp.HelperClass.Helper;

/* A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number.
 * Example - Let's take the number 496 and check if it is a perfect number or not.
 *           the sum of factors (1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496)
 *           So, it's a perfect number... */

public class PerfectNumber {

	public static boolean perfectCheck(int n) {
		/*
		 * Here we are using a user defined class called 'Helper.java' in which we have a
		 * return type method 'factor()' which return the factor of the given number in
		 * the String format.
		 */
		String number = Helper.factor(n);
		int sum = 0;
		for (int i = 0; i < number.length(); i++) {
			// converting the String into integer to add the factor's
			sum += Integer.parseInt(number, number.charAt(i));
		}

		// to check weather the input number 'n' is equal to the sum of factor or not
		System.out.println(sum);
		if (sum == n) {
			return true;
		}
		return false;
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Program to check Perfect number :");
		if(perfectCheck(Helper.input()) == true) 
			System.out.println("It's a Perfect number");
		else
			System.err.println("Not a Perfect number");
	}
}
