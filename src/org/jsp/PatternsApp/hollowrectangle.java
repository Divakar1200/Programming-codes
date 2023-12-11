package org.jsp.PatternsApp;

import java.util.Scanner;

public class hollowrectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter prefered number of stars in breadth (+8 stars in length) :");
		int n = sc.nextInt();
		int m = n+8;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				if(i==1 || i==n || j==1 || j==m)
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
