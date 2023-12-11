package org.jsp.ArrayApp;

import java.util.Scanner;

public class minmax 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size= sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)   // method to enter the elements of array
		{
			System.out.println("Enter ["+i+"] element in array :");
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter the number which you want to check inside array :");
		int c = sc.nextInt();
		
		for(int i=0; i<arr.length; i++)    // method to check the given number is present or not
		{
			if(arr[i]==c)
			{
				System.out.println("Here is the number "+arr[i]+" and the index value of the number is : "+i);
			}
		}
		System.out.println();
	}
}
