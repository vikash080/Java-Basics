package loop;

public class LoopAss012 {
	public static void main(String[]args)
	{
		int i=-100;
		while(i<=100)
		{
			if(i<0 && i%2==0)
			{
				System.out.println(i);
			}
			else if(i>0 && i%2 !=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
