package charCheck;

import java.util.Scanner;

public class CharacterApp {
	 public static void main(String []args)
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a char");
		 char ch = sc.next().charAt(0);
		 CharCh.display(ch);
		 
	 }
}
