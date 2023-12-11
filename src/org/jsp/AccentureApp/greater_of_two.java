package org.jsp.AccentureApp;

import java.util.Scanner;

public class greater_of_two 
{
	static int bigger(int c, int d)
	{
		if(c==d)
			return c;
		if(d>c)
			return d;
		else
			return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a= sc.nextInt();
		System.out.println("Enter the second number :");
		int b= sc.nextInt();
		int ans = greater_of_two.bigger(a, b);
		System.out.println(ans+" is the bigger number among "+a+" and "+b);
		
	}
}
