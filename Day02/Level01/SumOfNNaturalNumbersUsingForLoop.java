import java.util.Scanner;

public class SumOfNNaturalNumbersUsingForLoop {
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

            // Compute sum using for loop
			 int sumByForLoop =0;
			for(int i =1; i<=num; i++){
			   sumByForLoop += i;
			}
           

           
            System.out.println("Sum using formula: " + sum);
            System.out.println("Sum using for loop: " + sumByForLoop);

            // Compare results
            if (sum == sumByForLoop) {
                System.out.println("Both computations match");
            } else {
                System.out.println("Both computations does not match.");
            }
        }

       
        sc.close();
    }
}
