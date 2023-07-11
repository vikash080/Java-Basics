import java.util.Scanner;
public class problame08 {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =sc.nextInt();

        int ans = squareNumber(n);
        System.out.println(ans);
    }
    public static int squareNumber(int num)
    {
        return num*num;
    }
}
