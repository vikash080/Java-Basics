package ccp;

import java.util.Scanner;

public class Problame5app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc= new Scanner(System.in);
		//Asking the user to enter a letter as a char input
		System.out.println("Enter a letter");
		//Reading the user input
		char ch = sc.next().charAt(0);
		//Calling the display method of Paroblame5 class
		Problame5.display(ch);
	}

}
