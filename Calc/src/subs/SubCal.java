package subs;

import java.util.Scanner;

public class SubCal {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos = ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		SubCalApp.substraction(a, b);
	}

}
