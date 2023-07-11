import  java.util.Scanner;
public class MethodOverloading {

    public static void calArea(int a)
    {
        int area = a*a;
        System.out.println("Area of square is "+area);
    }
    public static void calArea(float a)
    {
        //float pie= 3.14f;
        float area = 3.14f *(a*a);
        System.out.println("Area of circle is "+area);
    }
    public static void calArea(int l, int b)
    {
        int area = l*b;
        System.out.println("Area of rectangle is "+area);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square");
        int s=sc.nextInt();

        System.out.println("Enter the radius of circle");
        float r=sc.nextFloat();

        System.out.println("Enter length and bredth of the rectangle");
        int l=sc.nextInt();
        int b=sc.nextInt();

        calArea(s);
        calArea(r);
        calArea(l,b);
    }
    
}
