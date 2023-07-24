package ccp;

import java.util.Scanner;

public class Problame9app {
	public static void main(String[]args)
	{
		//Creating a scanner object to import Scanner libraries
		Scanner sc= new Scanner(System.in);
		//Asking the user to enter a year as input
		System.out.println("Enter a year");

		//Reading the user input as integer type
		int year = sc.nextInt();
		//Calling the display method of Paroblame9 class
		Problame9.display(year);
	}
}
