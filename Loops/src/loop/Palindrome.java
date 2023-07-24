package loop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String revstr ="";
		int strLen = str.length();
		for(int i =(strLen -1);i>=0;--i)
		{
			revstr = revstr+str.charAt(i);
		}
		if(str.toLowerCase().equals(revstr.toLowerCase()))
			System.out.println("is palindrome");
		else
			System.out.println("Not a palindrom");
	}

}
