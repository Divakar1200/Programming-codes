package org.jsp.interviewprogramming;

// Write a program, to add two arrays and remove any duplicate element if it is there...

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckDublicateInArray {
	public static void main(String[] args) {
		String[] arr1 = {"mohit", "rohit", "rahul", "sonu", "raju"};
		String[] arr2 = {"raju", "mohan", "krishna", "rahul"};

		List<String> Combinedarray = new ArrayList<>(Arrays.asList(arr1));	// this array is used to store the unique elements according to the question
//		System.out.println(arr1.hashCode());
		for(String element: arr2) {    //function to remove duplicates from arraylist
			if(!Combinedarray.contains(element)) {
				Combinedarray.add(element);
			}
		}
		System.out.println(Combinedarray);  // arr2 is also added but duplicates has been removed.
		//--------------------------------------------------------------------------------------------main code--------------------------------------------
		
		List<String> error = new ArrayList<>();  // this list is used to store the duplicate elements
		for(String element: arr2) {
			if(Combinedarray.contains(element)) {
				error.add(element);
			}
		}
		System.err.println("Here are the duplicate words "+error);
	}
}
