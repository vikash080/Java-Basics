package ccp;

public class Probelem30 {
	public static void palindrome(int n)
	{
		//Initializing the value rev as 0;
		int rev =0;
		//Running a while loop until n==0;
		while(n!=0)
		{
			//Taking reminder of n/10
			int rem = n%10;
			//Storing the value of rem in reverse order
			rev = rev*10+rem;
			//removing the used digit
			n=n/10;
		}
		//Checking if the no is equal to the reversed no
		if(n==rev)
		{
			//if yes print
			System.out.println("Is a palindrome");
		}
		else
			//else print
			System.out.println("not a palindrome");
	}
	

}
