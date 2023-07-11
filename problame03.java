import java.util.Scanner;

public class problame03 {

    public static void main(String []args)
    {   
    int num1;
    int sum;

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a num 1");
    num1 =sc.nextInt();

    int doublenum = doubleTheNumber(num1);
    System.out.println(doublenum);
    } 

    public static int doubleTheNumber(int s)
    {
        
        return s*2;
    }

}