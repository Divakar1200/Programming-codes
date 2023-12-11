package org.jsp.PracticeProgramApp;

import java.util.Scanner;

public class Condition 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter your age to check weather you are a adult or not : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18 && age<=80)
		{
			System.out.println("Adult");
//			System.out.println("You are eligible now. So, would you like procced (y / n) : ");
//			String ch = sc.next();
//			if(ch=="y")
//			{
//				System.out.println("No you can make this all documents for your usage :");
//				System.out.println("1: Pancard");
//				System.out.println("2: Votecard");
//				System.out.println("3: Driving License");
//				System.out.println("4: Passport");
//				System.out.println("5: cards for transaction");
//			}
//			else if(ch=="n")
//			{
//				System.err.println("Thank you...");
//			}
//			else
//			{
//				System.out.println("You are eligible now. So, would you like procced (y / n) : ");
//				if(ch=="y")
//				{
//					System.out.println("No you can make this all documents for your usage :");
//					System.out.println("1: Pancard");
//					System.out.println("2: Votecard");
//					System.out.println("3: Driving License");
//					System.out.println("4: Passport");
//					System.out.println("5: cards for transaction");
//				}
//				else
//				{
//					System.err.println("Thank you...");
//				}
//			}
			
		}
//		else
//		{
//			System.err.println("Not an Adult");
//			System.err.println("Sorry can't procced forward");
//		}
		if(age>=81 && age<=100)
		{
			System.err.println("Congrats yoo!...You are one of the strongest to live this long. May God Bless you");
		}
		if(age>=101 && age<=120)
		{
			System.err.println("Yoo!...it's unbeliveable. You have seen so much, thanks to live this long in this planet.");
		}
		if(age>=121 && age<=150)
		{
			System.err.println("You are unbeliveable!...No words to say.");
		}
		if(age>=151 && age<=180)
		{
			System.err.println("How are you still alive?...You should be probably dead long time ago. Are you GOD or something...");
		}
		if(age>=181 && age<=200)
		{
			System.err.println("I think there is some issue with this window's software, that's why I can see you...I know you are a ghost, and probably I'm too...");
		}
		if(age>=201 && age<=300)
		{
			System.err.println("Shutup and uninstall your application, and through this PC.");
		}
		if(age>=301)
		{
			System.err.println("Are you Dumb or what...Just look what have you entered for age,...Dumass!");
		}
	}
}
