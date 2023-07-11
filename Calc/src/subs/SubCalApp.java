package subs;

public class SubCalApp {

	public static void substraction(int a, int b)
	{
		if(a>b)
		{
			System.out.println(a-b);
		}
		else if(b>a) {
			System.out.println(b-a);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}
