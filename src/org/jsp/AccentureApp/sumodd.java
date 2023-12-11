package org.jsp.AccentureApp;

import java.util.Scanner;

public class sumodd 
{
	static int check(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				sum +=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number upto which you want to add even numbers :");
		int m= sc.nextInt();
		int ans= sumodd.check(m);
		System.out.println(ans);
	}
}
