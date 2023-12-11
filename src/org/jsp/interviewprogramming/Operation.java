package org.jsp.interviewprogramming;

/* This class is dependent on Complex.java and here is the code
 * 
 *  public class Complex {
	
	private int a;
	private int b;
	
	public Complex(int i, int j) {
		this.a= i;
		this.b= j;
	}
	
	public Complex add(Complex c) {
		int a = this.a + c.a;
		int b = this.b + c.b;
		return new Complex(a, b);
	}
	
	public Complex mul(Complex c) {
		int a = this.a * c.a;
		int b = this.b * c.b;
		return new Complex(a, b);
	}
	
	public String toString(){
		return a+"+"+b;
		
	}
	
	public static void main(String[] args) {
		System.err.println("This class is associated with Operation.class");
	}
}
*/



public class Operation {
	public static void main(String[] args) {
		
		System.err.println("This class is associated with Complex.class");
		
        // Create objects of Complex class
        Complex x = new Complex(5, 3);
        Complex y = new Complex(2, 4);

        // Perform operations
        Complex resultAdd = x.add(y);
        Complex resultMul = x.mul(y);

        // Print the results
        System.out.println("x + y = " + resultAdd);
        System.out.println("x * y = " + resultMul);
    }
}
