package org.jsp.PracticeProgramApp;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class Tables {
	
	public static void table(int n, int m) {
		for(int i=n; i<=m; i=i+n) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to print multiple of the number - ");
		int a = sc.nextInt();
		System.out.println("Enter the number upto where you want to print multiple - ");
		int b = sc.nextInt();
		Tables.table(a, b);
	}
}
