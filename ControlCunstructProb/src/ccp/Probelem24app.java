package ccp;

import java.util.Scanner;

public class Probelem24app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner(System.in);
		//Asking user to give a input as number
		 System.out.println("Enter a number to get the sum of digit");
		 //Taking and reading input from user
		 int n = sc.nextInt();
		 //Calling to 'sumOf' method of class" Probelem24"
		 
		 Probelem24.sumOf(n);
	}

}
