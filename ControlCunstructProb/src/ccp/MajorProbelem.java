package ccp;

public class MajorProbelem {

	//Method to get the no's which is divisible by 2 from 1-n
	public static void DivBy2(int n)
	{
		System.out.print("Divisible by 2 - ");
		//checking every element from 1-n using loop with integer i and increment of i++
		for(int i =1;i<=n;i++)
		{
			//checking the no i is divisible to 2 or not
			if(i%2==0)
				//if yes then print
				System.out.print(i+",");
		}
		System.out.println(".");
	}
	
	//Method to get the no's which is divisible by 3 from 1-n
	public static void DivBy3(int n)
	{
		System.out.print("Divisible by 3 - ");
		//checking every element from 1-n using loop with integer i and increment of i++
		for(int i =1;i<=n;i++)
		{
			//checking the no i is divisible to 3 or not
			if(i%3==0)
				//if yes then print
				System.out.print(i+",");
		}
		System.out.println(".");
	}
	
	//Method to get the no's which is divisible by 5 from 1-n
	public static void DivBy5(int n)
	{
		System.out.print("Divisible by 5 - ");
		//checking every element from 1-n using loop with integer i and increment of i++
		for(int i =1;i<=n;i++)
		{
			//checking the no i is divisible to 5 or not
			if(i%5==0)
				//if yes then print
				System.out.print(i+",");
		}
		System.out.println(".");
	}
	
	//Method to get the no's which is divisible by 2 and 5 from 1-n
	public static void DivBy2N5(int n)
	{
		System.out.print("Divisible by 2 and 5 - ");
		//checking every element from 1-n using loop with integer i and increment of i++
		for(int i =1;i<=n;i++)
		{
			//checking the no i is divisible to 2 and 5  or not
			if(i%2==0 && i%5==0)
				//if yes then print 
				System.out.print(i+",");
		}
		System.out.println(".");
	}
	
	//Method to get the no's which is divisible by 3 and comes in the table of 5 from 1-n
	public static void DivBy3NT5(int n)
	{
		
		System.out.print("Divisible by 3 and 5 - ");
		//checking every element from 1-n using loop with integer i and increment of i++
		for(int i =1;i<=n;i++)
		{
			//checking the no i is divisible to 2 and 5  or not
			if(i%3==0 && i%5==0)
				//if yes then print 
				System.out.print(i+",");
		}
		System.out.println(".");
	}
	//Method to check and print all the possible no that are prime beteen 1-n
	public static void PrimeNo(int n)
	{
		// checking if the no is not equal to 0 or 1 if true then proceed
		if(n!=0 || n!=1) 
		{
		System.out.print("prime no's -");
		//for loop for increment i=1 to i=n 
		for(int i =1;i<=n;i++)
		{
			//for loop increment j=2(any no is div by 1)to j=n/2(till n/2 will reduce time)
			for(int j =2;j<n/2;j++)
			{
				//checking if every value of i is div by j or not
				if(i%j!=0) {
					//if not then print
					System.out.print(i+",");
					break;
				}
					//else print nothing
				else
				{
					//printing nothing
					System.out.print("");
					break;
				}
						
					
			}
			
		}
		System.out.println(".");
		}
	}
	
	//Method to check and print all the possible no that are prime between 1-n and even
	public static void EvenPrime(int n)
	{
		if(n!=0 || n!=1) 
		{
		System.out.print("prime no's and even -");
		//for loop for increment i=1 to i=n 
		for(int i =1;i<=n;i++)
		{
			//for loop increment j=2(any no is div by 1)to j=n/2(till n/2 will reduce time)
			for(int j =2;j<n/2;j++)
			{
				//checking if every value of i is div by j for prime no and also for even no
				if(i%j!=0 && i%2==0) {
					//if not then print
					System.out.print(i+",");
					break;
				}
					//else print nothing
				
						
					
			}
			
		}
		System.out.println(".");
		}
	}
	
	//Method to check and print all the possible no that are prime between 1-n and odd
	public static void OddPrime(int n)
	{
		if(n!=0 || n!=1) 
		{
		System.out.print("prime no's and odd -");
		//for loop for increment i=1 to i=n 
		for(int i =1;i<=n;i++)
		{
			//for loop increment j=2(any no is div by 1)to j=n/2(till n/2 will reduce time)
			for(int j =2;j<n/2;j++)
			{
				//checking if every value of i is div by j for prime no and also for odd no
				if(i%j!=0 && i%2!=0) {
					//if not then print
					System.out.print(i+",");
					break;
				}
					//else print nothing
				else
				{
					//printing nothing
					System.out.print("");
					break;
				}
						
					
			}
			
		}
		System.out.println(".");
		}
	}
	
	//Method to get the no's which is divisible by 3 and even or not from 1-n
	public static void EvenDiv3(int n)
	{
		System.out.print("The no is divisible by 3 and a Even no--");
		//checking every element from 1-n using loop with integer i and increment of i++
		for(int i =1;i<=n;i++)
		{
			//Checking weather the no is div by 2(for even no )and div by 3
			if(i%2==0 && i%3==0)
				//if yes print this
				System.out.print(i+",");
		}
		System.out.println(".");
	}
	
	//Method to get the no's which is divisible by 5 and odd or not from 1-n
	public static void OddDiv5(int n)
	{
		System.out.print("The no is divisible by 5 and a Odd no - ");
		//checking every element from 1-n using loop with integer i and increment of i++
		for(int i =1;i<=n;i++)
		{
			//Checking weather the no is div by 2(for odd no )and div by 5
			if(i%2!=0 && i%5==0)
				//if yes print this
				System.out.print(i+",");
		}
		
		System.out.println(".");
		
	}
	
	
}
