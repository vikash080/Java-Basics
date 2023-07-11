import java.util.*;
class DecrementOperatorAdv
{
	public static void main(String[] args)
	{
		int a=10;
		int b;
		int c=10;
		int d;
		//PRE decrement
		
		b = --a;
		System.out.println(a); 
		System.out.println(b);

		//POST decrement

		d = c--;
		System.out.println(c); 
		System.out.println(d);
	}
}