package ccp;

import java.util.Scanner;

public class Probelem16app {
	public static void main(String[]args)
	{
		//Creating a scanner object to import Scanner libraries
				Scanner sc= new Scanner(System.in);
				//Asking the user to enter the number
				System.out.println("Enter a no");
				//Reading use input as integer
				int no = sc.nextInt();
				
				//Calling the display method of class Problame16
				Probelem16.display(no);
	}
}
