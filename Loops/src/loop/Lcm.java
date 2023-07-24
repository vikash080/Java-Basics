package loop;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 no's");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a=(x>y)?x:y;
		int i;
		for(i=a;i<=x*y;i=i+a)
		{
			if(x%i==0||y%i==0)
				break;
		}
		System.out.println(i);
	}

}
