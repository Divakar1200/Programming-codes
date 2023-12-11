package org.jsp.ProgrammingApp;

import java.util.Scanner;

public class evenodd 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to Check wether the number is even or odd :");
		int s = sc.nextInt();
		if(s%2==0)
		{
			System.out.println(s+" is Even Number.");
		}
		else if(s%2!=0)
		{
			System.out.println(s+" is Odd Number.");
		}
	}
}
