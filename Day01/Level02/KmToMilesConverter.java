public class KmToMilesConverter {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double Conversion = 1.6;

        double miles = kilometers / Conversion;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
