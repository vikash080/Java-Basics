import java.util.Scanner;
public class problame10 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a char");
        char cha = sc.next().charAt(0);


        int a = decodeCharacter(cha);
        System.out.println(a);
    }
    public static int decodeCharacter(char ch)
    {
        return ch;
    }
}
