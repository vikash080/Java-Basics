package ccp;

import java.util.Scanner;

public class Probelem22app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a scanner object to import Scanner libraries
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Want to continue say ctu else to stop say stop");
		String str = sc.nextLine();
		/*while(str=="ctu")
		{
			
				//Asking the user to enter a character 
				System.out.println("Enter a char for check");
				//Reading the user input as character data-type
				char ch = sc.next().charAt(0);
				//Calling the 'vowel' method of Paroblame22 class
				Probelem22.vovel(ch);
			
			
			if(str=="stop")
				break;
			
		}*/
		for(int i =0;;i++)
		{
			//Asking the user to enter a character 
			System.out.println("Enter a char for check");
			//Reading the user input as character data-type
			char ch = sc.next().charAt(0);
			//Calling the 'vowel' method of Paroblame22 class
			Probelem22.vovel(ch);
			str = sc.nextLine();
		
		
		if(str=="stop")
			break;
		}
		
	}

}
