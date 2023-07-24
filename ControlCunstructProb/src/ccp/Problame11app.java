package ccp;

import java.util.Scanner;

public class Problame11app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner(System.in);
		//Asking the user to enter their age
		System.out.println("Enter the age ");
		//Reading the user input as integer type
		int age = sc.nextInt();
		//Calling the display method of Paroblame11 class
		Problame11.display(age);
	}

}
