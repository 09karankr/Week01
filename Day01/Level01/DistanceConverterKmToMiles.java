import java.util.Scanner;

public class DistanceConverterKmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double kilometers = input.nextDouble(); // Input for kilometers

        double ConvertFactor = 1.6; // Conversion factor 1 mile = 1.6 km
        double miles = kilometers / ConvertFactor; // Convert to miles

        System.out.println("The total miles is " + miles + " miles for the given " + kilometers + " km");
    }
}
