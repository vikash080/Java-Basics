package loop;

public class LoopAss011 {
	public static void main(String []args)
	{
		for(int i = -100;i<=100;i++)
		{
			if(i<0 && i%2==0)
			{
				System.out.println(i);
			}
			else if(i>0 && i%2 !=0)
			{
				System.out.println(i);
			}
		}
	}
}
