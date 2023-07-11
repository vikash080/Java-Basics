package Tech;
import java.util.Scanner;

public class ifState {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		if(marks>90)
		{
			System.out.println("Welcome to tech club");
		}
	}