package ccp;

public class Probelem19 {
	public static void display(int n,int p)
	{
		//Decelering a integer value result as 1
		int res=1;
		//Running a loop for integer i
		for(int i=1;i<=p;i++)
		{
			//Multiplying the no p times
			res *= n;
		}
		//Printing the result of power of no
		System.out.println(res);
	}
}
