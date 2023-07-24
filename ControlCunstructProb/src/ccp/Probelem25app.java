package ccp;

import java.util.Scanner;

public class Probelem25app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner(System.in);
		//Asking user to give input as a number
		 System.out.println("Enter a number to get the factorial");
		 //Reading the user input as integer in n
		 int n = sc.nextInt();
		 //Calling the 'factorial'method of class"probelem25" 
		 Probelem25.factorial(n);
	}

}
