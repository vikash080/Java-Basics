package ccp;

import java.util.Scanner;

public class Probelem29app {
	public static void main(String[]args)
	{
		
		//Creating a scanner object to import Scanner libraries
	Scanner sc = new Scanner(System.in);
	//Asking the user too enter any number to get sum of its digit
	 System.out.println("Enter a no");
	 //Reading the integer value of n 
	 int n = sc.nextInt();
	 //Calling the 'sumDig' method of class 'Probelem29'
	 Probelem29.sumDig(n);
	}
}
