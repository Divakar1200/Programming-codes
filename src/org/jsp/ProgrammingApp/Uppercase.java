package org.jsp.ProgrammingApp;

public class Uppercase 
{
	public static void main(String[] args) 
	{
		char ch= 'A';
		if(ch>='a' && ch<='z')
		{
			System.out.println((char)(ch-32));
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println((char)(ch+32));
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}
