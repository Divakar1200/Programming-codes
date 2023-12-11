package org.jsp.PatternsApp;

import java.util.Scanner;

public class Right_angle_tri 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number of stars in height you want");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
