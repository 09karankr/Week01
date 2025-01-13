import java.util.Scanner;

public class TriangularParkNumberOfRoundsRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the length of the first side in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side in meters: ");
        double side3 = scanner.nextDouble();

       
        double perimeter = side1 + side2 + side3;

      
        double totalDistance = 5000;

       
        int rounds = (int) Math.ceil(totalDistance / perimeter);   // Calculating the number of rounds

       
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
