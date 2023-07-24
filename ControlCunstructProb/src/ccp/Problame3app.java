package ccp;

import java.util.Scanner;

public class Problame3app {
	public static void main(String[]args)
	{
		//Creating a scanner object to import Scanner libraries
		Scanner sc= new Scanner(System.in);
		//Asking the user to enter a Price
		System.out.println("Enter The price");
		//Reading the user input of integer type
		int price = sc.nextInt();
		//Calling the display method of Paroblame3 class
		Problame3.display(price);
	}
}
