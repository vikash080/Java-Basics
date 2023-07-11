import java.util.*;
public class FinanceCalculator {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal,rate and time ");
		double p= sc.nextDouble();
		double r= sc.nextDouble();
		double t= sc.nextDouble();
		
		double intrest = calculateSimpleInterest(p,r,t);
		System.out.println("Intrest is "+intrest);
	}

	public static double calculateSimpleInterest(double principal, double rate, double time)
	{
		return principal*rate*time;
	}
}
