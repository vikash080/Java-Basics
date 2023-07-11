import java.util.Scanner;
public class problame04 {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 =sc.nextLine();
        System.out.println("Enter another string");
        String str2 =sc.nextLine();

        String str3 = joinStrings(str1,str2);
        System.out.println(str3);
    }



    public static String joinStrings(String st1,String st2)
    {
        String st3 = st1+st2;
        return st3 ;
    }
    
}
