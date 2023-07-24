package ccp;

import java.util.Scanner;

public class Problame2app {
	public static void main(String[]args)
	{
		//Creating a scanner object to import Scanner libraries
		Scanner sc= new Scanner(System.in);
		//Asking the user to enter their age
		System.out.println("Enter your age");
		//Reading use input as integer
		int age = sc.nextInt();
		
		//Calling the display method of class Problame2
		Problame2.display(age);
	}
}
