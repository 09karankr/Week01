import java.util.Scanner;

public class ArrayInputAndSum {
    public static void main(String[] args) {
        // Create a variable to store an array of 10 elements of type double
        double[] numbers = new double[10];
        // Variable to store the total
        double total = 0.0;
       
        int index = 0;

       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");

      
        while (true) {
            
            System.out.print("Enter number: ");
            double userInput = scanner.nextDouble();

            // Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break;
            }

            
            if (index == 10) {
                break;
            }

            // Assign the number to the array element and increment the index
            numbers[index] = userInput;
            index++;
        }

        // Loop through the array to calculate the total
        System.out.println("\nYou entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display the total value
        System.out.println("\nTotal sum of numbers: " + total);

       
        scanner.close();
    }
}
