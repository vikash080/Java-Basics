package ccp;

public class Probelem26 {
	public static void fibo(int n)
	{
		//initiating value of a as 0
		int a= 0;
		//initiating value of b as 1
		int b=1;
		//printing a and b
		System.out.print(a+" "+b);
		//Running loop for i and incrementing till n
		for(int i=2;i<=n;i++)
		{
			//initiating c as sum of a and b
			int c = a+b;
			//printing c
			System.out.print(" "+c);
			//changing the value of a to b and b to c
			a=b;
			b=c;
			
		}
	}
}
