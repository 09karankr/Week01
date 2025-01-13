import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is valid
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1; // Initialize factorial
            int i = 1; // Initialize counter

            // Compute factorial using a while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        scanner.close(); // Close the scanner
    }
}
