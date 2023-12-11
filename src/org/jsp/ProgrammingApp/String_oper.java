package org.jsp.ProgrammingApp;

public class String_oper 
{
	static String ans = "This is Oyster";
	
	public static String withNo(String str)
	{
		return "String : "+str;
	}
	public static boolean twoE()
	{
		int count = 0;
		for(int i=0; i<ans.length(); i++)
		{
			char ch = ans.charAt(i);
			if(ch =='e') count++;
			if(count == 2)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(String_oper.withNo(ans));
		System.out.println("2 number of 'e' is present in given string : "+String_oper.twoE());
	}
}
