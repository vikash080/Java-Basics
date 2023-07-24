package ifElse;

public class Calculater {
	public static void display(double x,double y,char c)
	{
		//Checking and printing the value of "+" operation
		if(c=='+')
			System.out.println(x+y);
		//Checking and printing the value of "-" operation
		else if(c=='-')
		{
			if(x>y)
			System.out.println(x-y);
			
			else if(y>x)
				System.out.println(y-x);
		}
			
		//Checking and printing the value of "*" operation
		else if(c=='*')
			System.out.println(x*y);
		//Checking and printing the value of "/" operation
		else if(c=='/')
		{
			
			System.out.println(x/y);
		}
		//Checking and printing the invalid input
		else
			System.out.println("You have to enter within +,-,*,/");
	}
}
