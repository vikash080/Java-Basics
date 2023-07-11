package ifElse;

import java.util.Scanner;

public class CharacterApp {

	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		//Asking for two double values
		System.out.println("Enter any two double values");
		//Taking two double values
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		//Reading the operation in character
		char ch= sc.next().charAt(0);
		//Calling the display method to perform
		display(a,b,ch);
		
		
	}
	public static void display(double a,double b, char ch)
	{
	//Checking and printing the value of "+" operation
			if(ch=='+')
				System.out.println(a+b);
			//Checking and printing the value of "-" operation
			else if(ch=='-')
			{
				if(a>b)
				System.out.println(a-b);
				
				else if(b>a)
					System.out.println(b-a);
			}
				
			//Checking and printing the value of "*" operation
			else if(ch=='*')
				System.out.println(a*b);
			//Checking and printing the value of "/" operation
			else if(ch=='/')
				
			{
				if(b==0)
					System.out.println("Denominater can not be Zero");
				else
				System.out.println(a/b);
			}
			//Checking and printing the invalid input
			else
				System.out.println("You have to enter within +,-,*,/");
	}
}
