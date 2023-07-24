package ccp;

public class Problame4 {
	public static void display (int a)
	{
		//Checking weather the person is eligible to vote
		if(a>18)
			System.out.println("Vote Eligible");
		//If not then print the statement
		else
			System.out.println("Not Eligible");
	}

}
