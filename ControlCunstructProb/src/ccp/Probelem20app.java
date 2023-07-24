package ccp;

import java.util.Scanner;

public class Probelem20app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
				Scanner sc= new Scanner(System.in);
				//Asking the user to enter the length
				System.out.println("Enter the length");
				//Reading use input as double
				double l = sc.nextDouble();
				//Asking the user to enter the bredth
				System.out.println("Enter the bredth");
				//Reading use input as double
				double b = sc.nextDouble();
				
				//Calling the display calculateRectangleArea of class Problame20
				Probelem20.calculateRectangleArea(l,b);
	}

}
