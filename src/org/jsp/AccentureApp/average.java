package org.jsp.AccentureApp;

import java.util.Scanner;

public class average 
{
	
	static float averages(int d, int e, int f)
	{
		float avg=0.0f;
		avg = d+e+f/3;
		return avg;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number :");
		int a= sc.nextInt();
		System.out.println("Enter second number :");
		int b= sc.nextInt();
		System.out.println("Enter third number :");
		int c= sc.nextInt();
		
		float ans= average.averages(a, b, c);
		System.out.println(ans);
	}
}
