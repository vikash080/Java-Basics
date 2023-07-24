package ccp;

public class Probelem15 {
	public static void display(int n1,int n2,int n3)
	{
		if(n1==n2&&n2==n3)
			System.out.println("All the nos are equal to each other");
		else if(n1>n2 && n1>n3)
			System.out.println(n1+" Is the largest");
		else if(n2>n1 && n2>n3)
			System.out.println(n2+" Is the largest");
		else if(n3>n1&&n3>n2)
			System.out.println(n3+" Is the largest");
		
			
	}
}
