package ccp;

public class Probelem25 {
	public static void factorial(int n)
	{
		//initiating the integer as fact as 1
		int fact =1;
		//Loop for checking all the values of i till n
		for(int i=1;i<=n;i++)
			
		{
			//here doing fact = fact* i(current value)
			fact*=i;
		}
		
		System.out.println("Factorial of "+n+" is = "+fact);
		
	}
}
