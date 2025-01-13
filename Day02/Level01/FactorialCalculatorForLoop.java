import java.util.Scanner;

public class FactorialCalculatorForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int number = sc.nextInt();

        long factorial = 1;

        // Compute the factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is " + factorial);

        sc.close();
    }
}
