package ccp;

public class Problame13 {
	public static void display(String code)
	{
		//Taking switch case for the value code
		switch(code)
		{
		//If the value given is valid for "F01" case print this
		case "F01":
			System.out.println("Apple");
			break;
			//If the value given is valid for "F02" case print this
		case "F02":
			System.out.println("Banana");
			break;
			//If the value given is valid for "F03" case print this
		case "F03":
			System.out.println("Papaya");
			break;
			//If the value given is valid for "F04" case print this
		case "F04":
			System.out.println("Litch");
			break;
			//Other than this code print this
		
		
		default:
			System.out.println("Invalid code");
		}
	}
}
