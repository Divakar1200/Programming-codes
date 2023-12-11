package org.jsp.AccentureApp;

import java.util.Scanner;

public class circumferance 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius :");
		float a = sc.nextFloat();
		double c= 2*3.14159*a;
		System.out.println("Circumference of circle is "+c);
	}
}
