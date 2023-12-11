package org.jsp.ArrayApp;

import java.util.Scanner;

public class TwoDArray 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of row :");
		int row= sc.nextInt();
		System.out.println("Enter the size of col :");
		int col= sc.nextInt();
		int [][] matrix= new int[row][col];
		
		// Loop for input in 2D array
		System.err.println("Enter the elements of array, in this format - 62 23 43 14 43,... then next line 34 98 24 53 32...");
		System.err.println("According to number of rows and column.");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++)
			{
				matrix[i][j]= sc.nextInt();
			}
		}
		
		// Searching for a particular number
		System.out.println("Enter a number to search in matrix :");
		int num= sc.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++)
			{
				if(matrix[i][j]==num)
					System.err.println("Yes, the given number is present and the location is ("+(i+1)+","+(j+1)+").");
			}
		}
		
		
		// Loop for printing the matrix
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
