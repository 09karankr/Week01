import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a positive integer");
        int number = sc.nextInt();

        // Check if the input is valid
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;
            int i = number;

            // Calculate factorial using a while loop
            while (i  number) {
                factorial *= i;
                i--;
            }

         
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        sc.close();
    }
}
