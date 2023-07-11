import java.util.Scanner;
public class problame05 {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter speed");
        double s =sc.nextDouble();
        System.out.println("Enter time");
        double t = sc.nextDouble();

        double distance = calculateDistance(s,t);
        System.out.println(distance);
    }
    public static double calculateDistance(double speed, double time)
    {
        return speed*time;
    }

}
