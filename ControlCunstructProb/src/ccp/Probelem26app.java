package ccp;

import java.util.Scanner;

public class Probelem26app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner(System.in);
		//Asking the user to enter a numeric value
		 System.out.println("Enter a number to get fibonachi series");
		 //Taking and reading the user given value of n
		 int n = sc.nextInt();
		 //Calling the 'fibo' method of class"Probelem26"
		 Probelem26.fibo(n);
	}

}
