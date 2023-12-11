package org.jsp.AccentureApp;

import java.util.Scanner;

// Autobiographics Number - It is number 'N' in which the first digit of 'N' represent the count of the number of Zeros(0) in 'N', 
//                          the second digit represents the count of the number of ones in  'N', and so on.

public class Autobiographics_Number 
{
	int zero=0;
	int one=0;
	int two=0;
	int four=0;
	
	static int countdigit(int a)
	{
		int b=1;
		if(a==0)
		{
			b=0;
			return b;
		}
		else
		return b;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a number wether it is Autobiographics number or not :");
		int input = sc.nextInt();
		int len = String.valueOf(input).length();   //to find the length of the number
		System.out.println("Length of the number is "+len);
		int out= Autobiographics_Number.countdigit(input);
		System.out.println(out);
	}

}
