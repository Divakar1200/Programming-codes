package org.jsp.ProgrammingApp;

public class if_boolean_logic 
{

	static public boolean aIsBigger(int a, int b)
	{
		//CONDITION - If 'a' is greater than 'b' and if subtraction of 'a' and 'b' is greater than equals to 2
		if (a>b && (a-b)>=2)
		{
			System.out.println("True");
			return true;
		}
		else {
			System.err.println("False");
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
//		if_boolean_logic i = new if_boolean_logic();     // we need this line of code when the method is non-static
//		i.aIsBigger(4, 2);                               // we need this line of code when the method is non-static
		
		if_boolean_logic.aIsBigger(1, 2);  //because the aIsBigger boolean method is static that's why we don't need object to call it. we can call is with 'class_name.method_name' .
	}
}

