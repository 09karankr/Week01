import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the total variable
        double total = 0.0;

        // Infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = scanner.nextDouble();

            // Break the loop if the input is 0 or negative
            if (userInput <= 0) {
                break;
            }

            // Add the input to the total
            total += userInput;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner
        scanner.close();
    }
}
