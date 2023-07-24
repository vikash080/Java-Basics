package ccp;

import java.util.Scanner;

public class Probelem14app {
	public static void main(String[]args)
	{
		//Creating a scanner object to import Scanner libraries
		Scanner sc= new Scanner(System.in);
		//Asking the user to enter the length of rectangle
		System.out.println("Enter the length of rectangle");
		//Reading the user input as integer
		int l = sc.nextInt();
		//Asking the user to enter the bredth of rectangle
		System.out.println("Enter the bredth of rectangle");
		//Reading the user input as integer
		int b = sc.nextInt();
		//Calling the display method of Paroblame10 class
		Probelem14.display(l,b);
	}
}
