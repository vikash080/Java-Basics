package switchCase;

import java.util.Scanner;

public class SwitchCal {
	public static void main(String []args)
	{
	Scanner sc =new Scanner(System.in);
	//Asking for entering 
	System.out.println("Enter any two double values");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	
	char ch= sc.next().charAt(0);
	
	
	switch(ch)
	{
	case('+'):
	{
		System.out.println(a+b);
		break;
	}
		
	case('-'):
	{
		System.out.println(a-b);
		break;
	}
		
	case('*'):
	{
		System.out.println(a*b);
		break;
	}
		
	case('/'):
	{
		System.out.println(a/b);
		break;
	}
		
	default:
	{
		System.out.println("You have a wrong input");
	}
	
	}
	}
}
