import java.util.*;
public class approach01 {
	public static void main(String[]args)
	{
		int a;
	    int b;

	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a num 1");
	    a =sc.nextInt();
	    System.out.println("Enter a num 2");
	    b =sc.nextInt();
	    swap(a,b);
	}
	
	public static void swap(int x,int y)
	{
		int z = x;
		x= y;
		y=z;
		
		System.out.println("value of a"+x);
		System.out.println("value of b"+y);
	}
}
