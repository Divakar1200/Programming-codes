package org.jsp.SelfSolveProgram;

import java.util.Scanner;

public class Palindrome {

	public static boolean palindromeCheck(String input) {
		/*
		 * A word is considered to be Palindrome when a word is spelled same in reverse
		 * as in forward example - 'level' is palindrome, but 'apple' is not a
		 * palindrome because in reverse it is 'elppa', which is not equal to original
		 * string.
		 */
		String temp = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			temp =  temp + input.charAt(i);
		}

		// here we check whether the reversed string is equal to original string or not
		System.out.println(temp);
		if (input.equalsIgnoreCase(temp)) {
			return true;
		}
		else{
			return false;
		}
	}

	// method for user input
	public static String input() {
		try (Scanner sc = new Scanner(System.in)) {
			return sc.next();
		}
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Enter a String to check wether it is palindrome or not");
		boolean result = palindromeCheck(input());
		if (result == true)
			System.out.println("It's a Palindrome");
		else
			System.err.println("Not a Palindrome");

	}

}
