import java.util.*;
public class PlanetExplorer {
	public static void main(String[]args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius");
		double rad= sc.nextDouble();
		
		double ans = calculateSurfaceArea(rad);
		System.out.println("Area of sphare:="+ans);
		
	}
	public static double calculateSurfaceArea(double radius)
	{
	double answer= 4*(3.14)*(radius*radius);
		return answer;
	}
}
