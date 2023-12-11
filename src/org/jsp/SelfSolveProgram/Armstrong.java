package org.jsp.SelfSolveProgram;

import org.jsp.HelperClass.Helper;

public class Armstrong {
	// method which takes number and it's power as parameter and given the result
	// which is exponent of number
	public static int exponent(int num, int power) {
		int temp = num;
		int result = 0;
		for (int i = 0; i < power - 1; i++) {
			result = num * temp;
			num = result;
		}
		return result;
	}

	// method to check Armstrong number
	public static boolean armstrong(int num) {
		int temp = num;
		/*
		 * here in this method a number is passed 'num', if the sum of power of each
		 * digit in this number(result) is equal to the original - number 'num' then we
		 * can say that the given number is Armstrong number
		 */
		int size = String.valueOf(num).length();
		int result = 0;

		// loop to iterate between number and to add the exponent of each digit in
		// 'result'
		while (num != 0) {
			int last = num % 10;
			num = num / 10;
			result += exponent(last, size);
		}

		// 'temp' contains the original number and here we trying to match 'temp' and
		// 'result', if it matches then return true
		if (temp == result) {
			return true;
		}
		return false;
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Enter a number to check if it is armstrong number or not - ");

		// CircularPrime is a user defined class, in which we have a method to take user
		// input method name 'input()'
		if (armstrong(Helper.input()) == true) {
			System.out.println("it's a Armstrong number");
		} else {
			System.err.println("not a Armstrong number");
		}
	}

}
