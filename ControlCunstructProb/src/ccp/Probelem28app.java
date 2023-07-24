package ccp;

import java.util.Scanner;

public class Probelem28app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner(System.in);
		//Asking user to give the input as integer
		 System.out.println("Enter a number for getting prime no till n");
		 //Taking the input as integer data-type
		 int n = sc.nextInt();
		 //Calling the 'prime' method of class 'Probelem28'
		 Probelem28.prime(n);
	}

}
