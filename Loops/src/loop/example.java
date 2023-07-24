package loop;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sc=1;
		int cls=1;
		int stu=1;
		while( sc<=5)
		{
			while(cls<=2)
			{
				while(stu<=10)
				{
					if( sc%2!=0&&stu%2==0)
						System.out.println("school-"+sc+"student"+stu+"=  Student done assignment");
					
					else if(sc%2==0&&stu%2!=0)
						System.out.println("school-"+sc+"student"+stu+"=  Student did not done assignmet");
					else
						System.out.println("school-"+sc+"student"+stu+"=  Still doing");
					
					
				}
				
				cls++;
			}
			sc++;
		}
	}

}
