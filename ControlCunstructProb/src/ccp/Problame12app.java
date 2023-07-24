package ccp;

import java.util.Scanner;

public class Problame12app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner(System.in);
		//Asking the user to enter as sides of polygon
		System.out.println("Enter the no of sides of polygon");
		//Reading the user input as integer
		int sides = sc.nextInt();
		//Calling the display method of Paroblame12 class
		Problame12.display(sides);
	}

}
