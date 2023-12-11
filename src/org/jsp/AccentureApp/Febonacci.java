package org.jsp.AccentureApp;

public class Febonacci 
{
	public static void main(String[] args) 
	{
		int prev=0;
		int present = 1;
		int sum=1;
		int n= 10;
		for(int i=0; i<n; i++)
		{
			System.out.println(sum);
			prev = present;
			present = sum;
			sum=prev+present;
		}
			
	}
}
