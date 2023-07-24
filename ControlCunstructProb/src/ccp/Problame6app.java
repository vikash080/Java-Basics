package ccp;

import java.util.Scanner;

public class Problame6app {
	public static void main(String []args)
	{
		//Creating a scanner object to import Scanner libraries
		Scanner sc= new Scanner(System.in);
		//Asking the user to enter a number as marks
		System.out.println("Enter your marks");
		//Reading the user input as integer
		int marks= sc.nextInt();
		//Calling the display method of Paroblame6 class
		Problame6.display(marks);
	}
}
