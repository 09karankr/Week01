import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Convert the number to its absolute value to handle negative numbers
        number = Math.abs(number);

        // Array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

       
        while (number > 0) {
            int digit = (int) (number % 10); // Get the last digit
            frequency[digit]++;            // Increment frequency for the digit
            number /= 10;                  // Remove the last digit
        }

       
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // Display only digits that appear in the number
                System.out.println(i + "\t" + frequency[i]);
            }
        }

        sc.close();
    }
}
