package ccp;

import java.util.Scanner;

public class Problame13app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner(System.in);
		//Asking the user to enter the code of the product they want
		System.out.println("Enter The product code");
		//Reading the user input as String
		String code= sc.nextLine();
		//Calling the display method of Paroblame13 class
		Problame13.display(code);
	}

}
