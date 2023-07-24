package ccp;

import java.util.Scanner;

public class Probelem18app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
				Scanner sc= new Scanner(System.in);
				//Asking the user to enter the range
				System.out.println("Enter any range");
				//Reading use input as integer
				int n = sc.nextInt();
				
				//Calling the display method of class Problame18
				Probelem18.display(n);
	}

}
