package voteIf;

import java.util.Scanner;

public class IfElseApp {
public static void main (String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age = ");
	int age = sc.nextInt();
	
	IfElse.vote(age);
}
}
