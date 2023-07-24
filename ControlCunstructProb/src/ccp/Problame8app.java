package ccp;

import java.util.Scanner;

public class Problame8app {
	public static void main(String[]args)
	{
		//Creating a scanner object to import Scanner libraries
		Scanner sc= new Scanner(System.in);
		//Asking the user to enter their age 
		System.out.println("Enter your age");
		//Reading the user input of integer type
		int age = sc.nextInt();
		//Calling the display method of Paroblame8 class
		Problame8.display(age);
	}
}
