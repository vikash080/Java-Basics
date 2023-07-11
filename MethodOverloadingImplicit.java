public class MethodOverloadingImplicit {
    public static void main(String[] args) {
        int a= 10,b=20;
        float x= 10.5f, y= 20.5f;
        double p=100.5 , q= 200.5;

        System.out.println(add(a,b));
        System.out.println(add(x,y));
        System.out.println(add(p,q));
    }
    public static int add(int x,int y)
    {
        return x+y;
    }
    public static double add(double x, double y)

    {
        return x+y;
    }

}
