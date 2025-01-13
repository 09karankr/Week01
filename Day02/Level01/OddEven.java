import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a number
        System.out.println("Enter a positive number: ");
        int number = sc.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Loop from 1 to the number entered by the user
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    // If the number is divisible by 2, it is even
                    System.out.println(i + " is even.");
                } else {
                    // If the number is not divisible by 2, it is odd
                    System.out.println(i + " is odd.");
                }
            }
        }

        sc.close();
    }
}
