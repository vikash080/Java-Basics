import java.util.*;
public class TimeConverter {
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter time");
		int t= sc.nextInt();
		
		double hr= convertToHours(t);
		System.out.println("time in hrs "+hr);
	}

	public static double convertToHours(int minutes)
	{
		
		 return minutes/60.0;
	}
}
