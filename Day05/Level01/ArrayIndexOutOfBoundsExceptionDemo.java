import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Attempting to access an invalid index...");
        // This will cause ArrayIndexOutOfBoundsException
        System.out.println(names[names.length]); // Accessing index out of bounds
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an index to access: ");
        int index = sc.nextInt();

        try {
            System.out.println("Accessing index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please provide a valid index.");
        } catch (RuntimeException e) {
            System.out.println("A runtime exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution of handleException method completed.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int numNames = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] names = new String[numNames];
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Call the method to generate the exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(names);
    }
}
