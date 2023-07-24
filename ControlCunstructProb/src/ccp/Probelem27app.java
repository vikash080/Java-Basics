package ccp;

import java.util.Scanner;

public class Probelem27app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner(System.in);
		//Asking user to give two integer values 
		 System.out.println("Enter two getting gretest common divisor");
		 //Taking input no 1
		 int n1 = sc.nextInt();
		 //Taking input no 2
		 int n2 =sc.nextInt();
		 //Calling the 'gcd'method of class'Probelem27'
		 Probelem27.gcd(n1,n2);
	}

}
