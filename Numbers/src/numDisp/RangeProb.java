package numDisp;

public class RangeProb {
	public static void disp(int a)
	{
		if(a>0&&a<=10)
			System.out.println("Range 1");
		else if(a>10&&a<=20)
			System.out.println("Range 2");
		else if(a>20&&a<=30)
			System.out.println("Range 3");
		else if(a>30&&a<=40)
			System.out.println("Range 4");
		else if(a>40&&a<=50)
			System.out.println("Range 5");
		else
			System.out.println("Not in Range");
		
	}
}
