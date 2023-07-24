package ccp;

public class Probelem27 {
	public static void gcd(int x,int y)
	{
		//initiating integer gcd as 1
		int gcd = 1;
		
		//Running a loop till the largest value in increment
		for(int i =1;i<=x&&i<=y;i++)
		{
			//checking if x and y both are divisible to a single value of i or not
			if(x%i==0&&y%i==0)
				//if yes store the value of i in gcd
				gcd =i;
		}
		System.out.println("gcd of "+x+" and "+y+" is = "+gcd);
	}
}
