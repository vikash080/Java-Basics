package ccp;

import java.util.Scanner;

public class Problame1 {
	public static void main(String[]args)
	{
		//Creating a scanner object to import Scanner libraries
		Scanner sc= new Scanner(System.in);
		//Asking the user to enter a number
		System.out.println("Enter any no");
		//Reading the user input
		int no = sc.nextInt();
		//Calling the display method which is insideProblame1app class 
		Problame1app.display(no);
	}
}
