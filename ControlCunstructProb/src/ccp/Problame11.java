package ccp;

public class Problame11 {
	public static void display(int a)
	{
		//Checking weather the age lies in child range or not
		if(a>=0&&a<=12)
			System.out.println("Child");
		//Checking weather the age lies in teen range or not
		else if(a>=13&&a<=19)
			System.out.println("Teen");
		//Checking weather the age lies in Adult range or not
		else if(a>=20&&a<=59)
			System.out.println("Adult");
		//Checking weather the age lies in Senior range or not
		else if(a<=60)
			System.out.println("Senior");
		//If none of the value is valid then print this statement
		else
			System.out.println("Invalid age");
	}
}
