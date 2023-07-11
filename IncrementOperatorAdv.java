import java.util.*;
class IncrementOperatorAdv
{
	public static void main(String[] args)
	{
		int a=10;
		int b;
		int c=10;
		int d;
		//PRE increment
		
		b = ++a;
		System.out.println(a); 
		System.out.println(b);

		//POST increment

		d = c++;
		System.out.println(c); 
		System.out.println(d);
	}
}