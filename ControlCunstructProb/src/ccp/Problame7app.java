package ccp;

import java.util.Scanner;

public class Problame7app {
	public static void main(String []args)
	{
		//Creating a scanner object to import Scanner libraries
		Scanner sc= new Scanner(System.in);
		//Asking the user to enter a number
		System.out.println("Enter any no");
		//Reading the user input of integer type
		int no = sc.nextInt();
		//Calling the display method of Paroblame7 class
		Problame7.print(no);
	}
}
