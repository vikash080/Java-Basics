package ccp;

public class Probelem28 {
	public static void prime(int n)
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
}
