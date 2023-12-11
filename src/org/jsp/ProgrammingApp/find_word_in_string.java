package org.jsp.ProgrammingApp;

import java.util.Scanner;

// Program to count a alphabet or word in given string

public class find_word_in_string 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in); 
		System.out.println("Please enter the string to find 'h' in it ");
		String str= sc.next();
		String str1= str.toLowerCase();       // to convert the given string to lower case to avoid case sensitivity
		int count = 0;
		for(int i=0; i<str1.length()-1; i++)    // in this line the 'str.length()'... we put a -1 there because if the given string ends with 'h' it should check for the next character.
			                                  // if it does try to check because of 'i+1' then it will through an exception called StringIndexOutOfBounds
		{
			if(str.charAt(i)=='h' && str.charAt(i+1)=='i')
				count++;
		}
		System.out.println("No. of h is "+count);
	}
}
