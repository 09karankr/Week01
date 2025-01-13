import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        // Check if the input is a natural number
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
             // sum formula of n natural number
            int sum = num * (num + 1) / 2;      

            // Compute sum using while loop
            int sumByWhile = 0;
            int i = 1;
            while (i <= num) {
                sumByWhile += i;
                i++;
            }

           
            System.out.println("Sum using formula: " + sum);
            System.out.println("Sum using while loop: " + sumByWhile);

            // Compare results
            if (sum == sumByWhile) {
                System.out.println("Both computations match");
            } else {
                System.out.println("Both computations does not match.");
            }
        }

       
        sc.close();
    }
}
