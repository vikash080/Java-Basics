package ccp;

import java.util.Scanner;

public class Probelem15app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner(System.in);
		//Asking the user to enter three number
		System.out.println("Enter any 3 no's");
		//Reading the user input as integer
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//Calling the display method of Paroblame15 class
		Probelem15.display(a,b,c);
	}

}
