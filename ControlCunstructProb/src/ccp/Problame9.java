package ccp;

public class Problame9 {
	public static void display(int y)
	{
		//Checking the year is that year is leap or not
		if(y/4==0 && y/40==0&&y/400==0)
			System.out.println("Leap Year");
		//If not print this
		else
			System.out.println("Not a leap Year");
	}
}
