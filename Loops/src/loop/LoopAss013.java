package loop;

public class LoopAss013 {
	public static void main(String[]args)
	{
		int i=-100;
		do {
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
		while(i<=100);
	}
}
