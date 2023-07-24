package loop;

public class TeacherLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int sc = 1;sc<=5;sc++)
		{
			for(int cls =1 ;cls<=2;cls++)
			{
				for(int stu= 1;stu<=10;stu++)
				{
					if(sc%2!=0&&stu%2==0)
						System.out.println("school-"+sc+"student"+stu+"=  Student done assignment");
					
					else if(sc%2==0&&stu%2!=0)
						System.out.println("school-"+sc+"student"+stu+"=  Student did not done assignmet");
					else
						System.out.println("school-"+sc+"student"+stu+"=  Still doing");
				}
			}
		}
	}

}
