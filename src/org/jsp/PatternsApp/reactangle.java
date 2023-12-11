package org.jsp.PatternsApp;

import java.util.Scanner;

public class reactangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of stars :");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n+8; j++)
				{
					System.out.print("*");
				}
			System.out.println();
		}
	}
}
