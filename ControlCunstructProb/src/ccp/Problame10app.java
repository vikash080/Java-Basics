package ccp;

import java.util.Scanner;

public class Problame10app {
	public static void main(String[]args)
	{
		//Creating a scanner object to import Scanner libraries
		Scanner sc= new Scanner(System.in);
		//Asking the user to enter a number
		System.out.println("Enter a no");
		//Reading the user input
		int no = sc.nextInt();
		//Calling the display method of Paroblame10 class
		Problame10.display(no);
	}
}
