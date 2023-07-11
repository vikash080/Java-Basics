import java.util.Scanner;
public class program06 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp in ferenhite");
        double f = sc.nextDouble();

        double temp = convertFahrenheitToCelsius(f);
    }

    public static double convertFahrenheitToCelsius(double F)
    {
        double C;
        C = (F - 32) * 5/9;
        return C;
    }

}
