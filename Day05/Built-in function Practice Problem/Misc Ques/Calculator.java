import java.util.Scanner;

public class Calculator {

    // Function for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function for division
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Return NaN if division by zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Display the menu for operations
        System.out.println("\nSelect operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        // Get user's choice
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        double result = 0;

        // Perform the chosen operation
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }

        scanner.close();
    }
}