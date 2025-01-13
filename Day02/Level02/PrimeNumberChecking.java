import java.util.Scanner;

public class PrimeNumberChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        // Check if the number is less than or equal to 1
        if (number <= 1) {
            isPrime = false; 
        } else {
            // Loop from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // Check if the number is divisible by any number till square root
                if (number % i == 0) {
                    isPrime = false; // The number is divisible, hence not prime
                    break; // Exit the loop as we found a divisor
                }
            }
        }

        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close(); 
    }
}
