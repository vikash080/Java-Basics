import java.util.Scanner;
public class problame02 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();

        System.out.println("Enter num2");
        int num2=sc.nextInt();

        int sub = subtractNumbers(num1, num2);
        int mul = multiplyNumbers(num1, num2);
        double div = divideNumbers(num1, num2);
        int rem = findRemainder(num1, num2);

        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);


    }
    public static int subtractNumbers(int num1, int num2)
    {
        int c;
return c= num1-num2;

    }

public static int multiplyNumbers(int num1, int num2)
{
    int d;
return d = num1*num2;

}

public static double divideNumbers(int num1, int num2)
{
    double e;
return e=num1/num2;

}

public static int findRemainder(int num1, int num2)
{
    int f;
return f=num1%num2;
}
    
}
