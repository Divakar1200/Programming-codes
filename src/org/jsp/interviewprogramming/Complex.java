package org.jsp.interviewprogramming;

/* write a Java program to create a new class Complex and define it according to this class 

public class operation
{
  public static void main(String[] args){
	// create the object of Complex class
	Complex x = new Complex(2, 3);
	Complex y = new Complex(3, 4);
	x = x.add(y);
	x = x.mul(y);
  }
}                           

*/

public class Complex {
	
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
