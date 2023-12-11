package org.jsp.ArrayApp;

import java.util.Scanner;

// Program to bubble short array

public class Bubble_short_array 
{	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter arr size :");
		int size= sc.nextInt();
		int arr[]= new int[size];
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter "+i+" elements of array");
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Now bubble shorting starts : ascending(>)");
		for(int i=0; i<size-1; i++)  // 'i' should not check the last, because if 'i' moves to last, then 'j' will be 'i+1' which will through 'ArrayIndexoutOfBounds' Exception
		{
			for(int j=i+1; j<size; j++)  // 'j' should always start +1 ahead of 'i' (if i=0, then j=1 || if i=1, then j=2)
			{
				if(arr[i]>arr[j])  // shorting in ascending order(>), and if you want it to be descending order use(<)
				{
					int temp = arr[i];   // swap method
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<size; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
