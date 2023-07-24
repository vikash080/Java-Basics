package loop;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no to get factorial");
		int num = sc.nextInt();
		int i=1;
		int fact =1;
		
		do {
			fact=fact*i;
			i++;
		}
		while(i<num);
		System.out.println("Factorial is "+fact);
	}

}
