import java.util.Scanner;

public class TravelComputation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the starting city (fromCity): ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the transit city (viaCity): ");
        String viaCity = sc.nextLine();

        System.out.print("Enter the destination city (toCity): ");
        String toCity = sc.nextLine();

        
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double distanceFromToVia = sc.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double distanceViaToFinalCity = sc.nextDouble();

        
        System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = sc.nextInt();

        // Calculating total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

      
        System.out.println("\nThe Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity + 
                           " is " + totalDistance + " miles and " +
                           "the Total Time taken is " + totalTime + " minutes.");
    }
}
