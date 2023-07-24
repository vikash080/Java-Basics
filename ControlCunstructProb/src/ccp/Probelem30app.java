package ccp;

import java.util.Scanner;

public class Probelem30app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner(System.in);
		//Asking the user to enter a number
		 System.out.println("Enter a no");
		//Reading the user input
		 int n = sc.nextInt();
		//Calling the 'palindrome' method of Paroblame30 class
		 Probelem30.palindrome(n);
	}

}
