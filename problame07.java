public class problame07 {
    public static void main(String [] args)
    {
        double Avge = calculateAverage(85, 79, 91, 76, 88, 95, 80, 85);

        System.out.println(Avge);

        

    }

    public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8)
    {
        double sum = sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8;
        double avg = sum /8;
        return avg;
    }
}
