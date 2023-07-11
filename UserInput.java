import java.util.Scanner;
class UserInput
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Byte veriable ");
		byte a = sc.nextByte();
		System.out.println("The value of a is "+a);

		
		System.out.println("Enter a short veriable ");
		short b = sc.nextShort();
		System.out.println("The value of b is "+b);

		
		System.out.println("Enter a int veriable ");
		int c = sc.nextInt();
		System.out.println("The value of c is "+c);

		
		System.out.println("Enter a long veriable ");
		long d = sc.nextLong();
		System.out.println("The value of d is "+d);

		
		System.out.println("Enter a float veriable ");
		float e = sc.nextFloat();
		System.out.println("The value of e is "+e);

		
		System.out.println("Enter a double veriable ");
		double f = sc.nextDouble();
		System.out.println("The value of f is "+f);

		
		System.out.println("Enter a Boolean veriable ");
		boolean g = sc.nextBoolean();
		System.out.println("The value of g is "+g);
	}
}