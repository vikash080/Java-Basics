package loop;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no");
		int n = sc.nextInt();
		int rev =0;
		while(n!=0)
		{
			int rem = n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}

}