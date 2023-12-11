package org.jsp.ProgrammingApp;

import java.util.Scanner;

// Program to check whether a given string is palindrome or not
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a word to check weather it is a palindrome or not :");
		String str= sc.next();
		String rev="";
		for(int i=0; i<str.length(); i++)
		{
			rev= str.charAt(i)+rev;
		}
		if(rev.equalsIgnoreCase(str))
			System.out.println("It's a Palindrome "+rev);
		else
			System.err.println("Not a Palindrome "+"'"+rev+"'");
	}
}
