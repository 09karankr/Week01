import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Initialize the total variable
        double total = 0.0;

        // Variable to store user input
        double userInput;

        // Loop to get user input until they enter 0
        do {
            System.out.print("Enter a number: ");
            userInput = scanner.nextDouble();

            // Add the input to the total if it's not 0
            if (userInput != 0) {
                total += userInput;
            }
        } while (userInput != 0); // Continue until the user enters 0

        
        System.out.println("The total sum is: " + total);

       
        scanner.close();
    }
}
