import java.util.Scanner;

public class DistanceConverterFromYardsToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceFeet = scanner.nextDouble();

        double yards = distanceFeet *3;
        double miles = yards*1760;

        System.out.printf("Distance in yards: %.2f, Distance in miles: %.2f%n", yards, miles);
    }
}
