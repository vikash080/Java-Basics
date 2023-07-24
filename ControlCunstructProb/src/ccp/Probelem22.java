package ccp;

public class Probelem22 {
	public static void vovel(char ch)
	{
		//checking if the character is in upper case or not
		if(ch>='A'&& ch<='Z')
			{
			//Checking if the given char is vowel or not
			if(ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				System.out.println("Upper case vowel");
			//else are constant
			else
				System.out.println("Upper case constant");
			}
		
		//checking if the character is in upper case or not
		else if(ch>='a'&& ch<='z')
			{
			//Checking if the given char is vowel or not
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				System.out.println("Lower case vowel");
			//else are constant
			else
				System.out.println("Upper case constant");
			}
		
		//checking if the character is digit or not
		else if(ch>='0'&& ch<='9')
			System.out.println("digit");
		//Rest are special char
		else
			System.out.println("Special char");
	}
}
