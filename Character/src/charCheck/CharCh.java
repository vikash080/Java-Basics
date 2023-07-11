package charCheck;

public class CharCh {
	

	public static void display(char ch) {
		// TODO Auto-generated method stub
		if(ch>='A' &&ch<='Z')
			System.out.println("Char is in UpperCase");
		else if(ch>='a' &&ch<='z')
			System.out.println("Char is in LowerCase");
		else
			System.out.println("Number");
	}
}
