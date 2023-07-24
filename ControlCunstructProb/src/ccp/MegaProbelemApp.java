package ccp;

import java.util.Scanner;

public class MegaProbelemApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner (System.in);
		//Asking the user to enter a number
		System.out.println("Enter any no greter than 100");
		//Reading the user input as integer
		int n = sc.nextInt();
		//Checking weather the no is greater than 100 or not if no print
		if(n<100)
			System.out.println("Enter the no greter than 100");
		//if yes the go with this else statement
		else {
			//Calling the 'methods' from class " MajorProbelem "
			
			
			//Method declaration for no's divisible by 2
			MajorProbelem.DivBy2(n);
			//Method declaration for no's divisible by 3
			MajorProbelem.DivBy3(n);
			//Method declaration for no's divisible by 5
			MajorProbelem.DivBy5(n);
			//Method declaration for no's divisible by 2 and 5
			MajorProbelem.DivBy2N5(n);
			//Method declaration for no's divisible by 3 and 5
			MajorProbelem.DivBy3NT5(n);
			//Method declaration for no's which are prime
			MajorProbelem.PrimeNo(n);
			//Method declaration for no's which are prime and even
			MajorProbelem.EvenPrime(n);
			//Method declaration for no's which are prime and odd
			MajorProbelem.OddPrime(n);
			//Method declaration for no's even and divisible by 3
			MajorProbelem.EvenDiv3(n);
			//Method declaration for no's odd and divisible by 5
			MajorProbelem.OddDiv5(n);
		}
			
		}
		
	}


