package loop;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 no's");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int gcd =1;
		int i;
		for(i=1;i<=n1&&i<=n2;i++)
		{
			if(n1%i==0&&n2%i==0)
				gcd =i;
		}
		System.out.println(gcd);
		
	}

}
