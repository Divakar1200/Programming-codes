package org.jsp.ArrayApp;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minElementInArray {
	
	public static void findMin(int[] arr, int m) {  // minimum element in array
		int check = arr[0];
		for(int n=1; n<m-1; n++) {
			if(check > arr[n]) {
				check = arr[n];
			}
		}
		System.out.println("Min Element in array - "+check);
	}
	
	public static void main(String[] args) {
		int[] arr = {9, 5, 3, 12, 45, 34, 65};
		int m = arr.length;
		Arrays.sort(arr);
		
		minElementInArray.findMin(arr, m);
		System.out.println("Max Element in array - "+arr[m-1]);
	}
}
