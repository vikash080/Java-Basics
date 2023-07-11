import java.util.Scanner;

class Calclulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int addres = add(a, b);
        System.out.println("Sum is =" + addres);

        int subres = sub(a, b);
        System.out.println("Sub is =" + subres);

        int mulres = mul(a, b);
        System.out.println("Mul is =" + mulres);

        int divres = div(a, b);
        System.out.println("Sum is =" + divres);

    }

    public static int add(int x, int y) {
        int z = x + y;
        return z;
    }

    public static int sub(int x, int y) {
        int z = x - y;
        return z;
    }

    public static int mul(int x, int y) {
        int z = x * y;
        return z;
    }

    public static int div(int x, int y) {
        int z = x / y;
        return z;
    }

}
