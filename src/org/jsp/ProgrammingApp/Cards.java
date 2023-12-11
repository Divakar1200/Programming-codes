package org.jsp.ProgrammingApp;

import java.util.Scanner;

public class Cards 
{
	public int fact(int f)
	{
		int final_num = 0;
		for(int i=1; i<=f; i++)
		{
			final_num = final_num+i;
		}
		return final_num;
	}
	int CardsPyramid(int n)
	{
		int a =-1;
		if(n!=0)
		{
			a= 3*n;
			return a;
		}
		else
		{
			return a;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.err.println("");
		System.out.println("Enter the level---");
		int m= sc.nextInt();
		
		Cards cc= new Cards();  //object of class Cards
		
		int num= cc.fact(m);    //calling function fact
		System.out.println(num);
		
		int card= cc.CardsPyramid(num);    //calling function CardsPyramid to count number of cards required
		System.out.println("Number of cards required to make "+m+"-level pyramid is "+card);
	}
}
