package org.jsp.ArrayApp;

import java.util.Scanner;

public class StringToArray 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String to convert it into array :");
		String str = sc.next();
		char arr[]= new char[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			arr[i]= str.charAt(i);
		}
		for(int j=0; j<str.length(); j++)
		{
			System.out.println("Element at arr["+j+"] is "+arr[j]);
		}
}
}
