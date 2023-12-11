package org.jsp.ProgrammingApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class number_from1_n 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a number till which you want to print :");
		int n = sc.nextInt();
		int i =1;
		try
		{
			if(i>=1 && i<=1000000)
			{
				while(i<=n)
				{
					System.out.println(i);
					i++;
				}
			}
			else
			{
				System.out.println("Invaild input");
			}
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		
	}
}
