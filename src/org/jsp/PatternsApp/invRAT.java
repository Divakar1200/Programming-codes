package org.jsp.PatternsApp;

import java.util.Scanner;

public class invRAT 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter prefered number of stars in column :");
		int n= sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || j==n || i<=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
