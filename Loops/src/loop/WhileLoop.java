package loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		while(num>0)
		{
			System.out.println(num);
			num =num/2;
			
		}
	}

}
