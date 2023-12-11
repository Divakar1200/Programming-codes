package org.jsp.SelfSolveProgram;

import org.jsp.HelperClass.Helper;

public class Test {
	public static void main(String[] args) {
		String number = Helper.factor(Helper.input());
		int sum = 0;
		for (int i = 0; i < number.length(); i++) {
			// converting the String into integer to add the factor's
			System.out.println(Integer.parseInt(number, number.charAt(i)));
//			sum += Integer.parseInt(number, number.charAt(i));
		}
		System.out.println(sum);
	}
}
