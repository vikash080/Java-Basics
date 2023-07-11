import java.util.*;
public class HeightConverter {
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your height");
		double height = sc.nextDouble();
		
		double newa;
		newa= convertInchesToFeet(height);
		System.out.println("your height "+newa);
	}
	
	public static double convertInchesToFeet(double inches)
	{
		double ans = inches/12;
		return ans;
	}

}
