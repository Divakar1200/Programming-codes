package org.jsp.SelfSolveProgram;

import org.jsp.HelperClass.Helper;

/* Some Example of Circular Prime number for reference - 2, 3, 5, 7, 11, 13, 17, 37, 79, 113, 197, 199, 721, 1193 */

public class CircularPrime {
	// method to check prime number or not
	public static boolean isPrime(int num) {

		if (num % num == 0 && num % 1 == 0) {
			// then we check if the number is 2 or 3 if yes, then return true
			if (num == 2 || num == 3) {
				return true;
			}
			// if the number is not 2 and 3 then check if the number is divisible with 2 or
			// 3, if not divisible then return true
			if (num != 2 && num != 3 && num % 2 != 0 && num % 3 != 0) {
				return true;
			}
		}
		// if the number doesn't match all the above condition then return false
		return false;
	}

	// method to check circulate prime number
	public static boolean circularPrime(String number) {
		/*
		 * let take a number for example number=721 the length of the number is 3 so if
		 * it is circular prime then, each circular number should be prime which means -
		 * 721 is prime, 172 is prime, 217 is prime So for each time the number is
		 * considered as prime we will count, so at the end the count should be 3 So the
		 * logic is, if the 'length' of the number and 'count' is equal then we can say
		 * that, the number is Circular Prime Number.
		 */
		int count = 0;
		int size = number.length();
		int num = Integer.parseInt(number);
		for (int i = 0; i < number.length(); i++) {
			int temp = 0;
			for (int j = 0; j < number.length(); j++) {
				int last = num % 10; // taking the last digit out example=1
				num = num / 10; // removing the last digit and keeping the front digits example=72
				temp = last + temp * 10; // adding the last digit in front example=172
			}
			if (isPrime(temp) == true) {
				count++; // whenever the circular number is prime increase the count by 1
			}

			// System.out.println(num);
			// System.out.println(temp);

			num = temp;
			temp = 0;

			// System.out.println(count);
			// System.out.println(size);

			if (count == size)
				return true;
		}
		return false;
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Enter a number to check if it is circular prime or not - ");
		String x = String.valueOf(Helper.input());
		if (circularPrime(x) == true)
			System.out.println(x + " is a circular prime");
		else
			System.err.println(x + " is not a circular prime");
	}

}
