package ccp;

import java.util.Scanner;

public class Probelem23app {

	 public static void main(String []args)
	 {
		//Creating a scanner object to import Scanner libraries
		 Scanner sc = new Scanner(System.in);
		//Asking the user to enter a number
		 System.out.println("Enter a number for checking even num");
		//Reading the user input as integer type
		 int n = sc.nextInt();
		//Calling the 'evenno' method of Paroblame23 class
		 Probelem23.evenno(n);
	 }
}
