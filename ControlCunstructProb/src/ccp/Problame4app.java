package ccp;

import java.util.Scanner;

public class Problame4app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc= new Scanner(System.in);
		//Asking the user to enter the age
		System.out.println("Enter your age");
		//Reading the user input as age
		int age = sc.nextInt();
		//Calling the display method of Paroblame4 class
		Problame4.display(age);
	}

}
