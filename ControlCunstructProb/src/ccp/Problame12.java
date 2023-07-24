package ccp;

public class Problame12 {
	public static void display(int s)
	{
		//Taking switch case for the value side(s)
		switch(s)
		{
		//If the side of polygon is 3 then print this
		case 3:
			System.out.println("Trangle");
		break;
		//If the side of polygon is 4 then print this
		case 4:
			System.out.println("Square");
			break;
			//If the side of polygon is 5 then print this
		case 5:
			System.out.println("Pentagon");
			break;
			//If the side of polygon is 6 then print this
		case 6:
			System.out.println("Hexagon");
			break;
			//If the side of polygon is 7 then print this
		case 7:
			System.out.println("Heptagon");
			break;
			//If the side are different than expected then print this
		case 8:
			System.out.println("Octagon");
			break;
		
		default:
			System.out.println("Some kind of polygon");
		}
	}
}
