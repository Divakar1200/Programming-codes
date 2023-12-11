package org.jsp.interviewprogramming;

/* Recursion is a powerful programming technique that allows a function to call itself in order to solve a problem.
   It is particularly useful in situations where a problem can be broken down into smaller, similar subproblems. */

import java.util.Scanner;

public class Recursion_Program {
	public static void main(String[] args) {
		System.out.println("Enter a number to find it's factorial");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = Recursion_Program.factorial(a);
		System.out.println("factorial of the number "+a+" is "+result);
	}
	
	/* In this example, we are calculating the factorial of a number using recursion. 
	 * The factorial method takes an integer n as input and returns the factorial of n. 
	 * It uses a base case (when n is 0 or 1) to stop the recursion and a recursive case(when n is greater than 1) 
	 * to calculate the factorial by calling itself with a smaller value (n - 1). */
	
	public static int factorial(int n){
		if(n==0 || n==1) {
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
}
