import java.util.Scanner;
public class program09 {
    
    public static void main(String[]args)
    {
      
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =sc.nextInt();

        int ans = cubeNumber(n);
        System.out.println(ans);
    
    }
    public static int cubeNumber(int num)
    {
        return num*num*num;
    }
}
