import java.util.*;
public class HalveIt {

	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		double halve = halveTheNumber(amount);
		System.out.println("halve = "+halve);
		
	}
	public static double halveTheNumber(double num)
	{
		return num/2;
	}
}
