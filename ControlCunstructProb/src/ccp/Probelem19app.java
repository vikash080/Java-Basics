package ccp;

import java.util.Scanner;

public class Probelem19app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a scanner object to import Scanner libraries
				Scanner sc= new Scanner(System.in);
				//Asking the user to enter the number
				System.out.println("Enter the no");
				//Reading use input as integer
				int no = sc.nextInt();
				//Asking to enter the power user want integer he number
				System.out.println("Enter the power");
				int pow =sc.nextInt();
				//Calling the display method of class Problame19
				Probelem19.display(no,pow);
	}

}
